package core.dao;

import core.model.Category;
import core.model.Item;
import core.model.Manufacturer;

import java.util.List;

public interface Dao {

    // ====================== GET ============================================

    List getAllItems();

    Item getItemById(String id);

    List getAllManufacturers();

    Manufacturer getManufacturerById(String id);

    List getAllCategories();

    Category getCategoryById(String id);

    // ====================== CREATE =========================================

    String createItem(Item item);

    String createManufacturer(Manufacturer manufacturer);

    String createCategory(Category category);

    // ====================== DELETE =========================================

    String deleteItemById(String id);

    String deleteManufacturerById(String id);

    String deleteCategoryById(String id);

    // ====================== UPDATE =========================================

    String updateItem(Item item);

    String updateManufacturer(Manufacturer manufacturer);

    String updateCategory(Category category);
}
