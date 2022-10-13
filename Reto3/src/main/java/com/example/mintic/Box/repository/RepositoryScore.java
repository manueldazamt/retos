package com.example.mintic.Box.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mintic.Box.repository.crud.CrudRepositoryScore;

@Repository
public class RepositoryScore {

    @Autowired
    private CrudRepositoryScore crudRepositoryScore;
}
