package com.vti.BlockApp.service;

import com.vti.BlockApp.Form.PostCreateForm;
import com.vti.BlockApp.dto.PostDto;
import com.vti.BlockApp.maper.PostMaper;
import com.vti.BlockApp.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService{

    private final PostRepository postRepository;
    @Override
    public PostDto create(PostCreateForm form) {

        var post = PostMaper.map(form);
        var savePost = postRepository.save(post);
        return PostMaper.map(savePost);
    }
}
