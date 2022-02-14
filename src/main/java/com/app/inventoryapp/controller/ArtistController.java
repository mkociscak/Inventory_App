package com.app.inventoryapp.controller;

import com.app.inventoryapp.model.Artist;
import com.app.inventoryapp.model.Category;
import com.app.inventoryapp.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import com.app.inventoryapp.repository.ArtistRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.HashMap;


@RestController
@RequestMapping(path = "/api")
public class ArtistController {

    private ArtistService artistService;

    @Autowired
    public void setArtistService (ArtistService artistService) {
        this.artistService = artistService;
    }

//endpoint http://localhost:9092/api/
    @GetMapping(path = "/artist/")
    public List<Artist> getAllArtists() {
     System.out.println("getting all Artists");
     return artistService.getAllArtists();
    }
//Optional
    @GetMapping(path = "/artist/{artistName}")
    public Optional<Artist> findByArtistName(@PathVariable String artistName) {
        System.out.println("getting one Artist");
        return artistService.getArtistName(artistName);
    }

//create new
    @PostMapping("/artist/")
    public Artist createArtist(@RequestBody Artist artistObject) {
        System.out.println("creating an artist ");
        return artistService.createArtist(artistObject);
    }

    @PutMapping("/artist/{artistId}")
    public String updateArtist(@PathVariable(value = "artistId") Long artistId, @RequestBody String body) {
        return "updating the artist with the id of " + artistId + body;
    }

    @DeleteMapping("/artist/{artistId}")
    public String deleteArtist(@PathVariable(value = "artistId") Long artistId) {
        return "deleting the artist with the id of " + artistId;
    }

}
