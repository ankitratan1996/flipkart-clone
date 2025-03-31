package com.favouriteservice.repository;

import com.favouriteservice.model.entity.Favourite;
import com.favouriteservice.model.entity.FavouriteId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteRepository extends JpaRepository<Favourite, FavouriteId> {
}
