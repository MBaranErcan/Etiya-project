package com.etiya.project.controllers;

import com.etiya.project.services.CustOrdCharValService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustOrdCharValController {

    private CustOrdCharValService custOrdCharValService;

    public CustOrdCharValController(CustOrdCharValService custOrdCharValService) {
        this.custOrdCharValService = custOrdCharValService;
    }




}
