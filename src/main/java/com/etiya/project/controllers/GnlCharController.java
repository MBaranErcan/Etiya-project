package com.etiya.project.controllers;

import com.etiya.project.services.GnlCharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GnlCharController {

    private GnlCharService gnlCharService;

    @Autowired
    public GnlCharController(GnlCharService gnlCharService) {
        this.gnlCharService = gnlCharService;
    }
}
