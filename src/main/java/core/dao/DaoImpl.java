package core.dao;

import core.model.Category;
import core.model.Item;
import core.model.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Arrays;
import java.util.List;

import static core.dao.Sql.*;

@Repository
public class DaoImpl implements Dao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public DaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // ====================== GET ============================================

    @Override
    public List getAllItems() {
        return jdbcTemplate.query(SQL_ITEMS_GET_ALL.value(), new BeanPropertyRowMapper(Item.class));
    }

    @Override
    public Item getItemById(String id) {
        try {
            return (Item) jdbcTemplate.queryForObject(
                SQL_ITEMS_GET_BY_ID.value(), new Object[]{id}, new ItemRowMapper());
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List getAllManufacturers() {
        return jdbcTemplate.query(SQL_MANUFACTURERS_GET_ALL.value(), new BeanPropertyRowMapper(Manufacturer.class));
    }

    @Override
    public Manufacturer getManufacturerById(String id) {
        try {
            return (Manufacturer) jdbcTemplate.queryForObject(
                SQL_MANUFACTURERS_GET_BY_ID.value(), new Object[]{id}, new ManufacturerRowMapper());
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List getAllCategories() {
        return jdbcTemplate.query(
            SQL_CATEGORIES_GET_ALL.value(), new BeanPropertyRowMapper(Category.class));
    }

    @Override
    public Category getCategoryById(String id) {
        try {
            return (Category) jdbcTemplate.queryForObject(
                SQL_CATEGORIES_GET_BY_ID.value(), new Object[]{id}, new CategoryRowMapper());
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    // ====================== CREATE =========================================

    @Override
    @Transactional
    public String createItem(Item item) {
        try {
            jdbcTemplate.update(SQL_ITEMS_INSERT.value(), cutId(item.toArray()), new int[]{
                Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.DECIMAL, Types.VARCHAR, Types.INTEGER, Types.INTEGER});
            return "";
        } catch (DataIntegrityViolationException e) {
            return e.getMessage();
        }
    }

    @Override
    @Transactional
    public String createManufacturer(Manufacturer manufacturer) {
        try {
            jdbcTemplate.update(SQL_MANUFACTURERS_INSERT.value(), cutId(manufacturer.toArray()), new int[]{Types.VARCHAR});
            return "";
        } catch (DataIntegrityViolationException e) {
            return e.getMessage();
        }
    }

    @Override
    @Transactional
    public String createCategory(Category category) {
        try {
            jdbcTemplate.update(SQL_CATEGORIES_INSERT.value(), cutId(category.toArray()), new int[]{
                Types.INTEGER, Types.VARCHAR});
            return "";
        } catch (DataIntegrityViolationException e) {
            return e.getMessage();
        }
    }

    // ====================== DELETE =========================================

    @Override
    @Transactional
    public String deleteItemById(String id) {
        try {
            jdbcTemplate.update(SQL_ITEMS_DELETE.value(), id);
            return "";
        } catch (DataIntegrityViolationException e) {
            return e.getMessage();
        }
    }

    @Override
    @Transactional
    public String deleteManufacturerById(String id) {
        try {
            jdbcTemplate.update(SQL_MANUFACTURERS_DELETE.value(), id);
            return "";
        } catch (DataIntegrityViolationException e) {
            return e.getMessage();
        }
    }

    @Override
    @Transactional
    public String deleteCategoryById(String id) {
        try {
            jdbcTemplate.update(SQL_CATEGORIES_DELETE.value(), id);
            return "";
        } catch (DataIntegrityViolationException e) {
            return e.getMessage();
        }
    }

    // ====================== UPDATE =========================================

    @Override
    @Transactional
    public String updateItem(Item item) {
        try {
            jdbcTemplate.update(SQL_ITEMS_UPDATE.value(), shiftId(item.toArray()), new int[]{
                Types.VARCHAR, Types.VARCHAR, Types.INTEGER, Types.DECIMAL, Types.VARCHAR, Types.INTEGER, Types.INTEGER, Types.INTEGER});
            return "";
        } catch (DataIntegrityViolationException e) {
            return e.getMessage();
        }
    }

    @Override
    @Transactional
    public String updateManufacturer(Manufacturer manufacturer) {
        try {
            jdbcTemplate.update(SQL_MANUFACTURERS_UPDATE.value(), shiftId(manufacturer.toArray()), new int[]{
                Types.VARCHAR, Types.INTEGER});
            return "";
        } catch (DataIntegrityViolationException e) {
            return e.getMessage();
        }
    }

    @Override
    @Transactional
    public String updateCategory(Category category) {
        try {
            jdbcTemplate.update(SQL_CATEGORIES_UPDATE.value(), shiftId(category.toArray()), new int[]{
                Types.INTEGER, Types.VARCHAR, Types.INTEGER});
            return "";
        } catch (DataIntegrityViolationException e) {
            return e.getMessage();
        }
    }

    // ====================== MISC ===========================================

    private class ItemRowMapper implements RowMapper {
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Item item = new Item();
            item.setId(rs.getInt("ID"));
            item.setName(rs.getString("NAME"));
            item.setModel(rs.getString("MODEL"));
            item.setManufacturerId(rs.getInt("MANUFACTURER_ID"));
            item.setPrice(rs.getBigDecimal("PRICE"));
            item.setDescription(rs.getString("DESCRIPTION"));
            item.setQuantity(rs.getInt("QUANTITY"));
            item.setCategoryId(rs.getInt("CATEGORY_ID"));
            item.setCategory(rs.getString("CATEGORY"));
            item.setManufacturer(rs.getString("MANUFACTURER"));
            return item;
        }
    }

    private class ManufacturerRowMapper implements RowMapper {
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Manufacturer man = new Manufacturer();
            man.setId(rs.getInt("ID"));
            man.setName(rs.getString("NAME"));
            return man;
        }
    }

    private class CategoryRowMapper implements RowMapper {
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Category cat = new Category();
            cat.setId(rs.getInt("ID"));
            cat.setName(rs.getString("NAME"));
            cat.setParentId(rs.getInt("PARENT_ID"));
            return cat;
        }
    }

    /**
     * Delete 'id' from array to use in INSERT clause if id's are generated automatically
     * @param array of properties
     * @return array
     */
    private Object[] cutId(Object[] array) {
        return Arrays.copyOfRange(array, 1, array.length);
    }

    /**
     * Shift 'id' in array from first index to last for use in WHERE clause
     * @param array of properties
     * @return same array with shifted id
     */
    private Object[] shiftId(Object[] array) {
        Object id = array[0];
        Object[] shifted = new Object[array.length];
        System.arraycopy(array, 1, shifted, 0, array.length - 1);
        shifted[shifted.length - 1] = id;
        return shifted;
    }
}
