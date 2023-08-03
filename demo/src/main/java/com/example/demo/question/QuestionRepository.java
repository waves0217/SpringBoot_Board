package com.example.demo.question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	
	Question findBySubject(String subject);									//제목으로 검색
	Question findBySubjectAndContent(String subject, String Content);		//제목,내용으로 검색
	List<Question> findBySubjectLike(String subject);						//제목에 특정 문자열이 포함되어 있는 데이터 검색
	
}
