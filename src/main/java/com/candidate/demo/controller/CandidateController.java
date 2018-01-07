package com.candidate.demo.controller;

import com.candidate.demo.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.candidate.demo.service.CandidateService;

import javax.websocket.server.PathParam;
import java.util.List;


/**
 * TODO: request mapping should be like "/candidate"
 * you don't make this long mappings
 */
@RestController
@RequestMapping(value = "com/candidate/demo/service")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    /**
     * TODO: this method will have request mapping as "/rank", this way the final api will be /candidate/rank/{rank}
     * @param rank
     * @return
     */
    @RequestMapping(value = "/rank/{rank}", method = RequestMethod.GET)
    public List<Candidate> candidatesUnderRank(@PathVariable("rank") Integer rank){
        //TODO: make service call here, do the input check and throw any exception if required
        //TODO: like rank is zero or null
        return null;
    }

}
