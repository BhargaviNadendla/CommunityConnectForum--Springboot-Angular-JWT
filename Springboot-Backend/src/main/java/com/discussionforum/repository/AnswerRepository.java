package com.discussionforum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.discussionforum.entity.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

}
