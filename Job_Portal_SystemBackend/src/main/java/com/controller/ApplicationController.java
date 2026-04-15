package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Application;
import com.service.ApplicationService;

@RestController
@RequestMapping("/applications")
@CrossOrigin(origins = "http://localhost:3000")
public class ApplicationController {
	
	@Autowired
    private ApplicationService applicationService;

    
    @PostMapping
    public Application applyJob(@RequestBody Application application) {
        return applicationService.applyJob(application);
    }

    
    @GetMapping("/seeker/{id}")
    public List<Application> getBySeeker(@PathVariable int id) {
        return applicationService.getApplicationsBySeeker(id);
    }

   
    @GetMapping("/job/{id}")
    public List<Application> getByJob(@PathVariable int id) {
        return applicationService.getApplicationsByJob(id);
    }

 
    @PutMapping("/{id}")
    public Application updateStatus(@PathVariable int id, @RequestParam String status) {
        return applicationService.updateStatus(id, status);
    }

}
