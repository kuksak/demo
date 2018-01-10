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


    public Candidate save(Candidate candidate){
        return candidateRepository.save(candidate);
    }


    public List<Candidate> findAll(){
        return candidateRepository.findAll();
    }


    public List<Candidate> rankedCandidates(int rank){
        return candidateRepository.findByRank(rank);
    }

}
