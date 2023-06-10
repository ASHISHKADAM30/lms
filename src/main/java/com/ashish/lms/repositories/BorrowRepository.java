package com.ashish.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.lms.entities.Borrow;

public interface BorrowRepository extends JpaRepository<Borrow, Integer>  {
    
}
