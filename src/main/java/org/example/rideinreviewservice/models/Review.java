package org.example.rideinreviewservice.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "bookingReview") // can give custom name to the table in mysql
public class Review {

    @Id // this annotation makes the id property, the primary key for our table
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identity means Auto Increment
    private Long id;

    private String content;

    @Column(nullable = false) // adds the not null property for this particular property
    private Double rating;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP) // tells spring boot about the format of the Date to be saved
    @CreatedDate // this is a spring boot thing and not the sql
    private Date createdAt;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
}
