package core.service;

import core.dao.Dao;
import core.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainService {
    private Dao dao;

    @Autowired
    public MainService(Dao dao) {
        this.dao = dao;
    }

    // ====================== GET ============================================

    public List getAllItems() {
        return setItemValues(dao.getAllItems());
    }

    public List getFilteredItems(FiltersBundle bundle) {
        // filtration
        return setItemValues(dao.getAllItems());
    }

    public Item getItemById(String id) {
        return setItemValues(dao.getItemById(id));
    }

    public List getAllManufacturers() {
        return dao.getAllManufacturers();
    }

    public Manufacturer getManufacturerById(String id) {
        return dao.getManufacturerById(id);
    }

    public List getAllCategories() {
        return dao.getAllCategories();
    }

    public Category getCategoryById(String id) {
        return dao.getCategoryById(id);
    }

    // ====================== CREATE =========================================

    public String createItem(Item item) {
        return dao.createItem(item);
    }

    public String createManufacturer(Manufacturer manufacturer) {
        return dao.createManufacturer(manufacturer);
    }

    public String createCategory(Category category) {
        return dao.createCategory(category);
    }
    // ====================== DELETE =========================================

    public String deleteItem(Item item) {
        return dao.deleteItemById(String.valueOf(item.getId()));
    }

    public String deleteItemById(String id) {
        return dao.deleteItemById(id);
    }

    public String deleteManufacturer(Manufacturer manufacturer) {
        return dao.deleteManufacturerById(String.valueOf(manufacturer.getId()));
    }

    public String deleteManufacturerById(String id) {
        return dao.deleteManufacturerById(id);
    }

    public String deleteCategory(Category category) {
        return dao.deleteCategoryById(String.valueOf(category.getId()));
    }

    public String deleteCategoryById(String id) {
        return dao.deleteCategoryById(id);
    }

    // ====================== UPDATE =========================================

    public String updateItem(Item item) {
        return dao.updateItem(item);
    }

    public String updateManufacturer(Manufacturer manufacturer) {
        return dao.updateManufacturer(manufacturer);
    }

    public String updateCategory(Category category) {
        return dao.updateCategory(category);
    }

    // ====================== MISC ===========================================

    private void setAvailable(Item item) {
        item.setAvailableInStock(item.getQuantity() > 0);
    }

    private List<Item> setItemValues(List<Item> list) {
        list.forEach(this::setAvailable);
        return list;
    }

    private Item setItemValues(Item item) {
        setAvailable(item);
        return item;
    }

    public FiltersBundle prepareNewBundle() {
        FiltersBundle bundle = new FiltersBundle();
        bundle.setInStockOnly(false);

        List<FilterItem> filterList = new ArrayList<>();
        List<Manufacturer> manList = getAllManufacturers();
        for (Manufacturer manufacturer : manList) {
            filterList.add(new FilterItem(manufacturer.getId(), 0, manufacturer.getName(), false));
        }
        bundle.setManufacturers(filterList);

        filterList = new ArrayList<>();
        List<Category> catList = getAllCategories();
        for (Category category : catList) {
            filterList.add(new FilterItem(category.getId(), category.getParentId(), category.getName(), false));
        }
        bundle.setCategories(filterList);

        return bundle;
    }
}
