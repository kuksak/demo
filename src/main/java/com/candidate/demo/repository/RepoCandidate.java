package com.candidate.demo.repository;

import com.candidate.demo.domain.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * TODO: CandidateRepository is more meaningful
 */
public interface RepoCandidate extends JpaRepository<Candidate,Long> {

    /**
     * TODO: the name is misleading, shall we call it findByRank??? this is how spring is gnna look for candidates
     * with given rank, and its should always be optional
     * e.g.
     * Optional<List<Candidate>> findByRank(Integer rank);
     * @param rank
     * @return
     */
    List<Candidate> rankedCandidates(int rank);
}
