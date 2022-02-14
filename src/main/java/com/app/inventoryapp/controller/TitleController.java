package com.app.inventoryapp.controller;

import com.app.inventoryapp.service.LocationService;
import com.app.inventoryapp.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(path = "/api")
public class TitleController {

    private TitleService titleService;

    @Autowired
    public void setTitleService (TitleService titleService) {
        this.titleService = titleService;
    }


    @GetMapping(path = "/title/{titleId}")
    public String getTitle(@PathVariable Long titleId) {
        return "getting the title with the id of " + titleId;
    }

    @PostMapping("/title/")
    public String createTitle(@RequestBody String body) {
        return "creating a title " + body;
    }


}