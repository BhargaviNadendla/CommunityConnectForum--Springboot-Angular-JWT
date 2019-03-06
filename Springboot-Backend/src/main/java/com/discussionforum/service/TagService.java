package com.discussionforum.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discussionforum.dto.TagDTO;
import com.discussionforum.entity.Tag;
import com.discussionforum.entity.User;
import com.discussionforum.repository.TagRepository;

@Service
@Transactional
public class TagService {

	@Autowired
	private TagRepository tagRepository;
	
	private EntityManager entityManager;
	
	@Autowired
	public TagService(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	 }
	
	public void save(TagDTO tagDto) {
		Tag tag = new Tag();
        tag.setName(tagDto.getName());
		tag.setUsername(tagDto.getUsername());
		tag.setDate_created(tagDto.getDate_created());
		
		tagRepository.save(tag);
	}

	public List<Tag> findAll() {
		
		return tagRepository.findAll();
	}
}
