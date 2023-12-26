package com.vti.BlockApp.service;

import com.vti.BlockApp.Form.PostCreateForm;
import com.vti.BlockApp.dto.PostDto;

public interface PostService {

    PostDto create(PostCreateForm form);
}
