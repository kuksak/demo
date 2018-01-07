package com.candidate.demo.service;

import com.candidate.demo.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.candidate.demo.repository.RepoCandidate;

import java.util.List;

@Service
public class CandidateService {


    @Autowired
    private RepoCandidate repoCandidate;

    /**
     * TODO: callling save should be enought
     * @param candidate
     * @return
     */
    private Candidate saveCandidate(Candidate candidate){
        return repoCandidate.save(candidate);
    }

    /**
     * TODO: shall we call it findAll since this is Candidate Service?
     * @return
     */
    private List<Candidate> returnAllCandidates(){
        return repoCandidate.findAll();
    }

    /**
     * TODO: this doesn't work like this, you have to place the logic of ranking here, repo is only for
     * data retrieval and insertion into/from the database
     * @param rank
     * @return
     */
    private List<Candidate> rankedCandidates(int rank){
        return repoCandidate.rankedCandidates(rank);
    }



}
