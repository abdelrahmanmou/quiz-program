/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author mac
 */
public class MyScenes {
    Label []questions = new Label[10];
    
    RadioButton answers[] = new RadioButton[40];
    Doctors D = new Doctors();
    Quiz Q = new Quiz();
    String []answersText= new String[40];

    
    

    
    public VBox showScene1(Button btn1)
    {
        //Question1###########################
        questions[0] = new Label();
        questions[0].setText("1. Which was the first purely object oriented programming language developed?");
        //Answers#############################
        ToggleGroup group1 = new ToggleGroup();
        VBox questionOneLayout = new VBox(20);
        answers[0] = new RadioButton(answersText[0]);
        answers[0].setText("SmallTalk");
        answers[0].setToggleGroup(group1);
        answers[1] = new RadioButton(answersText[1]);
        answers[1].setText("Kotlin");
        answers[1].setToggleGroup(group1);
        answers[2] = new RadioButton(answersText[2]);
        answers[2].setText("C++");
        answers[2].setToggleGroup(group1);
        answers[3] = new RadioButton(answersText[3]);
        answers[3].setText("Java");
        answers[3].setToggleGroup(group1);
        questionOneLayout.getChildren().addAll(questions[0],answers[0],answers[1],answers[2],answers[3],btn1);
        questionOneLayout.setAlignment(Pos.CENTER);
        
        
        return questionOneLayout;
    }
    public VBox showScene2(Button btn2)
    {   //Question2########################### 
        questions[1] = new Label();
        questions[1].setText("2. Which of the following best defines a class?");
        ToggleGroup group2 = new ToggleGroup();
        VBox questionTwoLayout = new VBox(20);
        answers[4] = new RadioButton(answersText[4]);
        answers[4].setText("Instance of an object");
        answers[4].setToggleGroup(group2);
        answers[5] = new RadioButton(answersText[5]);
        answers[5].setText("Parent of an object");
        answers[5].setToggleGroup(group2);
        answers[6] = new RadioButton(answersText[6]);
        answers[6].setText("Blueprint of an object");
        answers[6].setToggleGroup(group2);
        answers[7] = new RadioButton(answersText[7]);
        answers[7].setText("Scope of an object");
        answers[7].setToggleGroup(group2);
        questionTwoLayout.getChildren().addAll(questions[1],answers[4],answers[5],answers[6],answers[7],btn2);
        questionTwoLayout.setAlignment(Pos.CENTER);
        return questionTwoLayout;
    }
    public VBox showScene3(Button btn3)
    {
        //Question3###########################
        questions[2] = new Label();
        questions[2].setText("3. Who invented OOP?");
        ToggleGroup group3 = new ToggleGroup();
        VBox questionThreeLayout = new VBox(20);
        answers[8] = new RadioButton(answersText[8]);
        answers[8].setText("Alan Kay");
        answers[8].setToggleGroup(group3);
        answers[9] = new RadioButton(answersText[9]);
        answers[9].setText("Andrea Ferro");
        answers[9].setToggleGroup(group3);
        answers[10] = new RadioButton(answersText[10]);
        answers[10].setText("Dennis Ritchie");
        answers[10].setToggleGroup(group3);
        answers[11] = new RadioButton(answersText[11]);
        answers[11].setText("Adele Goldberg");
        answers[11].setToggleGroup(group3);
        questionThreeLayout.getChildren().addAll(questions[2],answers[8],answers[9],answers[10],answers[11],btn3);
        questionThreeLayout.setAlignment(Pos.CENTER);
        return questionThreeLayout;
    }
    public VBox showScene4(Button btn4)
    {
        //Question4###########################
        questions[3] = new Label();
        questions[3].setText("4. What is the additional feature in classes that was not in structures?");
        ToggleGroup group4 = new ToggleGroup();
        VBox questionFourLayout = new VBox(20);
        answers[12] = new RadioButton(answersText[12]);
        answers[12].setText("Member functions");
        answers[12].setToggleGroup(group4);
        answers[13] = new RadioButton(answersText[13]);
        answers[13].setText("Data members");
        answers[13].setToggleGroup(group4);
        answers[14] = new RadioButton(answersText[14]);
        answers[14].setText("Static data allowed");
        answers[14].setToggleGroup(group4);
        answers[15] = new RadioButton(answersText[15]);
        answers[15].setText("Public access specifier");
        answers[15].setToggleGroup(group4);
        questionFourLayout.getChildren().addAll(questions[3],answers[12],answers[13],answers[14],answers[15],btn4);
        questionFourLayout.setAlignment(Pos.CENTER);
        return questionFourLayout;
    }
    public VBox showScene5(Button btn5)
    {
        //Question5###########################
        questions[4] = new Label();
        questions[4].setText("5. Which is not feature of OOP in general definitions?");
        ToggleGroup group5 = new ToggleGroup();
        VBox questionFiveLayout = new VBox(20);
        answers[16] = new RadioButton(answersText[16]);
        answers[16].setText("Duplicate/Redundant data");
        answers[16].setToggleGroup(group5);
        answers[17] = new RadioButton(answersText[17]);
        answers[17].setText("Modularity");
        answers[17].setToggleGroup(group5);
        answers[18] = new RadioButton(answersText[18]);
        answers[3*6].setText("Code reusability");
        answers[18].setToggleGroup(group5);
        answers[19] = new RadioButton(answersText[19]);
        answers[19].setText("Efficient Code");
        answers[19].setToggleGroup(group5);
        questionFiveLayout.getChildren().addAll(questions[4],answers[16],answers[17],answers[18],answers[19],btn5);
        questionFiveLayout.setAlignment(Pos.CENTER);
        return questionFiveLayout;
    }
    public VBox showScene6(Button btn6)
    {
        //Question6###########################
        questions[5] = new Label();
        questions[5].setText("6. Which Feature of OOP illustrated the code reusability?");
        ToggleGroup group6 = new ToggleGroup();
        VBox questionSixLayout = new VBox(20);
        answers[20] = new RadioButton(answersText[20]);
        answers[20].setText("Inheritance");
        answers[20].setToggleGroup(group6);
        answers[21] = new RadioButton(answersText[21]);
        answers[21].setText("Polymorphism");
        answers[21].setToggleGroup(group6);
        answers[22] = new RadioButton(answersText[22]);
        answers[22].setText("Abstraction");
        answers[22].setToggleGroup(group6);
        answers[23] = new RadioButton(answersText[23]);
        answers[23].setText("Encapsulation");
        answers[23].setToggleGroup(group6);
        questionSixLayout.getChildren().addAll(questions[5],answers[20],answers[21],answers[22],answers[23],btn6);
        questionSixLayout.setAlignment(Pos.CENTER);
        return questionSixLayout;
    }
    public VBox showScene7(Button btn7)
    { 
        //Question7###########################
        questions[6] = new Label();
        questions[6].setText("7. Which language does not support all 4 types of inheritance?");
        ToggleGroup group7 = new ToggleGroup();
        VBox questionSevenLayout = new VBox(20);
        answers[24] = new RadioButton(answersText[24]);
        answers[24].setText("Java");
        answers[24].setToggleGroup(group7);
        answers[25] = new RadioButton(answersText[25]);
        answers[25].setText("C++");
        answers[25].setToggleGroup(group7);
        answers[26] = new RadioButton(answersText[26]);
        answers[26].setText("Kotlin");
        answers[26].setToggleGroup(group7);
        answers[27] = new RadioButton(answersText[27]);
        answers[27].setText("Python");
        answers[27].setToggleGroup(group7);
        questionSevenLayout.getChildren().addAll(questions[6],answers[24],answers[25],answers[26],answers[27],btn7);
        questionSevenLayout.setAlignment(Pos.CENTER);
        return questionSevenLayout;
    }
    public VBox showScene8(Button btn8)
    {
        //Question8###########################
        questions[7] = new Label();
        questions[7].setText("8. How many classes can be defined in a single program?");
        ToggleGroup group8 = new ToggleGroup();
        VBox questionEightLayout = new VBox(20);
        answers[28] = new RadioButton(answersText[28]);
        answers[28].setText("As many as you want");
        answers[28].setToggleGroup(group8);
        answers[29] = new RadioButton(answersText[29]);
        answers[29].setText("3");
        answers[29].setToggleGroup(group8);
        answers[30] = new RadioButton(answersText[30]);
        answers[30].setText("100");
        answers[30].setToggleGroup(group8);
        answers[31] = new RadioButton(answersText[31]);
        answers[31].setText("999");
        answers[31].setToggleGroup(group8);
        questionEightLayout.getChildren().addAll(questions[7],answers[28],answers[29],answers[30],answers[31],btn8);
        questionEightLayout.setAlignment(Pos.CENTER);
        return questionEightLayout;
    }
    public VBox showScene9(Button btn9)
    {
        //Question9###########################
        questions[8] = new Label();
        questions[8].setText("9.When OOP concept did first came into picture?");
        ToggleGroup group9 = new ToggleGroup();
        VBox questionNineLayout = new VBox(20);
        answers[32] = new RadioButton(answersText[32]);
        answers[32].setText("1970’s");
        answers[32].setToggleGroup(group9);
        answers[33] = new RadioButton(answersText[33]);
        answers[33].setText("1980’s");
        answers[33].setToggleGroup(group9);
        answers[34] = new RadioButton(answersText[34]);
        answers[34].setText("1993");
        answers[34].setToggleGroup(group9);
        answers[35] = new RadioButton(answersText[35]);
        answers[35].setText("1995");
        answers[35].setToggleGroup(group9);
        questionNineLayout.getChildren().addAll(questions[8],answers[32],answers[33],answers[34],answers[35],btn9);
        questionNineLayout.setAlignment(Pos.CENTER);
        return  questionNineLayout;
    }
    public VBox showScene10(Button btn10)
    {
        //Question10###########################
        questions[9] = new Label();
        questions[9].setText("10. Which concept of OOP is false for C++?");
        ToggleGroup group10 = new ToggleGroup();
        VBox questionTenLayout = new VBox(20);
        answers[36] = new RadioButton(answersText[36]);
        answers[36].setText("Code must contain at least one class");
        answers[36].setToggleGroup(group10);
        answers[37] = new RadioButton(answersText[37]);
        answers[37].setText("Code can be written without using classes");
        answers[37].setToggleGroup(group10);
        answers[38] = new RadioButton(answersText[38]);
        answers[38].setText("A class must have member functions");
        answers[38].setToggleGroup(group10);
        answers[39] = new RadioButton(answersText[39]);
        answers[39].setText("At least one object should be declared in code");
        answers[39].setToggleGroup(group10);
        questionTenLayout.getChildren().addAll(questions[9],answers[36],answers[37],answers[38],answers[39],btn10);
        questionTenLayout.setAlignment(Pos.CENTER);
        return  questionTenLayout;
    }
    public VBox showScoreScene()
    {
       VBox scoreLayout = new VBox(20);
       Label scoreLabel = new Label("Exam Finsihed");
       scoreLabel.setAlignment(Pos.CENTER);
       scoreLayout.getChildren().addAll(scoreLabel);
       scoreLayout.setAlignment(Pos.CENTER);
        return  scoreLayout;
    }
    
}
