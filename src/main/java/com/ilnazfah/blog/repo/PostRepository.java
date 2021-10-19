package com.ilnazfah.blog.repo;

import com.ilnazfah.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

}