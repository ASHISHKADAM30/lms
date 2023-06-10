package com.ashish.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.lms.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    
}
