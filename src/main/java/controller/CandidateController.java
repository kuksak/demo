package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CandidateService;

@RestController
@RequestMapping(value = "service")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

}
