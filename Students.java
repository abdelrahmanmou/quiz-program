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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;

/**
 *
 * @author mac
 */
public class Students extends Person{
    
    TextField studentUserName;
    PasswordField studentPassword;
    Button studentLoginBtn;
  final  public VBox showStudentLoginScene(TextField tff, PasswordField pff, Button btnn)
    {
        VBox studentLoginLayout = new VBox(20);
        studentLoginLayout.getChildren().addAll(tff,pff,btnn);
        return studentLoginLayout;
    }
    
}
