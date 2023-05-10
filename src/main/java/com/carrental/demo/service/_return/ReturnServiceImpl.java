package com.carrental.demo.service._return;

import com.carrental.demo.repository.ReturnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnServiceImpl {

    private final ReturnRepository returnRepository;

    @Autowired
    public ReturnServiceImpl(ReturnRepository returnRepository) {
        this.returnRepository = returnRepository;
    }
}
