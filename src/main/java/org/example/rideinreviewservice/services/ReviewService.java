package org.example.rideinreviewservice.services;

import org.example.rideinreviewservice.models.Review;
import org.example.rideinreviewservice.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {

    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Service layer");
        Review r = Review.builder()
                .content("Great Quality")
                .rating(3.5)
                .build(); // plane java object
        reviewRepository.save(r); // this code executes sql query
    }
}
