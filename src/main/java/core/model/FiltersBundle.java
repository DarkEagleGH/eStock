package core.model;

import java.util.List;

public class FiltersBundle {
    private boolean inStockOnly;
    private List<FilterItem> categories;
    private List<FilterItem> manufacturers;

    public FiltersBundle() {
    }

    public boolean isInStockOnly() {
        return inStockOnly;
    }

    public void setInStockOnly(boolean inStockOnly) {
        this.inStockOnly = inStockOnly;
    }

    public List<FilterItem> getCategories() {
        return categories;
    }

    public void setCategories(List<FilterItem> categories) {
        this.categories = categories;
    }

    public List<FilterItem> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<FilterItem> manufacturers) {
        this.manufacturers = manufacturers;
    }
}
