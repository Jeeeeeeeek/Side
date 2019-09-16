package com.example.myapplication;


public class QuestionLibrary {

    private String mQuestions [] = {
            "It is an essential element of object-oriented programming. ",
            "Give the right goals of Object-Oriented Programming",
            "Which does not belong to the four Principle of Object-Oriented Programming.",
            "It will learn to hide unnecessary details in our classes and provide a clear and simple interface for working with them.",
            "Explain how class hierarchies improve code readability and enable the reuse of functionality.",
            "Learn how to work through abstractions: to deal with objects considering their important characteristics and ignore all other details.",
            "To explain how to work in the same manner with different objects, which define a specific implementation of some abstract behavior.",
            "It is is a programming language that uses classes and objects to create models based on the real world environment.",
            "When did Sun Microsystems develops a language (based on C) for consumer electronic devices?",
            "When Sun formally announces Java for web use?"

    };


    private String mChoices [][] = {
            {"Encapsulation", "Abstraction", "Inheritance", "Speculation"},
            {"Easy to teach", "Quick to Manage", "Easier to maintain.", "Convenient to users"},
            {"Encapsulation", "Inheritance", "Abstraction", "Speculation"},
            {"Abstraction", "Encapsulation", "Inheritance", "Insulation"},
            {"Abstraction", "Encapsulation", "Inheritance", "Insulation"},
            {"Abstraction", "Encapsulation", "Inheritance", "Insulation"},
            {"Abstraction", "Encapsulation", "Polymorphism", "Inheritance"},
            {"Java", "C++", "Object-oriented Programming", "Inheritance"},
            {"1989", "1991", "1986", "1995"},
            {"1989", "1991", "1986", "1995"}
    };



    private String mCorrectAnswers[] = {"Abstraction", "Easier to maintain.", "Speculation", "Encapsulation", "Abstraction", "Abstraction", "Polymorphism", "Object-oriented Programming", "1991", "1995"};


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

    public String getChoice4(int a) {
        String choice3 = mChoices[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
