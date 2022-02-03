package com.app.inventoryapp.controller;

import com.app.inventoryapp.model.Artist;
//import com.app.inventoryapp.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(path = "/api")
public class ArtistController {

//Category Repo
//END Category Repo


    @GetMapping(path = "/artists/")
    public String getAllArtists() {
        return "get all artists";
    }


    @GetMapping(path = "/artists/{artistId}")
    public String getArtist(@PathVariable Long artistId) {
        return "getting the artist with the id of " + artistId;
    }

    @PostMapping("/artists/")
    public String createArtist(@RequestBody String body) {
        return "creating an artist " + body;
    }

    @PutMapping("/artists/{artistId}")
    public String updateArtist(@PathVariable(value = "artistId") Long artistId, @RequestBody String body) {
        return "updating the artist with the id of " + artistId + body;
    }

    @DeleteMapping("/artists/{artistId}")
    public String deleteArtist(@PathVariable(value = "artistId") Long artistId) {
        return "deleting the artist with the id of " + artistId;
    }

}
