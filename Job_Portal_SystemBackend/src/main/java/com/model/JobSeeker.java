package com.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class JobSeeker {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
	private Integer seekerId;

    private String skills;
    private String experiences;
    private String resume;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "jobSeeker", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Application> applications = new ArrayList<>();

	public JobSeeker() {
		super();
	}

	public JobSeeker(Integer seekerId, String skills, String experiences, String resume, User user,
			List<Application> applications) {
		super();
		this.seekerId = seekerId;
		this.skills = skills;
		this.experiences = experiences;
		this.resume = resume;
		this.user = user;
		this.applications = applications;
	}

	public Integer getSeekerId() {
		return seekerId;
	}

	public String getSkills() {
		return skills;
	}

	public String getExperiences() {
		return experiences;
	}

	public String getResume() {
		return resume;
	}

	public User getUser() {
		return user;
	}

	public List<Application> getApplications() {
		return applications;
	}

	public void setSeekerId(Integer seekerId) {
		this.seekerId = seekerId;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public void setExperiences(String experiences) {
		this.experiences = experiences;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}

	
}
