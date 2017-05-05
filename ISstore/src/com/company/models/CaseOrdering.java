package com.company.models;

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
public class CaseOrdering{
    @XmlElement(name = "listCase")
    public ArrayList<Ordering> listCase;

    public CaseOrdering(ArrayList<Ordering> listCase) {
        this.listCase = listCase;
    }

    public CaseOrdering() {
    }

    public ArrayList<Ordering> getListCase() {
        return listCase;
    }

    public void setListCase(ArrayList<Ordering> listCase) {
        this.listCase = listCase;
    }
}
