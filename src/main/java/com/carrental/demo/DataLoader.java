//package com.carrental.demo;
//
//import com.carrental.demo.entity.Branch;
//import com.carrental.demo.repository.*;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//
//@Component
//@AllArgsConstructor
//public class DataLoader implements ApplicationRunner {
//
//    private BranchRepository branchRepository;
//    private CarRepository carRepository;
//    private CustomerRepository customerRepository;
//    private EmployeeRepository employeeRepository;
//    private IncomeRepository incomeRepository;
//    private RentalRepository rentalRepository;
//    private ReservationRepository reservationRepository;
//    private ReturnRepository returnRepository;
//
//
//
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        Branch branch = new Branch();
//        branch.setAddress("Zelazna");
//        branch.setCity("Warsaw");
//        branchRepository.save(branch);
//    }
//}
