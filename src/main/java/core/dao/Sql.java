package core.dao;

enum Sql {
    // ====================== GET ============================================
    SQL_ITEMS_GET_ALL(
        " SELECT i.ID, i.NAME, i.MODEL, i.MANUFACTURER_ID, i.PRICE, i.DESCRIPTION, i.QUANTITY, i.CATEGORY_ID, " +
        " c.NAME as CATEGORY, m.NAME as MANUFACTURER " +
        " FROM ITEMS i " +
        " INNER JOIN CATEGORIES c ON ( i.CATEGORY_ID = c.ID ) " +
        " INNER JOIN MANUFACTURERS m ON ( i.MANUFACTURER_ID = m.ID ) "),

    SQL_ITEMS_GET_BY_ID(
        " SELECT i.ID, i.NAME, i.MODEL, i.MANUFACTURER_ID, i.PRICE, i.DESCRIPTION, i.QUANTITY, i.CATEGORY_ID, " +
        " c.NAME as CATEGORY, m.NAME as MANUFACTURER " +
        " FROM ITEMS i " +
        " INNER JOIN CATEGORIES c ON ( i.CATEGORY_ID = c.ID ) " +
        " INNER JOIN MANUFACTURERS m ON ( i.MANUFACTURER_ID = m.ID ) " +
        " WHERE i.ID = ? "),

    SQL_MANUFACTURERS_GET_ALL("SELECT * FROM MANUFACTURERS ORDER BY ID"),

    SQL_MANUFACTURERS_GET_BY_ID("SELECT * FROM MANUFACTURERS WHERE ID = ? ORDER BY ID"),

    SQL_CATEGORIES_GET_ALL("SELECT * FROM CATEGORIES ORDER BY ID"),

    SQL_CATEGORIES_GET_BY_ID("SELECT * FROM CATEGORIES WHERE ID = ? ORDER BY ID"),

    // ====================== CREATE =========================================

    SQL_ITEMS_INSERT(
        " INSERT INTO ITEMS " +
        " (NAME, MODEL, MANUFACTURER_ID, PRICE, DESCRIPTION, QUANTITY, CATEGORY_ID) " +
        " VALUES (?, ?, ?, ?, ?, ?, ?)"),

    SQL_MANUFACTURERS_INSERT("INSERT INTO MANUFACTURERS (NAME) VALUES (?)"),

    SQL_CATEGORIES_INSERT("INSERT INTO CATEGORIES (PARENT_ID, NAME) VALUES (?, ?)"),

    // ====================== DELETE =========================================

    SQL_ITEMS_DELETE("DELETE FROM ITEMS WHERE ID = ?"),

    SQL_MANUFACTURERS_DELETE("DELETE FROM MANUFACTURERS WHERE ID = ?"),

    SQL_CATEGORIES_DELETE("DELETE FROM CATEGORIES WHERE ID = ?"),

    // ====================== UPDATE =========================================

    SQL_ITEMS_UPDATE(
        " UPDATE ITEMS " +
        " SET NAME = ?, MODEL = ?, MANUFACTURER_ID = ?, PRICE = ?, DESCRIPTION = ?, QUANTITY = ?, CATEGORY_ID = ? " +
        " WHERE ID = ?"),

    SQL_MANUFACTURERS_UPDATE("UPDATE MANUFACTURERS SET NAME = ? WHERE ID = ?"),

    SQL_CATEGORIES_UPDATE("UPDATE CATEGORIES SET PARENT_ID = ?, NAME = ? WHERE ID = ?");

    // ======================        =========================================

    private String sql;

    Sql(String sql) {
        this.sql = sql;
    }

    public String value() {
        return sql;
    }

}
