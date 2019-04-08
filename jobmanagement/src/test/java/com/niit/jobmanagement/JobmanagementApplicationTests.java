package com.niit.jobmanagement;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import com.niit.jobmanagement.controllers.UserController;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.Matchers.*;

 

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
@ContextConfiguration(classes = JobmanagementApplication.class)
public class JobmanagementApplicationTests {

	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
 public void testRegister() throws Exception {
        mockMvc.perform(get("/registerUser"))
        .andExpect(status().isOk())
        .andExpect(view().name("jsps/login/registerUser"))
        .andExpect(forwardedUrl("/WEB-INF/jsps/login/registerUser.jsp"))
        .andExpect(model().attribute("firstName",nullValue()))
        .andExpect(model().attribute("lastName",isEmptyOrNullString()))
        .andExpect(model().attribute("email",isEmptyOrNullString()))
        .andExpect(model().attribute("password",isEmptyOrNullString()))
        .andExpect(model().attribute("phone",isEmptyOrNullString()))
        .andExpect(model().attribute("role",isEmptyOrNullString()));
        
}
	

}
