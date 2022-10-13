package com.example.mintic.Box.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mintic.Box.repository.RepositoryAdmin;

@Service
public class ServiceAdmin {
    
    @Autowired
    private RepositoryAdmin repositoryAdmin;
}
