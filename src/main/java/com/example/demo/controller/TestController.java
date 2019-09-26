package com.example.demo.controller;

import com.example.demo.entity.Test;
import com.example.demo.service.TestService;
import org.hibernate.annotations.Parameter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author dengqh
 * @Since 2019/9/16
 */
@Controller
@RequestMapping("/test")
public class TestController {
    private final Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @RequestMapping(value = "getdata/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Test getData(@Param("id") Integer id){
        Test testEntity = testService.getDataById(id);
        log.info("entity===:"+testEntity.toString());
        log.error("error..");
        log.warn("warning..");
        log.trace("trace..");
        log.debug("debug..");
        /*String a = "";
        try {
            System.out.println(a.substring(1,3));
                log.info("存在");
        }catch (Exception e){
            log.error(e.getLocalizedMessage());
        }*/

        return testEntity;
    }

}
