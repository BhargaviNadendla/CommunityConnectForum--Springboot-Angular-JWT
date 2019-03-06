package com.discussionforum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.discussionforum.entity.Question;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}
