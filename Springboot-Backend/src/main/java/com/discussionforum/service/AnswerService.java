package com.discussionforum.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discussionforum.auth.security.services.UserDetailsServiceImpl;
import com.discussionforum.dto.AnswerDTO;
import com.discussionforum.entity.Answer;
import com.discussionforum.entity.Question;
import com.discussionforum.entity.Tag;
import com.discussionforum.entity.User;
import com.discussionforum.repository.AnswerRepository;

@Service
@Transactional
public class AnswerService {
	
	private EntityManager entityManager;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private UserDetailsServiceImpl userDetailsService;
	
	@Autowired
	public AnswerService(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	public void save(AnswerDTO answerDto) {
		
		Answer answer = new Answer();
		
        Session session = entityManager.unwrap(Session.class);
		Question question = session.get(Question.class, answerDto.getQuestion_id());
		
		answer.setBody(answerDto.getBody());
		answer.setDate_created(answerDto.getDate_created());
		User user = session.get(User.class, answerDto.getUser_id());
		answer.setUser(user);
		answer.setQuestion(question);
		
		answerRepository.save(answer);
	}
}
