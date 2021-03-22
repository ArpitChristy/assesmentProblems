package com.example.assessment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Palindrome {
    @Id
    private int id;
    private String palindrome;
}
