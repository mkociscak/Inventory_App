package com.app.inventoryapp.service;

import com.app.inventoryapp.exceptions.InformationExistException;
import com.app.inventoryapp.exceptions.InformationNotFoundException;
import com.app.inventoryapp.model.Location;
import com.app.inventoryapp.model.Title;
import com.app.inventoryapp.repository.LocationRepository;
import com.app.inventoryapp.repository.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TitleService {

    private TitleRepository titleRepository;

    @Autowired
    public void setTitleRepository (TitleRepository titleRepository) {
        this.titleRepository = titleRepository;
    }

    public Optional<Title> getTitle(Long titleId) {
        System.out.println("getting one Title ==>");

        Optional<Title> title = titleRepository.findById(titleId);
        if (title.isPresent()) {
            return title;
        } else {
            throw new InformationNotFoundException("title with id " + titleId + " not found");
        }
    }
}
