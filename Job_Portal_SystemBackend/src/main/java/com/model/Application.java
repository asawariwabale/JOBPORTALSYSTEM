package com.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Application {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer applicationid;
	private String status;
	private LocalDate applieddate; 
	
	@ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;

    @ManyToOne
    @JoinColumn(name = "seeker_id")
    private JobSeeker jobSeeker;

	public Application() {
		super();
	}

	public Application(Integer applicationid, String status, LocalDate applieddate, Job job, JobSeeker jobSeeker) {
		super();
		this.applicationid = applicationid;
		this.status = status;
		this.applieddate = applieddate;
		this.job = job;
		this.jobSeeker = jobSeeker;
	}

	public Integer getApplicationid() {
		return applicationid;
	}

	public String getStatus() {
		return status;
	}

	public LocalDate getApplieddate() {
		return applieddate;
	}

	public Job getJob() {
		return job;
	}

	public JobSeeker getJobSeeker() {
		return jobSeeker;
	}

	public void setApplicationid(Integer applicationid) {
		this.applicationid = applicationid;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setApplieddate(LocalDate applieddate) {
		this.applieddate = applieddate;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public void setJobSeeker(JobSeeker jobSeeker) {
		this.jobSeeker = jobSeeker;
	}

	
    
}
