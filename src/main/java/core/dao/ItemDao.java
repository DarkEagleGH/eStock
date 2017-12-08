package core.dao;

import core.model.Item;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemDao extends DaoAbstract {
    private final String SQL_GET_ALL = "SELECT * FROM ITEMS ORDER BY ID";

    public String getSampleText() {
        return "Sample text";
    }

    public List getAll() {
        return getJdbcTemplate().query(SQL_GET_ALL, new BeanPropertyRowMapper(Item.class));
    }
}
