package com.candidate.demo.service;

import com.candidate.demo.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.candidate.demo.repository.CandidateRepository;

import java.util.List;

@Service
public class CandidateService {


    @Autowired
    private CandidateRepository candidateRepository;

    /**
     * Saves a candidate object with a new id
     * @param candidate object
     * @return saved object
     */
    public Candidate save(Candidate candidate){
        return candidateRepository.save(candidate);
    }


    /**
     * finds all candidates
     * @return list of candidates
     */
    public List<Candidate> findAll(){
        return candidateRepository.findAll();
    }


    /**
     * finds a candidate by rank
     * @param rank to find a candidate with
     * @return candidates with given rank
     */
    public List<Candidate> findByRank(int rank){
        return candidateRepository.findByRank(rank);
    }
}
