package com.etiya.project.services;

import com.etiya.project.repository.CustOrdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustOrdService {

    @Autowired
    private CustOrdRepository custOrdRepository;

}
