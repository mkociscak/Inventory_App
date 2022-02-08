package com.app.inventoryapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Title {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String title;

    @Column
    private Integer year;


    public Title() {
    }

    public Title(Long id, String title, Integer year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }


}
