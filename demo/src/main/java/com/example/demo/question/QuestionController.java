package com.example.demo.question;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class QuestionController {

	private final QuestionRepository questionRepository;

	@GetMapping("/question/list")
	public String list(Model model) {
		
		List<Question> qList = this.questionRepository.findAll();
		model.addAttribute("QList",qList);
		
		return "question_list";
	}
	
}
