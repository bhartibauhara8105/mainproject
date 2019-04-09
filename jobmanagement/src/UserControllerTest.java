package com.niit.jobmanagement;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.aspectj.lang.annotation.Before;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.WebApplicationContext;

import com.niit.jobmanagement.controllers.UserController;
import com.niit.jobmanagement.entities.AbstractEntity;
import com.niit.jobmanagement.entities.User;
import com.niit.jobmanagement.repos.UserRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserControllerTest {
	
	
	//@Autowired
	//private UserController userController;
	  //@Autowired
	  //private UserRepository userRepository;
	   @Mock
	    MessageSource message;
	     
	    @InjectMocks
	    UserController userController;
	  
	    @Spy
	    List<User> users = new ArrayList<User>();
	    

	    @Spy
	    ModelMap model;
	     
	    @Mock
	    BindingResult result;
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
		
	     
	     
	    @Before(value = "")
	    public void setUp(){
	        MockitoAnnotations.initMocks(this);
	       users = getUserList();
	    }
	    
	 


	@Test
	public void testShowRegisterationPage() {
		
	}
	/*@Test
 public void testRegister() throws Exception {
     User user= userRepository.findByEmail("bharti@gmail.com");
     assertThat(user).isNotNull();
	}
*/
	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}
	
//	   @Test
//	    public void listUsers(){
//	        when(service.getCustomers()).thenReturn(customers);
//	        Assert.assertEquals(userController.listCustomers(model), "list-customers");
//	        Assert.assertEquals(model.get("customers"), customers);
//	        verify(service, atLeastOnce()).getCustomers();
//	    }
//	    
	    @Test
	    public void saveCustomer(){
	        when(result.hasErrors()).thenReturn(false);
	        //when(service.isEmployeeSsnUnique(anyInt(), anyString())).thenReturn(true);
	       // doNothing().when(service).saveCustomer(any(User.class));
	       // Assert.assertEquals(userController.saveCustomer(users.get(0)), "redirect:/customer/list");
	    }
	
	public List<User> getUserList()
	{
		User u1=new User(); 
		User u2=new User();
		
		u1.setFirstName("Varun");
		u1.setLastName("Sharma");
		u1.setEmail("varun@gmail.com");
		u1.setPassword("1234");
		u1.setPhone("7648329146");
		u1.setRole("job provider");
	
		u2.setFirstName("Sharmistha");
		u2.setLastName("Bhardwaj");
		u2.setEmail("sammi@gmail.com");
		u2.setPassword("1244");
		u2.setPhone("8648379144");
		u2.setRole("job provider");
		users.add(u1);
		users.add(u2);
		return users;
	}

}
