package com.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Recruiter {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
	private Integer recruiterId;
	private String companyName;
	private String companyDetail;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	@JsonIgnore
	private User user;

	@OneToMany(mappedBy = "recruiter", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Job> jobs;

	public Recruiter() {
		super();
	}

	public Recruiter(Integer recruiterId, String companyName, String companyDetail, User user, List<Job> jobs) {
		super();
		this.recruiterId = recruiterId;
		this.companyName = companyName;
		this.companyDetail = companyDetail;
		this.user = user;
		this.jobs = jobs;
	}

	public Integer getRecruiterId() {
		return recruiterId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyDetail() {
		return companyDetail;
	}

	public User getUser() {
		return user;
	}

	public List<Job> getJobs() {
		return jobs;
	}

	public void setRecruiterId(Integer recruiterId) {
		this.recruiterId = recruiterId;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setCompanyDetail(String companyDetail) {
		this.companyDetail = companyDetail;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setJobs(List<Job> jobs) {
		this.jobs = jobs;
	}

	
}
