package com.my.ubing.springboot.controller;

import com.my.ubing.springboot.controller.dto.PostsResponseDto;
import com.my.ubing.springboot.controller.dto.PostsSaveRequestDto;
import com.my.ubing.springboot.controller.dto.PostsUpdateRequestDto;
import com.my.ubing.springboot.domain.Posts.PostsRepository;
import com.my.ubing.springboot.service.posts.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return postsService.update(id, requestDto);
    }

}