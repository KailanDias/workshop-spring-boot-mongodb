package com.kailandias.workshopmongo.services;

import com.kailandias.workshopmongo.domain.User;
import com.kailandias.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }


}
