package com.candidate.demo.repository;

import com.candidate.demo.domain.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CandidateRepository extends JpaRepository<Candidate,Long> {

    List<Candidate> findByRank(Integer rank);
}
