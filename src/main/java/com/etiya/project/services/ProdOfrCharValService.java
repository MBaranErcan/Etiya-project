package com.etiya.project.services;

import com.etiya.project.repository.ProdOfrCharValRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdOfrCharValService {

    @Autowired
    private ProdOfrCharValRepository prodOfrCharValRepository;


}
