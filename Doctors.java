/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quiz;
import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;
/**
 *
 * @author mac
 */
public  class Doctors  extends Person{
    TextField drUserName;
    PasswordField drPassword;
    Button drLoginBtn;
    /*//FILE READER METHOD
    public  String[] readFile() throws FileNotFoundException{
        File file = new File("/Users/mac/Desktop/Questions.txt");
        Scanner scan = new Scanner(file);
        for (int i =0; i <= questions.length; i ++)
        {
           questions[i] = scan.nextLine();
        }
        
       return questions; 
    }*/
   final public VBox showDrLoginScene(TextField tf, PasswordField pf, Button btn)
    {
        VBox DrLoginLayout = new VBox(20);
        DrLoginLayout.getChildren().addAll(tf,pf,btn);
        return DrLoginLayout;
    }
    
    
    
}
