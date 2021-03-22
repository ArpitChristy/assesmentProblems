package com.example.assessment.controller;

import com.example.assessment.Service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class restController {
    @Autowired
    PalindromeService palindromeService;
    @GetMapping("/palindromes")
    public ResponseEntity<?> getAllPalindromes(){
        ResponseEntity<?> res = palindromeService.getAllPalindrome();
        return res;
    }

    @PostMapping("palindromes")
    public ResponseEntity<?> savePalindrome(@RequestParam(required = true) String palindrome){
        try{
            palindromeService.savePalindrome(palindrome);
            return new ResponseEntity<>("Created a new palindrome successfully!", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
