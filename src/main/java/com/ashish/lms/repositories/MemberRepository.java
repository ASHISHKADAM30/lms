package com.ashish.lms.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ashish.lms.entities.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {
    
}
