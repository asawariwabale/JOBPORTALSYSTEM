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

import com.model.JobSeeker;
import com.service.JobSeekerService;

@RestController
@RequestMapping("/jobseekers")
@CrossOrigin(origins = "http://localhost:3000")
public class JobSeekerController {

	 @Autowired
	    private JobSeekerService jobSeekerService;

	    @PostMapping("/save")
	    public JobSeeker save(@RequestBody JobSeeker jobSeeker) {
	        return jobSeekerService.saveJobSeeker(jobSeeker);
	    }

	    @GetMapping("/{id}")
	    public JobSeeker getById(@PathVariable int id) {
	        return jobSeekerService.getJobSeekerById(id);
	    }

	    @GetMapping("/all")
	    public List<JobSeeker> getAll() {
	        return jobSeekerService.getAllJobSeekers();
	    }

	    @PutMapping("/update/{id}")
	    public JobSeeker update(@PathVariable int id, @RequestBody JobSeeker jobSeeker) {
	        return jobSeekerService.updateJobSeeker(id, jobSeeker);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String delete(@PathVariable int id) {
	        jobSeekerService.deleteJobSeeker(id);
	        return "Deleted Successfully";
	    }
}
