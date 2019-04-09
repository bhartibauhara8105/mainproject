package com.niit.jobmanagement;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.niit.jobmanagement.controllers.UserController;
import com.niit.jobmanagement.entities.User;
import com.niit.jobmanagement.repos.UserRepository;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.*;
//import static org.junit.Assert.assertThat;

 

@RunWith(SpringRunner.class)
@SpringBootTest
public class JobmanagementApplicationTests {

	@Autowired
    private WebApplicationContext wac;
	@Autowired
	 UserRepository userRepository;
	
	@Test
	public void contextLoads() {
	}
	@Test
	 public void testRegister() throws Exception {
	    
		User user= userRepository.findByEmail("bh@gmail.com");
	     assertThat(user).isNotNull();
		}
	
     
}
	


