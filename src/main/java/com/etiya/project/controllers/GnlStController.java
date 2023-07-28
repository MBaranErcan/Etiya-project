package com.etiya.project.controllers;

import com.etiya.project.services.GnlStService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GnlStController {

    private GnlStService gnlStService;

    public GnlStController(GnlStService gnlStService) {
        this.gnlStService = gnlStService;
    }
}
