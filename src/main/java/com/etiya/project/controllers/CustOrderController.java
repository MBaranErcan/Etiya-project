package com.etiya.project.controllers;

import com.etiya.project.services.CustOrdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustOrderController {

    private CustOrdService custOrdService;

    @Autowired
    public CustOrderController(CustOrdService custOrdService) {
        this.custOrdService = custOrdService;
    }
}
