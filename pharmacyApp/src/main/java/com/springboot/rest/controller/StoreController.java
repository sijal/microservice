package com.springboot.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.rest.dto.Store;

@RestController
@RequestMapping(value = "/store")
public class StoreController {
    @Autowired
    private Store store;

    @GetMapping(value = "/global", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Store getStore() {
        return store; // Not fetching latest value from refresh endpoint, refresh endpoint not working
    }
}
