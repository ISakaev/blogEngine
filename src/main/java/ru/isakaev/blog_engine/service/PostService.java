package ru.isakaev.blog_engine.service;

import ru.isakaev.blog_engine.model.Post;

import java.util.List;

public interface PostService {

    List<Post> findAll();

    Post getPostById(Integer id);

    void save(Post post);

    void deletePostById(Integer id);
}
