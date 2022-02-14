package com.app.inventoryapp.controller;

import com.app.inventoryapp.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(path = "/api")
public class LocationController {

    private LocationService locationService;

    @Autowired
    public void setLocationService (LocationService locationService) {
        this.locationService = locationService;
    }


    @GetMapping(path = "/location/")
    public String getAllLocations() {
        return "get all locations";
    }


    @GetMapping(path = "/location/{locationId}")
    public String getLocation(@PathVariable Long locationId) {
        return "getting the location with the id of " + locationId;
    }

    @PostMapping("/location/")
    public String createLocation(@RequestBody String body) {
        return "creating a location " + body;
    }

    @PutMapping("location/{locationId}")
    public String updateLocation(@PathVariable(value = "locationId") Long locationId, @RequestBody String body) {
        return "updating the location with the id of " + locationId + body;
    }

    @DeleteMapping("locations/{locationId}")
    public String deleteLocation(@PathVariable(value = "locationId") Long locationId) {
        return "deleting the location with the id of " + locationId;
    }
}