package com.example.mintic.Box.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mintic.Box.repository.RepositoryScore;

@Service
public class ServiceScore {
    
    @Autowired
    private RepositoryScore repositoryScore;
}
