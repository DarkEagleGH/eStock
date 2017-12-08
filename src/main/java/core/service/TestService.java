package core.service;

import core.dao.CategoryDao;
import core.dao.ItemDao;
import core.dao.ManufacturerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    private ItemDao itemDao;
    private ManufacturerDao manufacturerDao;
    private CategoryDao categoryDao;

    @Autowired
    public TestService(ItemDao itemDao, ManufacturerDao manufacturerDao, CategoryDao categoryDao) {
        this.itemDao = itemDao;
        this.manufacturerDao = manufacturerDao;
        this.categoryDao = categoryDao;
    }

    public String getMessage() {
        return itemDao.getSampleText();
    }

    public List getItems() {
        return itemDao.getAll();
    }
    public List getManufacturers() {
        return manufacturerDao.getAll();
    }
    public List getCategories() {
        return categoryDao.getAll();
    }
}
