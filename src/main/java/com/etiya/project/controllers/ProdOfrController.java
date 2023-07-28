package com.etiya.project.controllers;

import com.etiya.project.services.ProdOfrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdOfrController {

    private ProdOfrService prodOfrService;

    @Autowired
    public ProdOfrController(ProdOfrService prodOfrService) {
        this.prodOfrService = prodOfrService;
    }


}
