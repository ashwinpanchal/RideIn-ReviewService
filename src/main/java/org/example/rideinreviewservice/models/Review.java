package org.example.rideinreviewservice.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "bookingReview") // can give custom name to the table in mysql
public class Review extends BaseModel {

    private String content;

    @Column(nullable = false) // adds the not null property for this particular property
    private Double rating;

    @Override
    public String toString(){
        return "Review : \nContent = " + this.content
                + "\nRating = " + this.rating
                + "\nId = " + this.id
                + "\nCreatedAt = " + this.createdAt
                + "\nUpdatedAt = " + this.updatedAt + "\n";
    }
}
