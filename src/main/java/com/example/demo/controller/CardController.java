package com.example.demo.controller;


import com.example.demo.model.Card;
import com.example.demo.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {

    @Autowired
    CardRepository cardRepository;

    @GetMapping("/cards")
    public List<Card> getAll(){
        return cardRepository.findAll();
    }
}