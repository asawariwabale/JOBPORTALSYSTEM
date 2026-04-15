package com.service;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ApplicationRepository;
import com.dao.JobRepository;
import com.dao.JobSeekerRepository;
import com.model.Application;
import com.model.Job;
import com.model.JobSeeker;

@Service
public class ApplicationServiceimpl implements ApplicationService {


    @Autowired
    private ApplicationRepository applicationRepository;

    

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private JobSeekerRepository jobSeekerRepository; 

    @Override
    public Application applyJob(Application application) {

        // FIX: fetch real objects from DB
        Integer jobId = application.getJob().getJobId();
        Integer seekerId = application.getJobSeeker().getSeekerId();

        Job job = jobRepository.findById(jobId).orElseThrow(() -> new RuntimeException("Job not found"));

        JobSeeker seeker = jobSeekerRepository.findById(seekerId).orElseThrow(() -> new RuntimeException("JobSeeker not found"));

        // FIX: set managed entities
        application.setJob(job);
        application.setJobSeeker(seeker);

        application.setStatus("APPLIED");
        application.setApplieddate(LocalDate.now());

        return applicationRepository.save(application);
    }

    @Override
    public List<Application> getApplicationsBySeeker(int seekerId) {
        return applicationRepository.findByJobSeekerSeekerId(seekerId);
    }

    @Override
    public List<Application> getApplicationsByJob(int jobId) {
        return applicationRepository.findByJobJobId(jobId);
    }

    @Override
    public Application updateStatus(int applicationId, String status) {

        Application app = applicationRepository.findById(applicationId)
                .orElseThrow(() -> new RuntimeException("Application not found"));

        app.setStatus(status);

        return applicationRepository.save(app);
    }

}