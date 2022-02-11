package com.app.inventoryapp.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String artistName;

    @Column
    private String artistPhone;


    @ManyToOne
    @JoinColumn(name = "Category")
    private Category category;

    @OneToMany
    @JoinColumn(name = "Title")
    private List<Title> title;

    @OneToMany
    @JoinColumn(name = "Location")
    private List<Location> location;

    public Artist() {
    }

    public Artist(Long id, String artistName, String artistPhone) {
        this.id = id;
        this.artistName = artistName;
        this.artistPhone = artistPhone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistPhone() {
        return artistPhone;
    }

    public void setArtistPhone(String artistPhone) {
        this.artistPhone = artistPhone;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", artistName='" + artistName + '\'' +
                ", artistPhone='" + artistPhone + '\'' +
                '}';
    }



}
