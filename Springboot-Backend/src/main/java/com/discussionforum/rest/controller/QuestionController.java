package com.discussionforum.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.discussionforum.dto.QuestionDTO;
import com.discussionforum.entity.Question;
import com.discussionforum.service.QuestionService;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;

	@PostMapping("/api/list/questions")
	@PreAuthorize("hasRole('USER')")
    public void addQuestion(@RequestBody QuestionDTO dto) {
	
		System.out.println("This is DTO" +dto);
		questionService.save(dto);
	}
	
	@GetMapping("/api/list/questions")
	public List<Question> findAll() {
		return questionService.findAll();
	}
	
	@GetMapping("/api/list/questions/tag/{id}")
	@PreAuthorize("hasRole('USER')")
	public List<Question> findByTagId(@PathVariable Long id) {
		return questionService.findByTagId(id);
	}
}

