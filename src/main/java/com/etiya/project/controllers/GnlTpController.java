package com.etiya.project.controllers;

import com.etiya.project.services.GnlTpService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GnlTpController {

    private GnlTpService gnlTpService;

    public GnlTpController(GnlTpService gnlTpService) {
        this.gnlTpService = gnlTpService;
    }
}
