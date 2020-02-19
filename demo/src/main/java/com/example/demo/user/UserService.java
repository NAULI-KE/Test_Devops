package com.example.demo.user;

import java.util.List;
import com.example.demo.commons.RecordStatus;
import com.example.demo.commons.ResponseDTO;

public interface UserService {

	public ResponseDTO save(UserDTO customerDTO);


	public ResponseDTO update(UserDTO customerDTO);

	public UserDTO findById(String id);

	public List<UserDTO> findAll(RecordStatus recordStatus);

}
