package com.self.study.zeroThreeZeroFour.domain;


// 문제 관련 객체 생성
public class Question {

    private String question ;  // 질문
    private String answer ;  // 답

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    private String classification;  //분류







}
