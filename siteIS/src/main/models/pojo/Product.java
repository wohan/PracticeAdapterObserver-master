package main.models.pojo;

/**
 * Created by admin on 21.04.2017.
 */
public class Product {

    public Product(int id, int id_ordering, String name, int quantity) {
        this.id = id;
        this.id_ordering = id_ordering;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public int getId_ordering() {
        return id_ordering;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_ordering(int id_ordering) {
        this.id_ordering = id_ordering;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int id;
    private int id_ordering;
    private String name;
    private int quantity;
}
