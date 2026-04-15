package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.JobSeeker;

public interface JobSeekerRepository extends JpaRepository<JobSeeker, Integer>{

}
