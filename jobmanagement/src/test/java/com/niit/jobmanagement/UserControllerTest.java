package com.niit.jobmanagement;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.niit.jobmanagement.controllers.UserController;
import com.niit.jobmanagement.repos.UserRepository;

public class UserControllerTest {
	
	
	@Autowired
	private UserController userController;


	@Test
	public void testShowRegisterationPage() {
		
	}

	@Test
	public void testRegister() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogin() {
		fail("Not yet implemented");
	}

}
