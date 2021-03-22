package com.example.assessment.controller;


import com.example.assessment.model.Palindrome;
import com.example.assessment.repository.PalindromeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class restController {
    @Autowired
    PalindromeRepository palindromeRepository;
    @GetMapping("/palindromes")
    public ResponseEntity<?> getAllPalindromes(){
        List<Palindrome> list = new ArrayList<>();
        palindromeRepository.findAll().forEach(list::add);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping("/palindromes")
    public ResponseEntity<?> savePalindrome(@RequestParam(required = true) Palindrome palindrome){
        try{
            palindromeRepository.save(palindrome);
            return new ResponseEntity<>("Created a new palindrome successfully!", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
