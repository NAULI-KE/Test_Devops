package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.commons.RecordStatus;
import com.example.demo.commons.ResponseDTO;
import com.example.demo.user.UserDTO;
import com.example.demo.user.UserService;


@RestController
@RequestMapping("/user")
public class UsersController {
	@Autowired
	private UserService userService;

	@GetMapping("/GetAllActiveUsers")
	public List<UserDTO> index() {

		return userService.findAll(RecordStatus.Active);
	}

	@PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
	public ResponseDTO create(@RequestBody UserDTO userDTO) {

		return userService.save(userDTO);

	}
	
	@GetMapping("/GetUserById/{id}")
	public UserDTO findById(@PathVariable("id") String id) {

	    return userService.findById(id);
}
	@PostMapping("/EditUserById/{id}")
	public ResponseDTO editUser(@PathVariable("id") String id, @RequestBody UserDTO userDTO) {
		
		UserDTO u = userService.findById(id);
		
		u.setFirstname(userDTO.getFirstname());
		
		u.setLastname(userDTO.getLastname());
		
		ResponseDTO responseDTO = userService.update(userDTO);
		
		return responseDTO;
		
	}
}
