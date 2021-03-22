package com.example.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PalindromeRepository extends JpaRepository<String,Integer> {

}
