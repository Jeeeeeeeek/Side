package com.example.myapplication;


public class QuestionLibrary {

    private String mQuestions [] = {
            "It is an essential element of object-oriented programming. ",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bees, butterflies and hummingbirds.",
            "The _______ holds the plant upright."

    };


    private String mChoices [][] = {
            {"Encapsulation", "Abstraction", "Inheritance"},
            {"Fruit", "Leaves", "Seeds"},
            {"Bark", "Flower", "Roots"},
            {"Flower", "Leaves", "Stem"}
    };



    private String mCorrectAnswers[] = {"Abstraction", "Leaves", "Flower", "Stem"};


    public int getQuestionSize(){
        int size = mQuestions.length;
        return size;
    }

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
