package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long candidateId;
    private String name;
    private int hours;
    private int price;
    private String[] skills;
    private String domain;
    private String location;

    public Candidate(){

    }

    public Candidate(String name, int hours, int price, String[] skills, String domain, String location) {
        this.name = name;
        this.hours = hours;
        this.price = price;
        this.skills = skills;
        this.domain = domain;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
