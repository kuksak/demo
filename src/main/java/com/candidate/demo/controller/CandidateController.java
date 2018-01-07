package com.candidate.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.candidate.demo.service.CandidateService;


@RestController
@RequestMapping(value = "com/candidate/demo/service")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

}
