package com.app.inventoryapp.model;
//getters & setters for tables

import javax.persistence.*;
import java.util.List;

@Entity

public class Location {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String locationName;

    @Column
    private String city;

    @Column
    private String phone;



    public Location() {
    }

    public Location(Long id, String locationName, String city, String phone) {
        this.id = id;
        this.locationName = locationName;
        this.city = city;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", locationName='" + locationName + '\'' +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }



}
