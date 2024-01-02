package com.springbootpractice.springBootInitializrProject.Service;

import com.springbootpractice.springBootInitializrProject.Question.Question;
import com.springbootpractice.springBootInitializrProject.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService implements IQuestionService{

    public QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public List<Question> getAllQuestionsByCategory(String categoryName) {
        return questionRepository.findByCategory(categoryName);
    }

}
