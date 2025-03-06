package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "street")
public class Street {

    @XmlElement
    private String name;

    @XmlElement
    private int house;

    public Street() {}

    public Street(int house, String name){
        this.house = house;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Street{" +
                "name='" + name + '\'' +
                ", house=" + house +
                '}';
    }
}
