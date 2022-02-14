package com.app.inventoryapp.repository;

import com.app.inventoryapp.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Artist findByArtistName(String artistName);

}
