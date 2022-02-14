package com.app.inventoryapp.service;

import com.app.inventoryapp.model.Artist;
import com.app.inventoryapp.model.Category;
import com.app.inventoryapp.repository.ArtistRepository;
import com.app.inventoryapp.exceptions.InformationNotFoundException;
import com.app.inventoryapp.exceptions.InformationExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ArtistService {

    private ArtistRepository artistRepository;

    @Autowired //(@Qualifier(value = "Artist")
    public void setArtistRepository (ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    //get Artist
    public List<Artist> getAllArtists() {
        List<Artist> artistName = artistRepository.findAll();
        System.out.println("getting all Artists");
        if (artistName.isEmpty()) {
            throw new InformationNotFoundException("no matching artist found");
        } else {
            return artistRepository.findAll();
        }
    }

    public Optional<Artist> getArtistName(String artistName) {
        Optional<Artist> artist = Optional.ofNullable(artistRepository.findByArtistName(artistName));
        System.out.println("getting one Artist ==>");
        if (artist.isPresent()) {
            return artist;
        } else {
            throw new InformationNotFoundException("Artist with name " + artistName + " not found");
        }
    }

    //create new
    public Artist createArtist(Artist artistObject) {
        System.out.println("service running createArtist ==>");
        Artist artist = artistRepository.findByArtistName(artistObject.getArtistName());
        if (artist != null) {
            throw new InformationExistException("artist with name " + artist.getArtistName() + " already exists");
        } else {
            return artistRepository.save(artistObject);
        }
    }

}
