package com.example.demo.service;

import com.example.demo.entity.Test;
import com.example.demo.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author dengqh
 * @Since 2019/9/16
 */
@Service
public interface TestService {

   public Test getDataById(Integer id);
}
