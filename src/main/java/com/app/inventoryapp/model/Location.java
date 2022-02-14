package com.app.inventoryapp.model;
//getters & setters for tables

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long locationId;

    @Column
    private String locationName;

    @Column
    private String city;

    @Column
    private String locationPhone;

    @ManyToOne
    @JoinColumn(name = "Artist")
    private Artist artist;

    @OneToOne
    @JoinColumn(name = "Title")
    private Title title;

    public Location() {
    }

    public Location(Long locationId, String locationName, String city, String locationPhone) {
        this.locationId = locationId;
        this.locationName = locationName;
        this.city = city;
        this.locationPhone = locationPhone;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
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

    public String getLocationPhone() {
        return locationPhone;
    }

    public void setLocationPhone(String locationPhone) {
        this.locationPhone = locationPhone;
    }


    @Override
    public String toString() {
        return "Location{" +
                "locationId=" + locationId +
                ", locationName='" + locationName + '\'' +
                ", city='" + city + '\'' +
                ", locationPhone='" + locationPhone + '\'' +
                '}';
    }

}



