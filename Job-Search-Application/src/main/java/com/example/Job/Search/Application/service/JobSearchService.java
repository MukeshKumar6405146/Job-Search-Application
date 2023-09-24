package com.example.Job.Search.Application.service;

import com.example.Job.Search.Application.model.Job;
import com.example.Job.Search.Application.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobSearchService {
    @Autowired
    JobRepo jobRepo;
    public Iterable<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    public void saveAll(List<Job> jobSearchList) {
        jobRepo.saveAll(jobSearchList);
    }

    public List<Job> findByJobTitle(String jobTitle) {
        return jobRepo.findByJobTitle(jobTitle);
    }

    public List<Job> findByJobLocation(String location){
        return jobRepo.findByJobLocation(location);
    }

    public List<Job> findByEmployerName(String name) {
        return jobRepo.findByEmployerName(name);
    }

    public void updateByID(Long id, Double salary) {
        Optional<Job> tempData = jobRepo.findById(id);
        Job myData = tempData.get();
        myData.setJobSalary(salary);
        jobRepo.save(myData);
    }

    public void deleteById(Long id) {
        jobRepo.deleteById(id);
    }
}
