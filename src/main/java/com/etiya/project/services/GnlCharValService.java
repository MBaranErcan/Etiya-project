package com.etiya.project.services;

import com.etiya.project.repository.GnlCharValRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GnlCharValService {

    @Autowired
    private GnlCharValRepository gnlCharValRepository;

}
