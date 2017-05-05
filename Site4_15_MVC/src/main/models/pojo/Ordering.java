package main.models.pojo;

/**
 * Created by admin on 21.04.2017.
 */
public class Ordering {

    public Ordering() {
    }

    public Ordering(int id, int id_buyer, int data, String description) {
        this.id = id;
        this.id_buyer = id_buyer;
        this.data = data;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getId_buyer() {
        return id_buyer;
    }

    public int getData() {
        return data;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_buyer(int id_buyer) {
        this.id_buyer = id_buyer;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private int id;
    private int id_buyer;
    private int data;
    private String description;

}
