package com.example.demo;

import com.example.demo.controller.TestController;
import com.example.demo.repository.TestRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages = {"com.example.demo.*"})
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private TestController testController;

	@Autowired
	private TestRepository repository;

	@Test
	public void testGetDataById() {
		//testController.getData(2);
		//repository.getDataById(2);
		com.example.demo.entity.Test t = testController.getData(2);
		System.out.println(t.getT_data());


	}

}
