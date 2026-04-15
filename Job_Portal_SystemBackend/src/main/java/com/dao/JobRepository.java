package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Job;

public interface JobRepository  extends JpaRepository<Job, Integer> {
 
	List<Job> findByRecruiter_RecruiterId(int recruiterId);
}
