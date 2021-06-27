package com.god.myhome.service;

import com.god.myhome.model.Role;
import com.god.myhome.model.User;
import com.god.myhome.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRespository userRespository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public User Save(User user){
        String encodedpassword= passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedpassword);
        user.setEnabled(true);
        Role role= new Role();
        role.setId(1l);
        user.getRoles().add(role);

    return userRespository.save(user);
    }


}
