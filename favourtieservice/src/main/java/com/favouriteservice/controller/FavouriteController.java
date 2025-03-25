package com.favouriteservice.controller;

import com.favouriteservice.model.request.FavouriteDto;
import com.favouriteservice.service.FavouriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/favourite")
public class FavouriteController {

    @Autowired
    private FavouriteService favouriteService;

    @PostMapping
    public ResponseEntity<FavouriteDto> save(@RequestBody FavouriteDto favouriteDto){
        return ResponseEntity.ok(favouriteService.saveFavourite(favouriteDto));
    }

}
