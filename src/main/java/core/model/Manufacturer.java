package core.model;

import java.util.HashMap;
import java.util.Map;

public class Manufacturer {
    private int id;
    private String name;

    public Manufacturer() {
    }

    public Manufacturer(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Object[] toArray() {
        return new Object[]{
            this.id,
            this.name};
    }
}
