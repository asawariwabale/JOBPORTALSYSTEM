package com.service;

import java.util.List;

import com.model.Application;

public interface ApplicationService {
	
	public Application applyJob(Application application);

    public List<Application> getApplicationsBySeeker(int seekerId);

    public List<Application> getApplicationsByJob(int jobId);

    public Application updateStatus(int applicationId, String status);

}
