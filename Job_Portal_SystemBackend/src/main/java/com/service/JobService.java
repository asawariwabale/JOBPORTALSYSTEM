package com.service;

import java.util.List;

import com.model.Job;
import com.model.JobSeeker;

public interface JobService {

	public Job createJob(Job job);

   public Job getJobById(int id);

  public  List<Job> getAllJobs();

   public List<Job> getJobsByRecruiter(int recruiterId);

   public Job updateJob(int id, Job job);

  public  void deleteJob(int id);
	
}
