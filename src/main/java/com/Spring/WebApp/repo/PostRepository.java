package com.Spring.WebApp.repo;

import com.Spring.WebApp.Models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PostRepository extends CrudRepository<Post, Long> {


}
