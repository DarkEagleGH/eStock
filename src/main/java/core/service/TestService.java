package core.service;

import core.dao.ItemDao;
import core.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private ItemDao itemDao;

    @Autowired
    public TestService(ItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public String getMessage() {
        return itemDao.getSampleText();
    }
}
