package com.god.myhome.repository;


import com.god.myhome.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRespository extends JpaRepository<User, Long> {



}
