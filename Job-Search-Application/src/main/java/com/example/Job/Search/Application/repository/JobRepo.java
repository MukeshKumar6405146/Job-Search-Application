package com.example.Job.Search.Application.repository;

import com.example.Job.Search.Application.model.Job;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JobRepo extends CrudRepository<Job, Long> {


    List<Job> findByJobTitle(String jobTitle);

    List<Job> findByJobLocation(String location);

    List<Job> findByEmployerName(String name);


}
