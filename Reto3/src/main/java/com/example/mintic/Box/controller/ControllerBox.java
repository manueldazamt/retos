package com.example.mintic.Box.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;

import com.example.mintic.Box.model.Box;
import com.example.mintic.Box.service.ServiceBox;

@RestController
@RequestMapping("/api/Box")
@CrossOrigin (origins ="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class ControllerBox {

    @Autowired
    private ServiceBox serviceBox;
    

    @GetMapping("/all")
    public List<Box> getAll(){
        return serviceBox.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Box> getBox(@PathVariable("id") int id) {
        return serviceBox.getBox(id);
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Box save(@RequestBody Box Box) {
        return serviceBox.save(Box);
    }


}
