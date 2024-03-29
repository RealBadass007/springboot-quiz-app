package com.springbootpractice.springBootInitializrProject.Repository;

import com.springbootpractice.springBootInitializrProject.Question.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

    List<Question> findByCategory(String categoryName);

}
