package com.example.beachcoins.repository;

import com.example.beachcoins.model.Imagens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagensRepository extends JpaRepository<Imagens, Long> {
}
