package com.springbootpractice.springBootInitializrProject.Service;

import com.springbootpractice.springBootInitializrProject.Question.Question;

import java.util.List;

public interface IQuestionService {

    List<Question> getAllQuestions();

    List<Question> getAllQuestionsByCategory(String categoryName);
}
