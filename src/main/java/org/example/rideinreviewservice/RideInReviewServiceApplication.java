package org.example.rideinreviewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RideInReviewServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RideInReviewServiceApplication.class, args);
    }

}
