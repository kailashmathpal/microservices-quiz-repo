package com.launch.questionservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "QUESTION_DB")
public class Questions {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QUESTION_ID")
    private Long questionId;
    @Column(name = "QUESTION")
    private String question;
    @Column(name = "QUIZ_ID")
    private Long quizId;


}
