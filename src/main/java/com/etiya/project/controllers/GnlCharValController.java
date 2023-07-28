package com.etiya.project.controllers;

import com.etiya.project.services.GnlCharValService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GnlCharValController {

    GnlCharValService gnlCharValService;

    @Autowired
    public GnlCharValController(GnlCharValService gnlCharValService) {
        this.gnlCharValService = gnlCharValService;
    }
}
