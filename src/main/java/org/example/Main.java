package org.example;

//Створіть клас, використовуючи JAXB, де опишіть ієрархію XML файлу. Необхідно, щоб проект створював XML-файл
// і будував дерево (місто, назва вулиці, будинок). У місті використовуйте аттрибут (наприклад, <city size=”big>Kiev</city>).

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        City city  = new City("big", "Kyiv");
        city.add(new Street(10, "Khreshatyk"));

        try {
            // Створюємо файл
            File file = new File("D:\\JAVA\\TestCatalog\\src\\main\\java\\org\\example\\output.xml");
            // Викликаємо статичний метод JAXBContext
            JAXBContext jaxbContext = JAXBContext.newInstance(City.class);
            // Повертає об'єкт класу Marshaller, щоб трансформувати об'єкт
            Marshaller mar = jaxbContext.createMarshaller();

            // Читабельне форматування
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Записуємо у файл, marshal(з пам'яті, у файл)
            mar.marshal(city, file);
            mar.marshal(city, System.out);

            // Зчитуємо з файлу
            Unmarshaller unmar = jaxbContext.createUnmarshaller();
            city = (City) unmar.unmarshal(file);
            System.out.println(city);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}











