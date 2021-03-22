/*
package com.example.assessment.Service;


import com.example.assessment.repository.PalindromeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PalindromeService {
    @Autowired
    PalindromeRepository palindromeRepository;
    public void savePalindrome(String palindrome){
        palindromeRepository.save(palindrome);
    }
    public ResponseEntity<?> getAllPalindrome(){
        List<String> list = new ArrayList<>();
        palindromeRepository.findAll().forEach(list::add);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
*/
