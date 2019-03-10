package com.discussionforum.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discussionforum.dto.QuestionDTO;
import com.discussionforum.entity.Question;
import com.discussionforum.entity.Tag;
import com.discussionforum.entity.User;
import com.discussionforum.repository.QuestionRepository;

@Service
@Transactional
public class QuestionService {

private EntityManager entityManager;
	
	@Autowired
	public QuestionService(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	@Autowired
	private QuestionRepository questionRepository;

	public void save(QuestionDTO questionDto) {
		
		Set<Tag> tags = null;
        Session currentSession = entityManager.unwrap(Session.class);
		Tag tag = currentSession.get(Tag.class, questionDto.getTag());
		User user = currentSession.get(User.class, questionDto.getUser());
        tags = new HashSet<>();
        tags.add(tag);
        Question question = new Question();
        question.setTags(tags);
        question.setId(questionDto.getId());
        question.setUser(user);
        question.setBody(questionDto.getBody());
        question.setTitle(questionDto.getTitle());
        question.setView_count(questionDto.getViewCount());
        question.setAnswer_count(questionDto.getAnswerCount());
        question.setDate_created(questionDto.getDateCreated());
	
	    questionRepository.save(question);
	}
	
	public List<Question> findAll() {
		return questionRepository.findAll();
	}

	public List<Question> findByTagId(Long id) {
		
		return questionRepository.findByTagId(id);
	}
}
