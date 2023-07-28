package com.etiya.project.controllers;

import com.etiya.project.services.ProdOfrCharValService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdOfrCharValController {

    private ProdOfrCharValService prodOfrCharValService;

    @Autowired
    public ProdOfrCharValController(ProdOfrCharValService prodOfrCharValService) {
        this.prodOfrCharValService = prodOfrCharValService;
    }




}
