package com.app.inventoryapp.controller;

import com.app.inventoryapp.model.Category;
import com.app.inventoryapp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/api")

public class LocationController {


//Category Repo

//END Category Repo

    @GetMapping(path = "/locations/")
    public String getAllLocations() {
        return "get all locations";
    }


    @GetMapping(path = "/locations/{locationId}")
    public String getLocation(@PathVariable Long locationId) {
        return "getting the location with the id of " + locationId;
    }

    @PostMapping("/locations/")
    public String createLocation(@RequestBody String body) {
        return "creating a location " + body;
    }

    @PutMapping("locations/{locationId}")
    public String updateLocation(@PathVariable(value = "locationId") Long locationId, @RequestBody String body) {
        return "updating the location with the id of " + locationId + body;
    }

    @DeleteMapping("locations/{locationId}")
    public String deleteLocation(@PathVariable(value = "locationId") Long locationId) {
        return "deleting the location with the id of " + locationId;
    }
}