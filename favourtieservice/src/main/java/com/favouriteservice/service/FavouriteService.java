package com.favouriteservice.service;

import com.favouriteservice.helper.FavouriteMapping;
import com.favouriteservice.model.request.FavouriteDto;
import com.favouriteservice.repository.FavouriteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FavouriteService {

    @Autowired
    FavouriteRepository favouriteRepository;
    public FavouriteDto saveFavourite(com.favouriteservice.model.request.FavouriteDto favouriteDto)
    {
        log.info("FavouriteService :: saveFavourite");
        return FavouriteMapping.map(favouriteRepository.save(FavouriteMapping.map(favouriteDto)));
    }
}
