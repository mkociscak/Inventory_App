package com.app.inventoryapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Title")
public class Title {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long titleId;

    @Column
    private String titleName;

    @Column
    private Integer titleYear;

    @ManyToOne
    @JoinColumn(name = "Artist")
    private Artist artist;

    @OneToOne
    @JoinColumn(name = "Location")
    private Location location;


    public Title() {
    }

    public Title(Long titleId, String titleName, Integer titleYear) {
        this.titleId = titleId;
        this.titleName = titleName;
        this.titleYear = titleYear;
    }

    public Long getTitleId() {
        return titleId;
    }

    public void setTitleId(Long titleId) {
        this.titleId = titleId;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public Integer getTitleYear() {
        return titleYear;
    }

    public void setTitleYear(Integer titleYear) {
        this.titleYear = titleYear;
    }

    @Override
    public String toString() {
        return "Title{" +
                "titleId=" + titleId +
                ", titleName='" + titleName + '\'' +
                ", titleYear=" + titleYear +
                '}';
    }
}
