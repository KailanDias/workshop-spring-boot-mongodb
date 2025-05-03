package com.kailandias.workshopmongo.config;

import com.kailandias.workshopmongo.domain.User;
import com.kailandias.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository repository;


    @Override
    public void run(String... args) throws Exception {

        repository.deleteAll();

        User maria = new User(null, "Maria Brown", "Maria@gmail.com");
        User alex = new User(null, "Alex Silva", "Alex@gmail.com");
        User bob = new User(null, "Bob Grey", "Bob@gmail.com");

        repository.saveAll(Arrays.asList(maria, alex, bob));

    }
}
