package com.etiya.project.services;

import com.etiya.project.repository.GnlTpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GnlTpService {

    @Autowired
    private GnlTpRepository gnlTpRepository;

}
