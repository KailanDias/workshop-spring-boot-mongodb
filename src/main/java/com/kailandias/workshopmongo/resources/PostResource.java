package com.kailandias.workshopmongo.resources;

import com.kailandias.workshopmongo.domain.Post;
import com.kailandias.workshopmongo.domain.User;
import com.kailandias.workshopmongo.dto.UserDTO;
import com.kailandias.workshopmongo.services.PostService;
import com.kailandias.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostResource {

    @Autowired
    private PostService service;

        @GetMapping("/{id}")
        public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
