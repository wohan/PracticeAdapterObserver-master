package com.company.models;
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.04.19 at 06:00:46 PM MSK
//

        import javax.xml.bind.annotation.XmlAccessType;
        import javax.xml.bind.annotation.XmlAccessorType;
        import javax.xml.bind.annotation.XmlElement;
        import javax.xml.bind.annotation.XmlRootElement;
        import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id_buyer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
/* Класс заказы содержит данные о заказах покупателей и методы вводы вывода информации о них  */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "idBuyer",
        "id",
        "data",
        "description"
})
@XmlRootElement(name = "ordering")
public class Ordering {

    @XmlElement(name = "id_buyer", required = true)
    protected Integer idBuyer;   //ссылка на покупателя размествшего заказ
    @XmlElement(required = true)
    protected Integer id;
    @XmlElement(required = true)
    protected Integer data;
    @XmlElement(required = true)
    protected String description;

    /**
     * Gets the value of the idBuyer property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getIdBuyer() {
        return idBuyer;
    }

    /**
     * Sets the value of the idBuyer property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setIdBuyer(Integer value) {
        this.idBuyer = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the data property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setData(Integer value) {
        this.data = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
