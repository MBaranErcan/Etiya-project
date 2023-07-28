package com.etiya.project.services;

import com.etiya.project.repository.GnlStRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GnlStService {

    @Autowired
    private GnlStRepository gnlStRepository;

}
