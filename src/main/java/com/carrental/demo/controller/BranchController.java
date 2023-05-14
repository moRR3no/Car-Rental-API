package com.carrental.demo.controller;

import com.carrental.demo.entity.Branch;
import com.carrental.demo.service._branch.BranchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branches")
public class BranchController {

    private BranchServiceImpl branchService;

    @Autowired
    public BranchController(BranchServiceImpl branchService) {
        this.branchService = branchService;
    }

    @GetMapping("/best")
    public List<Branch> bestBranches(){
        Branch branch1 = branchService.findById(1);
        Branch branch2 = branchService.findById(2);
        return List.of(branch1,branch2);
    }

//    @GetMapping
//    public List<Branch> findAll() {
//        return branchService.findAll();
//    }
//
//    //obczaic czemu setId na 0
//    @PostMapping
//    public Branch save(@RequestBody Branch branch) {
//        branch.setId(0);
//        return branchService.save(branch);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteById(@PathVariable int id) {
//        branchService.deleteById(id);
//    }
}
