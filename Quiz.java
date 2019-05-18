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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;

/**
 *
 * @author mac
 */


public class Quiz extends Application  {
    
    
    
    Stage window;
    Scene scene0,drLoginScene,studentLoginScene,scene1,scene2,scene3,scene4,scene5,scene6,scene7,scene8,scene9,scene10,scene11;
    TextField tf1,tf2;
    PasswordField pf1,pf2;
    Button studentChoiceBtn,doctorChoiceBtn,drLoginButton,studentLoginButton,next1,next2,next3,next4,next5,next6,next7,next8,next9,next10;
    HBox layout0 ;
    int score=0;
    
    
   
    
    public static void main(String[] args) throws FileNotFoundException {
        launch(args);
    }
    @Override 
    public void start (Stage primaryStage) throws Exception {
        window = primaryStage;
        
        Doctors  D = new Doctors();
        Students S = new Students();
        MyScenes M = new MyScenes();
        
        
        //LoginButtons######################################
        drLoginButton= new Button("Login");
        studentLoginButton= new Button("Login");
        //NextButtons######################################
        next1 = new Button("Next");
        next1.setOnAction(e -> {
                window.setScene(scene2);
                if(M.answers[0].isSelected()){score++;}

                });
        next2 = new Button("Next");
        next2.setOnAction(e -> {
            if(M.answers[4].isSelected()){score++;}
            window.setScene(scene3);
        });
        next3 = new Button("Next");
        next3.setOnAction(e -> {
                
                window.setScene(scene4);
                if(M.answers[8].isSelected()){score++;}
                });
        next4 = new Button("Next");
        next4.setOnAction(e -> {
                
                window.setScene(scene5);
                if(M.answers[12].isSelected()){score++;}
                });
        next5 = new Button("Next");
        next5.setOnAction(e ->{ 
            if(M.answers[16].isSelected()){score++;}
                window.setScene(scene6);
                });
        next6 = new Button("Next");
        next6.setOnAction(e ->{
                window.setScene(scene7);
                 if(M.answers[20].isSelected()){score++;}       
                });
        next7 = new Button("Next");
        next7.setOnAction(e ->{
            if(M.answers[24].isSelected()){score++;}
                window.setScene(scene8);
                });
        next8 = new Button("Next");
        next8.setOnAction(e -> {
                if(M.answers[28].isSelected()){score++;}
                window.setScene(scene9);
                });
        next9 = new Button("Next");
        next9.setOnAction(e -> {
                if(M.answers[32].isSelected()){score++;}
                window.setScene(scene10);
                });
        next10 = new Button("Finish Quiz And Show Score");
        next10.setOnAction(e ->{
            if(M.answers[36].isSelected()){score++;}
            window.setScene(scene11);
            System.out.println(score);
                });
        //###############################################
        tf1= new TextField("Username");
        tf2= new TextField("Username");
        pf1= new PasswordField();
        pf2= new PasswordField();
        //Login Scene################################################################################
        drLoginScene = new Scene(D.showDrLoginScene(tf1, pf1, drLoginButton),900,500);
        studentLoginScene = new Scene(S.showStudentLoginScene(tf2, pf2, studentLoginButton),900,500);
        //QuestionOne####################################
        scene1  = new Scene(M.showScene1(next1),900,500);
        //QuestionTwo####################################
        scene2  = new Scene(M.showScene2(next2),900,500);
        //QuestionThree####################################
        scene3  = new Scene(M.showScene3(next3),900,500);
        //QuestionFour####################################
        scene4  = new Scene(M.showScene4(next4),900,500);
        //QuestionFive####################################
        scene5  = new Scene(M.showScene5(next5),900,500);
        //QuestionSix####################################
        scene6  = new Scene(M.showScene6(next6),900,500);
        //QuestionSeven####################################
        scene7  = new Scene(M.showScene7(next7),900,500);
        //QuestionEight####################################
        scene8  = new Scene(M.showScene8(next8),900,500);
        //QuestionNine####################################
        scene9  = new Scene(M.showScene9(next9),900,500);
        //QuestionTen####################################
        scene10 = new Scene(M.showScene10(next10),900,500);
        scene11 = new Scene(M.showScoreScene(),900,500);
                
        

       
        //Main Scene##########################################################
        doctorChoiceBtn= new Button("Doctor");
        doctorChoiceBtn.setOnAction(e ->window.setScene(drLoginScene) );
        studentChoiceBtn= new Button("Student");
        studentChoiceBtn.setOnAction(e ->window.setScene(studentLoginScene) );
        //layout 1
        layout0 = new HBox(20);
        drLoginButton.setOnAction(e -> window.setScene(scene1));
        studentLoginButton.setOnAction(e -> window.setScene(scene1));
        layout0.getChildren().addAll(doctorChoiceBtn,studentChoiceBtn);
        layout0.setAlignment(Pos.CENTER);
        scene0 =new Scene(layout0, 900,500);
       
        
        window.setScene(scene0);
        window.show();
    }
    
        
    
}
