package com.kailandias.workshopmongo.resources;

import com.kailandias.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
        public ResponseEntity<List<User>> findAll(){
        User Maria = new User("1", "Maria silva", "maria@gmail.com");
        User alex = new User("2", "alex santos", "alex@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(Maria,alex));
        return ResponseEntity.ok().body(list);
    }

}
