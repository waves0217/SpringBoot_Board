package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.answer.Answer;
import com.example.demo.answer.AnswerRepository;
import com.example.demo.question.Question;
import com.example.demo.question.QuestionRepository;

import jakarta.transaction.Transactional;
//	sbb에 대해서 알고 싶습니다.	2023-08-03 13:27:41.391115	sbb가 무엇인가요?
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
    private AnswerRepository answerRepository;
    
	@Transactional	
	@Test
	void JpaTest() {
		Optional<Question> oq = this.questionRepository.findById(2);
        assertTrue(oq.isPresent());
        Question q = oq.get();

        List<Answer> answerList = q.getAnswerList();

        assertEquals(1, answerList.size());
        assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
	}

}
