package com.example.demo.user;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.commons.RecordStatus;
import com.example.demo.commons.ResponseDTO;
import com.example.demo.commons.ResponseMessage;
import com.example.demo.commons.ResponseStatus;
import com.example.demo.utils.ListUtil;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private ModelMapper modelMapper;

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository UserRepository;

	@Override
	public ResponseDTO save(UserDTO UserDTO) {

		try {

			User User = UserFactory.create(UserDTO.getFirstname(), UserDTO.getLastname(),RecordStatus.Active);

			logger.info("Create Class -> {}", User.toString());

			User = UserRepository.save(User);

			ResponseDTO responseDTO = new ResponseDTO();

			responseDTO.setData(modelMapper.map(User, UserDTO.class));

			responseDTO.setStatus(ResponseStatus.Success);

			responseDTO.setMessage("User " + ResponseMessage.CreateSuccess.message);

			return responseDTO;

		} catch (Exception ex) {

			logger.error("Create Class -> {}", ex);

			ResponseDTO responseDTO = new ResponseDTO();

			responseDTO.setData(UserDTO);

			responseDTO.setStatus(ResponseStatus.Failed);

			responseDTO.setMessage("User " + ResponseMessage.CreateFailed.message);

			return responseDTO;
		}

	}

	@Override
	public ResponseDTO update(UserDTO UserDTO) {

		try {

			User user = UserFactory.UpdateUser(UserDTO.getFirstname(), UserDTO.getLastname(),RecordStatus.Active);

			logger.info("Update User -> {}", user.toString());

			user = UserRepository.save(user);

			ResponseDTO responseDTO = new ResponseDTO();

			responseDTO.setData(modelMapper.map(user, UserDTO.class));

			responseDTO.setStatus(ResponseStatus.Success);

			responseDTO.setMessage("User " + ResponseMessage.UpdateSuccess.message);

			return responseDTO;

		} catch (Exception ex) {

			logger.error("Update Users -> {}", ex);

			ResponseDTO responseDTO = new ResponseDTO();

			responseDTO.setData(UserDTO);

			responseDTO.setStatus(ResponseStatus.Failed);

			responseDTO.setMessage("User " + ResponseMessage.UpdateFailed.message);

			return responseDTO;
		}

	}

	@Override
	public UserDTO findById(String id) {

		try {

			User User = UserRepository.findById(id).get();

			return modelMapper.map(User, UserDTO.class);

		} catch (Exception ex) {

			logger.error("findById User -> {}", ex);

			return null;
		}

	}

	@Override
	public List<UserDTO> findAll(RecordStatus recordStatus) {

		try {

			Iterable<User> Users = UserRepository.findAll(UserSpecifications.withRecordStatus(recordStatus));

			return ListUtil.toList(Users).stream().map(entity -> modelMapper.map(entity, UserDTO.class))
					.collect(Collectors.toList());

		} catch (Exception ex) {

			logger.error("findAll User -> {}", ex);

			return null;
		}
	}

}
