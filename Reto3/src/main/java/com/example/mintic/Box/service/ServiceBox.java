package com.example.mintic.Box.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mintic.Box.model.Box;
import com.example.mintic.Box.repository.RepositoryBox;

@Service
public class ServiceBox {
    
    @Autowired
    private RepositoryBox repositoryBox;

    
    public List<Box> getAll() {
        return repositoryBox.getAll();
    }

    public Optional<Box> getBox(int id) {
        return repositoryBox.getBox(id);
    }

    public Box save(Box Box) {
        if (Box.getId() == null) {
            return repositoryBox.save(Box);
        } else {
            Optional<Box> Box1 = repositoryBox.getBox(Box.getId());
            if (Box1.isEmpty()) {
                return repositoryBox.save(Box);
            } else {
                return Box;
            }
        }
    }

}
