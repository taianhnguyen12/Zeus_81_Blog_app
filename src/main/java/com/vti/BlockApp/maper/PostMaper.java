package com.vti.BlockApp.maper;

import com.vti.BlockApp.Entity.Post;
import com.vti.BlockApp.Form.PostCreateForm;
import com.vti.BlockApp.dto.PostDto;

public class PostMaper {
    public static  Post map(PostCreateForm form ) {
        var post = new Post();
        post.setTitle(form.getTitle());
        post.setDescription(form.getDescription());
        post.setContent(post.getContent());
        return  post;
    }

    public static PostDto map(Post post) {
        var dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        post.setContent(post.getContent());
        post.setDescription(post.getDescription());
        post.setCreatedAt(post.getCreatedAt());
        post.setUpdatedAt(post.getUpdatedAt());

        return  dto ;
      }
}
