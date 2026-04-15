package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.JobRepository;
import com.dao.RecruiterRepository;
import com.model.Job;
import com.model.Recruiter;
import com.service.JobService;

@RestController
@RequestMapping("/jobs")
@CrossOrigin(origins = "http://localhost:3000")
public class JobController {
	
	@Autowired
    private JobService jobService;
	@Autowired
	private RecruiterRepository recruiterRepository;
	@Autowired
	private   JobRepository  jobRepository;
	
	@PostMapping
	public Job createJob(@RequestBody Job job) {
	    return jobService.createJob(job);
	}

    @GetMapping("/{id}")
    public Job getJob(@PathVariable int id) {
        return jobService.getJobById(id);
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/recruiter/{id}")
    public List<Job> getByRecruiter(@PathVariable int id) {
        return jobService.getJobsByRecruiter(id);
    }

    @PutMapping("/{id}")
    public Job updateJob(@PathVariable int id, @RequestBody Job job) {
        return jobService.updateJob(id, job);
    }

    @DeleteMapping("/{id}")
    public void deleteJob(@PathVariable int id) {
        jobService.deleteJob(id);
    }

}
