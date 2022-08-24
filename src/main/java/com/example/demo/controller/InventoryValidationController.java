package com.example.demo.controller;

import com.example.demo.model.Item;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/test")
@Validated
public class InventoryValidationController {
    @PostMapping
    public ResponseEntity<Item> addItem(@Valid @RequestBody Item item){
        System.out.println("hi");
        return new ResponseEntity<Item>(item, HttpStatus.OK);
    }
}
