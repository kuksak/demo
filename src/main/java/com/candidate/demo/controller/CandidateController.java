package com.candidate.demo.controller;

import com.candidate.demo.domain.Candidate;
import com.candidate.demo.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @RequestMapping(value = "/rank/{rank}", method = RequestMethod.GET)
    public List<Candidate> findCandidatesByRank(@PathVariable("rank") Integer rank){
        return candidateService.findByRank(rank);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Candidate> findAllCandidates(){
        return candidateService.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Candidate saveCandidate(@RequestBody Candidate candidate){
        return candidateService.save(candidate);
    }

}
