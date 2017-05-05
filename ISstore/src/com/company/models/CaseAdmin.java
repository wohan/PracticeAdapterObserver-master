package com.company.models;

/**
 * Created by admin on 20.04.2017.
 */
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by admin on 20.04.2017.
 */
@XmlRootElement(name = "listCase")
@XmlAccessorType(XmlAccessType.FIELD)

// Класс обвертка для записи данных  в XML файл и выбора информации из него.
public class CaseAdmin {
    @XmlElement(name = "listCase")
    public ArrayList<Admin> listCase;

    public CaseAdmin(ArrayList<Admin> listCase) {
        this.listCase = listCase;
    }

    public CaseAdmin() {}

    public ArrayList<Admin> getListCase() {
        return listCase;
    }

    public void setListCase(ArrayList<Admin> listCase) {
        this.listCase = listCase;
    }
}