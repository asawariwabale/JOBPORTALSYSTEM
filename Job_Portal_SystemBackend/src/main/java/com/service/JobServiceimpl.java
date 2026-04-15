package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.JobRepository;
import com.dao.RecruiterRepository;
import com.model.Job;

import com.model.Recruiter;

@Service
public class JobServiceimpl implements JobService {

	
	@Autowired
    private JobRepository jobRepository;

	@Autowired
    private RecruiterRepository recruiterRepository;

	@Override
	public Job createJob(Job job) {

	    if (job.getRecruiter() == null || job.getRecruiter().getRecruiterId() == null) {
	        throw new RuntimeException("Recruiter is required");
	    }

	    Recruiter recruiter = recruiterRepository.findById(job.getRecruiter().getRecruiterId())
	            .orElseThrow(() -> new RuntimeException("Recruiter not found"));

	    job.setRecruiter(recruiter);

	    return jobRepository.save(job);
	}

    @Override
    public Job getJobById(int id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public List<Job> getJobsByRecruiter(int recruiterId) {
        return jobRepository.findByRecruiter_RecruiterId(recruiterId);
    }

    @Override
    public Job updateJob(int id, Job job) {

        Job existing = jobRepository.findById(id).orElseThrow(() -> new RuntimeException("Job not found"));

        existing.setTitle(job.getTitle());
        existing.setDescription(job.getDescription());
        existing.setLocation(job.getLocation());
        existing.setSalary(job.getSalary());
        existing.setJobtype(job.getJobtype());

        if (job.getRecruiter() != null) {
            Recruiter recruiter = recruiterRepository
                    .findById(job.getRecruiter().getRecruiterId())
                    .orElseThrow(() -> new RuntimeException("Recruiter not found"));

            existing.setRecruiter(recruiter);
        }

        return jobRepository.save(existing);
    }

    @Override
    public void deleteJob(int id) {
        jobRepository.deleteById(id);
    }
}