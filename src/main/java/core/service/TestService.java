package core.service;

import core.dao.ItemDao;
import core.dao.ManufacturerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

//    @Autowired
    private ItemDao itemDao;

//    @Autowired
    private ManufacturerDao manufacturerDao;

    @Autowired
    public TestService(ItemDao itemDao, ManufacturerDao manufacturerDao) {
        this.itemDao = itemDao;
        this.manufacturerDao = manufacturerDao;
    }

    public String getMessage() {
        return itemDao.getSampleText();
    }

    public List getList() {
        return manufacturerDao.getAll();
    }
}
