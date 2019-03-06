package com.discussionforum.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.discussionforum.dto.TagDTO;
import com.discussionforum.entity.Tag;
import com.discussionforum.service.TagService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TagController {
	
	@Autowired
	private TagService tagService;
	
	@GetMapping("/api/list/tags")
	@PreAuthorize("hasRole('USER')")
	public List<Tag> findAllTags() {
		return tagService.findAll();
	}

	@PostMapping("/api/list/tags")
	@PreAuthorize("hasRole('USER')")
    public void addTag(@RequestBody TagDTO dto) {

		tagService.save(dto);
	}
}
