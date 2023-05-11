package com.carrental.demo.service._branch;

import com.carrental.demo.entity.Branch;
import com.carrental.demo.entity.Car;
import com.carrental.demo.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchServiceImpl {

    private final BranchRepository branchRepository;

    @Autowired
    public BranchServiceImpl(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    public List<Branch> findAll() {
        return branchRepository.findAll();
    }

    public Branch findById(int id) {
        Optional<Branch> result = branchRepository.findById(id);
        Branch branch = null;
        if(result.isPresent()) {
            branch=result.get();
        }
        else {
            throw new RuntimeException("Did not found branch id - " + id);
        }
        return branch;
    }
    public Branch save(Branch branch) {
        return branchRepository.save(branch);
    }

    public void deleteById (int id) {
        branchRepository.deleteById(id);
    }



}
