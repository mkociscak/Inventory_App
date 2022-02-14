package com.app.inventoryapp.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long artistId;

    @Column
    private String artistName;

    @Column
    private String artistPhone;


    @ManyToOne
    @JoinColumn(name = "categoryName")
    private Category categoryName;

    @OneToMany//(mappedBy = "Artist", orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "titleName")
    private List<Title> title;

    @OneToMany
    @JoinColumn(name = "locationName")
    private List<Location> location;

    public Artist() {
    }

    public Artist(Long artistId, String artistName, String artistPhone) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistPhone = artistPhone;
    }

    public Long getArtistId() {
        return artistId;
    }

    public void setArtistId(Long artistId) {
        this.artistId = artistId;
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
                "artistId=" + artistId +
                ", artistName='" + artistName + '\'' +
                ", artistPhone='" + artistPhone + '\'' +
                ", categoryName=" + categoryName +
                '}';
    }
}




