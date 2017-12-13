package core.model;

public class FilterItem {
    private int id;
    private int parent_id;
    private String name;
    private boolean checked;

    public FilterItem() {
    }

    public FilterItem(int id, int parent_id, String name, boolean checked) {
        this.id = id;
        this.parent_id = parent_id;
        this.name = name;
        this.checked = checked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
