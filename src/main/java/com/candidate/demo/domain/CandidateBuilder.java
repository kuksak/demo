package com.candidate.demo.domain;

public final class CandidateBuilder {
    private String name;
    private Integer hours;
    private Integer price;
    private String[] skills;
    private String domain;
    private String location;
    private Integer rank;

    private CandidateBuilder() {
    }

    public static CandidateBuilder aCandidate() {
        return new CandidateBuilder();
    }

    public CandidateBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CandidateBuilder withHours(Integer hours) {
        this.hours = hours;
        return this;
    }

    public CandidateBuilder withPrice(Integer price) {
        this.price = price;
        return this;
    }

    public CandidateBuilder withSkills(String[] skills) {
        this.skills = skills;
        return this;
    }

    public CandidateBuilder withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public CandidateBuilder withLocation(String location) {
        this.location = location;
        return this;
    }

    public CandidateBuilder withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    public Candidate build() {
        Candidate candidate = new Candidate();
        candidate.setName(name);
        candidate.setHours(hours);
        candidate.setPrice(price);
        candidate.setSkills(skills);
        candidate.setDomain(domain);
        candidate.setLocation(location);
        candidate.setRank(rank);
        return candidate;
    }
}
