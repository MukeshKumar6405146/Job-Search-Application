package com.example.Job.Search.Application.controller;

import com.example.Job.Search.Application.model.Job;
import com.example.Job.Search.Application.service.JobSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("a")
public class JobSearchController {
    @Autowired
    JobSearchService jobSearchService;

    @GetMapping("allJobs")
    public Iterable<Job> getAllJobs(){
        return jobSearchService.getAllJobs();
    }

    @PostMapping("saveAll")
    public String saveAllJobs(@RequestBody List<Job> jobSearchList){
        jobSearchService.saveAll(jobSearchList);
        return "Jobs are added successfully";
    }

    @GetMapping("title/{jobTitle}")
    public List<Job> findByJobTitle(@PathVariable String jobTitle){
        return jobSearchService.findByJobTitle(jobTitle);
    }

    @GetMapping("location/{jobLocation}")
    public List<Job> findByLocation(@PathVariable String location){
        return jobSearchService.findByJobLocation(location);
    }

    @GetMapping("employer/{name}")
    public List<Job> findByEmployerName(@PathVariable String name){
        return jobSearchService.findByEmployerName(name);
    }

    @PutMapping("info/{id}/{salary}")
    public String updateById(@PathVariable Long id,@PathVariable Double salary){
        jobSearchService.updateByID(id,salary);
        return "Salary updated.....";
    }

    @DeleteMapping("delete/{id}")
    public String deleteById(@PathVariable Long id){
        jobSearchService.deleteById(id);
        return "Successfully deleted";
    }
}
