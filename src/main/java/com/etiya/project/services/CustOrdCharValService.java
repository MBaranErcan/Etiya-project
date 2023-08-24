package com.etiya.project.services;

import com.etiya.project.repository.CustOrdCharValRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustOrdCharValService {

    @Autowired
    private CustOrdCharValRepository custOrdCharValRepository;
}
