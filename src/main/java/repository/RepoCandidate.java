package repository;

import domain.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface RepoCandidate extends JpaRepository<Candidate,Long> {

    List<Candidate> rankedCandidates(int rank);
}
