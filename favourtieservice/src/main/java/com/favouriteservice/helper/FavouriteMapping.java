package com.favouriteservice.helper;

import com.favouriteservice.model.entity.Favourite;
import com.favouriteservice.model.request.FavouriteDto;
import com.favouriteservice.model.request.ProductDto;
import com.favouriteservice.model.request.UserDto;

public interface FavouriteMapping {

    static FavouriteDto map(Favourite favourite){
        return FavouriteDto.builder()
                .productId(favourite.getProductId())
                .userId(favourite.getUserId())
                .likedDate(favourite.getLikedDate())
                .userDto(UserDto.builder()
                        .userId(favourite.getUserId())
                        .build())
                .productDto(ProductDto.builder()
                        .productId(favourite.getProductId())
                        .build())
                .build();
    }

    static Favourite map(FavouriteDto favouriteDto){
        return Favourite.builder()
                .productId(favouriteDto.getProductId())
                .userId(favouriteDto.getUserId())
                .likedDate(favouriteDto.getLikedDate())
                .build();
    }
}
