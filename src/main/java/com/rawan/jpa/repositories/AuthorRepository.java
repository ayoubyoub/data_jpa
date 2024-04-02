package com.rawan.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rawan.jpa.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
  
}
