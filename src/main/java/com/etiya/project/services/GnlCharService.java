package com.etiya.project.services;

import com.etiya.project.repository.GnlCharRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GnlCharService {

    @Autowired
    private GnlCharRepository gnlCharRepository;

}
