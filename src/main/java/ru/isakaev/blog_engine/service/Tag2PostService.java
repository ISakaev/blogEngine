package ru.isakaev.blog_engine.service;


import ru.isakaev.blog_engine.model.Tag2Post;

import java.util.List;

public interface Tag2PostService {

    List<Tag2Post> findAll();

    Tag2Post getPostById(Integer id);

    void save(Tag2Post post);

    void deletePostById(Integer id);
}
