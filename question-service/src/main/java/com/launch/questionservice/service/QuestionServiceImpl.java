package com.launch.questionservice.service;


import com.launch.questionservice.entity.Questions;
import com.launch.questionservice.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;
    @Override
    public Questions add(Questions questions) {
        return questionRepository.save(questions);
    }

    @Override
    public List<Questions> getQuestions() {
        return questionRepository.findAll();
    }

    @Override
    public Questions getQuestion(Long questionId) {
        return questionRepository.findById(questionId).orElseThrow(() -> new RuntimeException("Question not found"));
    }

    @Override
    public List<Questions> getQuestionsByQuizId(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
