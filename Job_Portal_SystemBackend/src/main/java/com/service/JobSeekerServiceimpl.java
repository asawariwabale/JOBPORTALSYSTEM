package com.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.JobSeekerRepository;
import com.dao.UserRepository;
import com.model.JobSeeker;
import com.model.User;
@Service
public class JobSeekerServiceimpl implements JobSeekerService{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
    private JobSeekerRepository jobSeekerRepository;

    @Override
    public JobSeeker saveJobSeeker(JobSeeker jobSeeker) {
    	if (jobSeeker.getUser() != null && jobSeeker.getUser().getUserId() != null) {

            int userId = jobSeeker.getUser().getUserId();

            User user = userRepository.findById(userId)
                    .orElseThrow(() -> new RuntimeException("User not found"));

            jobSeeker.setUser(user);
        }

        jobSeeker.setStatus("ACTIVE"); // optional
        return jobSeekerRepository.save(jobSeeker);
    }

    @Override
    public JobSeeker getJobSeekerById(int seekerId) {
        return jobSeekerRepository.findById(seekerId).orElse(null);
    }

    @Override
    public List<JobSeeker> getAllJobSeekers() {
        return jobSeekerRepository.findAll();
    }

    @Override
    public JobSeeker updateJobSeeker(int seekerId, JobSeeker jobSeeker) {

        JobSeeker existing = jobSeekerRepository.findById(seekerId)
                .orElseThrow(() -> new RuntimeException("JobSeeker not found"));

        existing.setSkills(jobSeeker.getSkills());
        existing.setExperiences(jobSeeker.getExperiences());
        existing.setResume(jobSeeker.getResume());

        // IMPORTANT FIX: avoid accidental null user overwrite
        if (jobSeeker.getUser() != null) {
            existing.setUser(jobSeeker.getUser());
        }

        return jobSeekerRepository.save(existing);
    }

    @Override
    public void deleteJobSeeker(int seekerId) {
        if (!jobSeekerRepository.existsById(seekerId)) {
            throw new RuntimeException("JobSeeker not found");
        }

        jobSeekerRepository.deleteById(seekerId);
    }
    
    

        
    }


	
	

