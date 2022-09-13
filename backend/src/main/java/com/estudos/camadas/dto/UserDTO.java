package com.estudos.camadas.dto;

import java.util.Optional;

import com.estudos.camadas.entities.User;

public class UserDTO {
	
	private Long id;
	private String name;


	public UserDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public UserDTO(Optional<User> entity) {
		id = entity.get().getId();
		name = entity.get().getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
