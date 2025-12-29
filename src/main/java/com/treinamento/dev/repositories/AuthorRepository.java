package com.treinamento.dev.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamento.dev.model.AuthorModel;

public interface AuthorRepository extends JpaRepository<AuthorModel, UUID> {
    
}
