package com.vti.BlockApp.service;

import com.vti.BlockApp.Entity.Post;
import com.vti.BlockApp.Form.PostCreateForm;
import com.vti.BlockApp.Form.PostUpdateForm;
import com.vti.BlockApp.dto.PostDto;
import com.vti.BlockApp.maper.PostMaper;
import com.vti.BlockApp.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;

    @Override
    public Page<PostDto> findAll(Pageable pageable) {

        //lambda
        //method reference
     return  postRepository.findAll(pageable)
              .map(PostMaper::map);
    }

    @Override
    public PostDto create(PostCreateForm form) {

        var post = PostMaper.map(form);
        var savePost = postRepository.save(post);
        return PostMaper.map(savePost);
    }

    @Override
    public PostDto update(PostUpdateForm form, Long id) {
        var post = PostMaper.map(form);
        post.setId(id);
        var savePost = postRepository.save(post);
        return PostMaper.map(savePost);
    }
}
