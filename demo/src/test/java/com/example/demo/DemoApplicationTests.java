package com.example.demo;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@InjectMocks
	private UserServiceImpl bs;
	
	@Mock
	UserRepository repo;
	
	private static final String id = "2c9ee08170702b180170703ec4bf000";
	
	private RecordStatus recordStatus;
	
	/*@Test
	public void getAllTest() {
		
		bs.findAll(recordStatus.Active);
		
		verify(repo).findAll();
	}
	
	@Test
	public void save() {
		UserDTO b = mock(UserDTO.class);
		
		User user = UserFactory.create(b.getFirstname(), b.getLastname(),RecordStatus.Active);
		
		bs.save(b);
		
		verify(repo).save(user);
		
	}
	*/
	
	@Test
	public void findById() {
		
		UserDTO userDTO = bs.findById(id);
		
		verify(repo).findById(id);
		
	}
	
}
