package com.example.demo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.commons.RecordStatus;
import com.example.demo.user.User;
import com.example.demo.user.UserDTO;
import com.example.demo.user.UserFactory;
import com.example.demo.user.UserRepository;
import com.example.demo.user.UserServiceImpl;
import com.example.demo.user.UserSpecifications;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	/*
	
	@InjectMocks
	private UserServiceImpl userServiceImpl;
	
	@Mock
	UserRepository repo;
	
	@Mock
	UserDTO userDTO;
	
	private static final String id = "8ac0c285705c215701705c2702a80000";
	
	
	@Test
	public void getAllTest() {
		
		 userServiceImpl.findAll(RecordStatus.Active);

		verify(repo).findAll(UserSpecifications.withRecordStatus(RecordStatus.Active));
		
	}
	
	@Test
	public void save() {
		
		userServiceImpl.save(userDTO);
		
		User user = UserFactory.create(userDTO.getFirstname(), userDTO.getLastname(),RecordStatus.Active);
		
		verify(repo).save(user);
		
	}
	
	
	@Test
	public void findById() {
		
		UserDTO userDTO = userServiceImpl.findById(id);
		
		verify(repo).findById(id);
		
	}
	*/
	
}
