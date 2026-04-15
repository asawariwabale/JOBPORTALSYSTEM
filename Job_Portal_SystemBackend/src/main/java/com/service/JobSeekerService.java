package com.service;

import java.util.List;

import com.model.JobSeeker;

public interface JobSeekerService {
	
	public JobSeeker saveJobSeeker(JobSeeker jobSeeker);

   public JobSeeker getJobSeekerById(int seekerId);

   public List<JobSeeker> getAllJobSeekers();

  public  JobSeeker updateJobSeeker(int seekerId, JobSeeker jobSeeker);

   public void deleteJobSeeker(int seekerId);

}
