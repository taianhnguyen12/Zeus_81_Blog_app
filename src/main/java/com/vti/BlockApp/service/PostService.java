package com.vti.BlockApp.service;

import com.vti.BlockApp.Form.PostCreateForm;
import com.vti.BlockApp.Form.PostUpdateForm;
import com.vti.BlockApp.dto.PostDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface PostService {
    Page<PostDto> findAll(Pageable pageable);


    PostDto create(PostCreateForm form);

    PostDto update(PostUpdateForm form, Long id);

    void deleteById(Long id);
}
