package com.company.models;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by admin on 18.04.2017.
 */
@XmlRootElement
public class Buyer1 {

    public Buyer1(int id, String user_name, String user_pass, int phone) {
        this.id = id;
        this.user_name = user_name;
        this.user_pass = user_pass;
        this.phone = phone;
    }
    @XmlElement
    public int getId() {
        return id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public int getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_pass(String user_pass) {
        this.user_pass = user_pass;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    private int id;
    private String user_name;
    private String user_pass;
    private int phone;

}
