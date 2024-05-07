package org.example.rideinreviewservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Review {

    @Id // this annotation makes the id property, the primary key for our table
    Long id;


}
