package com.discussionforum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.discussionforum.entity.Question;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

	@Query("select q from Question q join q.tags t where t.id = :#{#id}")
	List<Question> findByTagId(@Param("id") Long id);

}
