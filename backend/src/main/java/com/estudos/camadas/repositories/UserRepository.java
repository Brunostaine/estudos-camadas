package com.estudos.camadas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.camadas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
