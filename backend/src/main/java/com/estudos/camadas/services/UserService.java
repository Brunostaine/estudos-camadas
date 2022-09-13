package com.estudos.camadas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.estudos.camadas.dto.UserDTO;
import com.estudos.camadas.entities.User;
import com.estudos.camadas.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Optional<User> entity = repository.findById(id);
		UserDTO dto = new UserDTO(entity);
		return dto;
	}
}
