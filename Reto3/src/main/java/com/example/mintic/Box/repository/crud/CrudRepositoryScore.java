package com.example.mintic.Box.repository.crud;

import org.springframework.data.repository.CrudRepository;
import com.example.mintic.Box.model.Score;

public interface CrudRepositoryScore extends CrudRepository<Score,Integer> {
    
}
