package com.service;

import java.util.List;

import com.model.Recruiter;

public interface RecruiterService {
	
	public Recruiter saveRecruiter(Recruiter recruiter);

	 public   Recruiter getRecruiterById(int recruiterId);

	  public  List<Recruiter> getAllRecruiters();

	public    Recruiter updateRecruiter(int recruiterId, Recruiter recruiter);

	  public  void deleteRecruiter(int recruiterId);

}
