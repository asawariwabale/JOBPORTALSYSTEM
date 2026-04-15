package com.service;



import java.util.List;
import com.dao.UserRepository;
import com.model.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RecruiterRepository;
import com.model.Recruiter;

@Service
public class RecruiterServiceimpl implements RecruiterService{

	@Autowired
    private RecruiterRepository recruiterRepository;

    @Autowired
    private UserRepository userRepository;

    /*
    @Override
    public Recruiter saveRecruiter(Recruiter recruiter) {

    
        if (recruiter.getUser() != null) {

            User user = userRepository.findById(recruiter.getUser().getUserId())
                    .orElseThrow(() -> new RuntimeException("User not found"));

            recruiter.setUser(user);
        }

        return recruiterRepository.save(recruiter);
    }*/
    
    @Override
    public Recruiter saveRecruiter(Recruiter recruiter) {

    	User reqUser = recruiter.getUser();

    	if (reqUser == null || reqUser.getUserId() == null) {
    	    throw new RuntimeException("User is required");
    	}

    	User user = userRepository.findById(reqUser.getUserId())
    	        .orElseThrow(() -> new RuntimeException("User not found"));

    	recruiter.setUser(user);

    	return recruiterRepository.save(recruiter);
    }

    @Override
    public Recruiter getRecruiterById(int recruiterId) {
        return recruiterRepository.findById(recruiterId)
                .orElseThrow(() -> new RuntimeException("Recruiter not found"));
    }

    @Override
    public List<Recruiter> getAllRecruiters() {
        return recruiterRepository.findAll();
    }

    @Override
    public Recruiter updateRecruiter(int recruiterId, Recruiter recruiter) {

        Recruiter existing = recruiterRepository.findById(recruiterId)
                .orElseThrow(() -> new RuntimeException("Recruiter not found"));

        existing.setCompanyName(recruiter.getCompanyName());
        existing.setCompanyDetail(recruiter.getCompanyDetail());

        
        if (recruiter.getUser() != null) {

            User user = userRepository.findById(recruiter.getUser().getUserId())
                    .orElseThrow(() -> new RuntimeException("User not found"));

            existing.setUser(user);
        }

        return recruiterRepository.save(existing);
    }

    @Override
    public void deleteRecruiter(int recruiterId) {

        if (!recruiterRepository.existsById(recruiterId)) {
            throw new RuntimeException("Recruiter not found");
        }

        recruiterRepository.deleteById(recruiterId);
    }
}
