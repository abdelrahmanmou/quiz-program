/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author mac
 */
public class Person {
    Person()
    {
        String name;
    }
     public VBox showStudentLoginScene(TextField tff, PasswordField pff, Button btnn)
    {
        VBox studentLoginLayout = new VBox(20);
        studentLoginLayout.getChildren().addAll(tff,pff,btnn);
        return studentLoginLayout;
    }
      public VBox showDrLoginScene(TextField tf, PasswordField pf, Button btn)
    {
        VBox DrLoginLayout = new VBox(20);
        DrLoginLayout.getChildren().addAll(tf,pf,btn);
        return DrLoginLayout;
    }
}
