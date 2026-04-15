package com.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Job {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer jobId;
	private String title;
	private String description;
	private String location;
	private String salary;
	private String jobtype;
	
	
	 
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "recruiter_id")
	@JsonIgnoreProperties({"jobs"})
	private Recruiter recruiter;
	
	 @OneToMany(mappedBy = "job", cascade = CascadeType.ALL)
	 @JsonIgnore
	 private List<Application> applications;

	 public Job() {
		super();
	 }

	 public Job(Integer jobId, String title, String description, String location, String salary, String jobtype,
			Recruiter recruiter, List<Application> applications) {
		super();
		this.jobId = jobId;
		this.title = title;
		this.description = description;
		this.location = location;
		this.salary = salary;
		this.jobtype = jobtype;
		this.recruiter = recruiter;
		this.applications = applications;
	 }

	 public Integer getJobId() {
		 return jobId;
	 }

	 public String getTitle() {
		 return title;
	 }

	 public String getDescription() {
		 return description;
	 }

	 public String getLocation() {
		 return location;
	 }

	 public String getSalary() {
		 return salary;
	 }

	 public String getJobtype() {
		 return jobtype;
	 }

	 public Recruiter getRecruiter() {
		 return recruiter;
	 }

	 public List<Application> getApplications() {
		 return applications;
	 }

	 public void setJobId(Integer jobId) {
		 this.jobId = jobId;
	 }

	 public void setTitle(String title) {
		 this.title = title;
	 }

	 public void setDescription(String description) {
		 this.description = description;
	 }

	 public void setLocation(String location) {
		 this.location = location;
	 }

	 public void setSalary(String salary) {
		 this.salary = salary;
	 }

	 public void setJobtype(String jobtype) {
		 this.jobtype = jobtype;
	 }

	 public void setRecruiter(Recruiter recruiter) {
		 this.recruiter = recruiter;
	 }

	 public void setApplications(List<Application> applications) {
		 this.applications = applications;
	 }

	 
	 
}
