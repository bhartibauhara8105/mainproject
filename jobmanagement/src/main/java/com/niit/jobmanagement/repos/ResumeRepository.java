package com.niit.jobmanagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niit.jobmanagement.entities.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long> {

}
