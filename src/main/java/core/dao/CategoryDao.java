package core.dao;

import core.model.Category;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDao extends DaoAbstract {
    private final String SQL_GET_ALL = "SELECT * FROM CATEGORIES ORDER BY ID";

    public String getSampleText() {
        return "Sample text";
    }

    public List getAll() {
        return getJdbcTemplate().query(SQL_GET_ALL, new BeanPropertyRowMapper(Category.class));
    }
}
