package core.dao;

import core.model.Manufacturer;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ManufacturerDao extends DaoAbstract {
    private final String SQL_GET_ALL = "SELECT * FROM MANUFACTURERS ORDER BY ID";

    public String getSampleText() {
        return "Sample text";
    }

    public List getAll() {
        return getJdbcTemplate().query(SQL_GET_ALL, new BeanPropertyRowMapper(Manufacturer.class));
    }
}
