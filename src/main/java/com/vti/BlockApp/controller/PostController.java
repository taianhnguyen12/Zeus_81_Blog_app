package com.vti.BlockApp.controller;

import com.vti.BlockApp.Form.PostCreateForm;
import com.vti.BlockApp.dto.PostDto;
import com.vti.BlockApp.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class PostController {

private final PostService postService;


@PostMapping("/api/v1/posts")
public PostDto create(@RequestBody PostCreateForm form) {
    return postService.create(form);
}

}
