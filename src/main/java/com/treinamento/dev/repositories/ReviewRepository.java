package com.treinamento.dev.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamento.dev.model.ReviewModel;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID> {
    
}
