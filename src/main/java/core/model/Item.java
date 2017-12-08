package core.model;

import java.math.BigDecimal;
import java.sql.Clob;

public class Item {
    private int id;
    private String name;
    private String model;
    private int manufacturerId;
    private BigDecimal price;
    private Clob description;
    private int quantity;
    private int categoryId;

    public Item(int id, String name, String model, int manufacturerId, BigDecimal price, Clob description, int quantity, int categoryId) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.manufacturerId = manufacturerId;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Clob getDescription() {
        return description;
    }

    public void setDescription(Clob description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
