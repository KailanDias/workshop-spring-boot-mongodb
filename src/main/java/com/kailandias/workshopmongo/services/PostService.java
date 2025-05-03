package com.kailandias.workshopmongo.services;

import com.kailandias.workshopmongo.domain.Post;
import com.kailandias.workshopmongo.domain.User;
import com.kailandias.workshopmongo.dto.UserDTO;
import com.kailandias.workshopmongo.repository.PostRepository;
import com.kailandias.workshopmongo.repository.UserRepository;
import com.kailandias.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;


    public Post findById(String id) {
        return repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));

    }

}
