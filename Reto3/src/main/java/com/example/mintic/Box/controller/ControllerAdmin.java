package com.example.mintic.Box.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.mintic.Box.service.ServiceAdmin;

@RestController
public class ControllerAdmin {
    
    @Autowired
    private ServiceAdmin serviceAdmin;
}
