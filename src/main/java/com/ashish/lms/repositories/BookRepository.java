package com.ashish.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.lms.entities.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
    
}
