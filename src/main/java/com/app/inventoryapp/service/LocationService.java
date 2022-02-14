package com.app.inventoryapp.service;

import com.app.inventoryapp.exceptions.InformationNotFoundException;
import com.app.inventoryapp.model.Category;
import com.app.inventoryapp.model.Location;
import com.app.inventoryapp.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public void setLocationRepository (LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Optional<Location> getLocation(Long locationId) {
        Optional<Location> location = locationRepository.findById(locationId);
        System.out.println("getting one Category ==>");
        if (location.isPresent()) {
            return location;
        } else {
            throw new InformationNotFoundException("location with id " + locationId + " not found");
        }
    }
}
