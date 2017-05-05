package com.company.models;
import java.io.File;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * Created by admin on 19.04.2017.
 */
public class ObjectAndXML {

    // Метод конвертации из Object  в XML  , входящие праметры pathFile - файл, object -  обьекn c данными.
    public static void metObjectToXML(String pathFile, Object object) throws JAXBException {
        File file;
        JAXBContext jaxbContext;
        Marshaller marshaller;

        file = new File(pathFile);
        jaxbContext = JAXBContext.newInstance(object.getClass());
        marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(object, file);
        marshaller.marshal(object, System.out);
    }
    // Метод конвертации из XML  в Object  , входящие праметры pathFile - файл, clazz - класс обьекта.
    public static Object metXMLToObject(String pathFile, Class clazz) throws JAXBException {
        File file;
        JAXBContext jaxbContext;
        Unmarshaller unmarshaller;
        Object object;

        file = new File(pathFile);
        jaxbContext = JAXBContext.newInstance(clazz);
        unmarshaller= jaxbContext.createUnmarshaller();
        object = unmarshaller.unmarshal(file);
        return object;
    }
}
