package com.example.demo.controller;

import com.example.demo.model.Genre;
import com.example.demo.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GenreController {

    @Autowired
    GenreRepository genreRepository;

    @GetMapping("/genres")
    public List<Genre> getAll(){
        return genreRepository.findAll();
    }
}