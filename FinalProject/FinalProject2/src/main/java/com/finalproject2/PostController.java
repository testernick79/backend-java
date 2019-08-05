package com.finalproject2;

import java.util.List;
import org.springframework.http.ResponseEntity;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// mapping/posts
@RestController
@RequestMapping("/api/post")
public class PostController {
	
	@Autowired
	PostRepo postRepo;
	
	//repo
	
	// GET /post -> get method get all posts
//	@GetMapping("/post")
//	public List<Post> getPosts(){
//		List<Post> findAllPosts = postRepo.findAll();
//		return postRepo.findAll();
//	}
	@GetMapping()
	public ResponseEntity<List<Post>> getPosts(){
		List<Post> results = postRepo.findAll();
		return ResponseEntity.ok(results);
	}
	
	// GET /post-1 -> get post by id 1
	
	// POST /POST -> read body to  GET create posts --CREATE--
	
	// DELETE /post-1 -> Delete for posts by id 1 --DELETE--
	
	// PUT /post-1 -> update for posts by id 1 --UPDATE--

}
