package com.example.mintic.Box.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.mintic.Box.service.ServiceScore;

@RestController
public class ControllerScore {
    
    @Autowired
    private ServiceScore serviceScore;
}
