package com.candidate.demo.repository;

import com.candidate.demo.domain.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * TODO: CandidateRepository is more meaningful
 */
public interface CandidateRepository extends JpaRepository<Candidate,Long> {

    List<Candidate> rankedCandidates(int rank);
}
