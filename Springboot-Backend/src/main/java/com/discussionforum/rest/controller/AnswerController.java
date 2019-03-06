package com.discussionforum.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.discussionforum.dto.AnswerDTO;
import com.discussionforum.service.AnswerService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class AnswerController {

	@Autowired
	private AnswerService answerService;
	
	@PostMapping("/api/list/answers")
	@PreAuthorize("hasRole('USER')")
	public void addAnswer(@RequestBody AnswerDTO dto) {
		
		answerService.save(dto);
	}
}
