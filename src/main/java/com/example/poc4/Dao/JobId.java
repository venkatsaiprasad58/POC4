package com.example.poc4.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.poc4.model.Job;



public interface JobId extends JpaRepository<Job, Integer> {

	public List<Job> findByJobType(String jobType);
	
//	public List<Job> findByJobexp(int experience);
	
	public List<Job> findByCountry(String country);
	
	public List<Job> findByAvailability(String availability);

	



}
