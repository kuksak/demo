package service;

import domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RepoCandidate;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private RepoCandidate repoCandidate;

    private Candidate saveCandidate(Candidate candidate){
        return repoCandidate.save(candidate);
    }

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
