package com.example.mintic.Box.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.mintic.Box.model.Box;
import com.example.mintic.Box.repository.crud.CrudRepositoryBox;

@Repository
public class RepositoryBox {
    
    @Autowired
    private CrudRepositoryBox crudRepositoryBox;


    public List<Box> getAll(){
        return (List<Box>) crudRepositoryBox.findAll();
    }
    public Optional<Box> getBox(int id){
        return crudRepositoryBox.findById(id);
    }
    
    public Box save(Box Box){
        return crudRepositoryBox.save(Box);
    }

}

