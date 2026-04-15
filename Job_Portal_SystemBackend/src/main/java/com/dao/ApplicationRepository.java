package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {


    List<Application> findByJobSeekerSeekerId(int seekerId);

    List<Application> findByJobJobId(int jobId);
}
