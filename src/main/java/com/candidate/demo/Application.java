package com.candidate.demo;

import com.candidate.demo.domain.Candidate;
import com.candidate.demo.domain.CandidateBuilder;
import com.candidate.demo.service.CandidateService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
    CommandLineRunner init(CandidateService candidateService){
        return (evt) -> {
            Candidate candidate = CandidateBuilder.aCandidate()
                    .withDomain("Finance")
                    .withHours(10)
                    .withLocation("United States")
                    .withName("John Doe")
                    .withPrice(20)
                    .withRank(1)
                    .withSkills(new String[]{"J2EE", "Python"})
                    .build();
            candidateService.save(candidate);
            candidate = CandidateBuilder.aCandidate()
                    .withDomain("Engineering")
                    .withHours(45)
                    .withLocation("United Kingdom")
                    .withName("Jane Doe")
                    .withPrice(35)
                    .withRank(1)
                    .withSkills(new String[]{"J2EE", "Python"})
                    .build();
            candidateService.save(candidate);
        };
    }
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
