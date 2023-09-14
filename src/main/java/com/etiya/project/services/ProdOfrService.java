package com.etiya.project.services;

import com.etiya.project.repository.ProdOfrRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProdOfrService {

    @Autowired
    private ProdOfrRepository prodOfrRepository;


}
