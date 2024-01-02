package com.springbootpractice.springBootInitializrProject.Controller;

import com.springbootpractice.springBootInitializrProject.Question.Question;
import com.springbootpractice.springBootInitializrProject.Service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    public IQuestionService questionService;

    @Autowired
    public QuestionController(IQuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{categoryname}")
    public List<Question> getAllQuestions(@PathVariable("categoryname") String categoryName) {
        return questionService.getAllQuestionsByCategory(categoryName);
    }

}
