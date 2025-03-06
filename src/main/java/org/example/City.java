package org.example;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "city")
public class City {

    @XmlElement
    private String name;

    @XmlAttribute
    private String size;

    @XmlElement(name = "street")
    private List<Street> streets = new ArrayList<>();

    public void add(Street street) {
        streets.add(street);
    }

    public City(){}

    public City(String size, String name){
        this.size = size;
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", streets=" + Arrays.deepToString(streets.toArray()) +
                '}';
    }
    }
