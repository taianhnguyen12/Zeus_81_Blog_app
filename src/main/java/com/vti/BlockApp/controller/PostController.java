package com.vti.BlockApp.controller;

import com.vti.BlockApp.Form.PostCreateForm;
import com.vti.BlockApp.Form.PostUpdateForm;
import com.vti.BlockApp.dto.PostDto;
import com.vti.BlockApp.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PostController {

private final PostService postService;

@GetMapping("/api/v1/posts")
public Page<PostDto> findAll(Pageable pageable) {

    return postService.findAll(pageable);
}
@PostMapping("/api/v1/posts")
public PostDto create(@RequestBody PostCreateForm form) {
    return postService.create(form);
}

@PutMapping("/api/v1/posts/{id}")
public PostDto update(@RequestBody PostUpdateForm form , @PathVariable("id") Long id ) {
    return postService.update(form, id);
}
}
