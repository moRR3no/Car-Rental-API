package com.carrental.demo.repository;

import com.carrental.demo.entity.Branch;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface BranchRepository extends JpaRepository<Branch, Integer> {
}
