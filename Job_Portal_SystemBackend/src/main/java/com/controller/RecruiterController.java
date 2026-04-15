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

import com.model.Recruiter;
import com.service.RecruiterService;

@RestController
@RequestMapping("/recruiters")
@CrossOrigin(origins = "http://localhost:3000")
public class RecruiterController {

	@Autowired
    private RecruiterService recruiterService;

    @PostMapping
    public Recruiter saveRecruiter(@RequestBody Recruiter recruiter) {
        return recruiterService.saveRecruiter(recruiter);
    }

    @GetMapping("/{id}")
    public Recruiter getRecruiter(@PathVariable int id) {
        return recruiterService.getRecruiterById(id);
    }

    @GetMapping
    public List<Recruiter> getAll() {
        return recruiterService.getAllRecruiters();
    }

    @PutMapping("/{id}")
    public Recruiter update(@PathVariable int id, @RequestBody Recruiter recruiter) {
        return recruiterService.updateRecruiter(id, recruiter);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        recruiterService.deleteRecruiter(id);
    }
}


/*
CREATE RECRUITER

 POST http://localhost:8089/recruiters
 {
  "companyName": "Google",
  "position": "HR Manager",
  "location": "Pune"
}

GET ALL RECRUITERS
GET http://localhost:8089/recruiters

GET RECRUITER BY ID
GET http://localhost:8089/recruiters/1


UPDATE RECRUITER
PUT http://localhost:8089/recruiters/1

{
  "companyName": "Google India",
  "position": "Senior HR",
  "location": "Bangalore"
}


DELETE RECRUITER
DELETE http://localhost:8089/recruiters/1
 
 */
 