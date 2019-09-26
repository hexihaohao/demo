package com.example.demo.service.impl;

import com.example.demo.entity.Test;
import com.example.demo.repository.TestRepository;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * @Author dengqh
 * @Since 2019/9/19
 */
@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository repository;

    @Override
    public Test getDataById(Integer id) {
        return repository.getDataById(id);
    }

    public void setRepository(TestRepository repository) {
        this.repository = repository;
    }
}
