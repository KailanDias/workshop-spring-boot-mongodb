package com.kailandias.workshopmongo.repository;

import com.kailandias.workshopmongo.domain.Post;
import com.kailandias.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post,String> {


    List<Post> findByTitleContainingIgnoreCase(String text);
}
