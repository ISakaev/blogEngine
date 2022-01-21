package ru.isakaev.blog_engine.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.isakaev.blog_engine.model.Tag;
import ru.isakaev.blog_engine.model.Tag2Post;
import ru.isakaev.blog_engine.repo.PostRepository;
import ru.isakaev.blog_engine.repo.Tag2PostRepository;
import ru.isakaev.blog_engine.repo.TagRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TagServiceImpl implements TagService {

    private final TagRepository tagRepository;

    private final PostRepository postRepository;

    private final Tag2PostRepository tag2PostRepository;


    @Override
    public List<Tag> findAll() {

        return tagRepository.findAll();
    }

    @Override
    public Tag getPostById(Integer id) {
        return null;
    }

    @Override
    public void save(Tag tag) {

    }

    @Override
    public void deletePostById(Integer id) {

    }

    @Override
    public List<Tag> findAllStartWith(String query) {
        List<Tag> newTags = new ArrayList<>();
        if (query != null){
            newTags = tagRepository.findAll().stream().filter(tag -> tag.getName().startsWith(query)).collect(Collectors.toList());
        }else{
            newTags = tagRepository.findAll();
        }
        Long postCount = postRepository.count();

        List<Tag2Post> tag2Posts = tag2PostRepository.findAll();

//        newTags.stream().map(tag ->
//                new TagWeightDto(
//                        tag.getName(),
//                        {
//                            tag2Posts.stream().filter(tag2Post -> tag2Post.getTag().equals(tag)).count()
//
//                        }))
        return null;
    }
}
