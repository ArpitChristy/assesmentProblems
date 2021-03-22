package com.example.assessment.repository;

import com.example.assessment.model.Palindrome;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PalindromeRepository extends JpaRepository<Palindrome,Integer> {
    public List<Palindrome> findAll();
}
