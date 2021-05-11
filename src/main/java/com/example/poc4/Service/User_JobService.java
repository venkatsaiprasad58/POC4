package com.example.poc4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.poc4.Dao.JobId;
import com.example.poc4.Dao.UserDao;
import com.example.poc4.model.Job;
import com.example.poc4.model.User;

@Service
public class User_JobService {
	@Autowired
	private UserDao userdao;
	@Autowired
	private JobId jobdao;

	// create user
	public User cteateNewUser(User user) {
		return userdao.save(user);
	}

	// create job
	public Job createNewJob(Job job) {
		return jobdao.save(job);
	}
	
	//Get Job by ID
	public Optional<Job> getJobById(int  jobid) {
		return jobdao.findById(jobid);
	}
	
	//get Job by Type
	public List<Job> getJobByType(String type){
		return jobdao.findByJobType(type);
	}
	
	//get Job by Experience
//	public List<Job> getJobByExp(int exp) {
//		return jobdao.findByJobexp(exp);
//	}
	
	//Filter Job by Country:
	public List<Job> getJobBycountry(String country){
		return jobdao.findByCountry(country);
	}
	
	//Filter Job by Availability
	public List<Job> getJobByavailability(String availability){
		return jobdao.findByAvailability(availability);
	}
	

	
	//getting user
	public Iterable<User> getUser(User user){
		return userdao.findAll();
	}
	
	//getting Job
	public Iterable<Job> getJob(Job job){
		return jobdao.findAll();
	}

}
