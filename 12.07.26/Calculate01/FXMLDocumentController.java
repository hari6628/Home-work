/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package calculate01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Label lab1;
    @FXML
    private TextField val1;
    @FXML
    private Label lab2;
    @FXML
    private TextField val2;
    @FXML
    private Button add;
    @FXML
    private Button sub;
    @FXML
    private Button div;
    @FXML
    private Button mul;
    @FXML
    private Label ans;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ad(ActionEvent event) 
    {
        int  one = Integer.parseInt(val1.getText());
        int two = Integer.parseInt(val2.getText());
        int sum = one + two;
        ans.setText(Integer.toString(sum));
    }

    @FXML
    private void sub1(ActionEvent event) 
    {
        int  one = Integer.parseInt(val1.getText());
        int two = Integer.parseInt(val2.getText());
        int sum = one - two;
        ans.setText(Integer.toString(sum));
    }

    @FXML
    private void div1(ActionEvent event) 
    {
        int  one = Integer.parseInt(val1.getText());
        int two = Integer.parseInt(val2.getText());
        int sum = (one)/(two);
        ans.setText(Integer.toString(sum));
    }

    @FXML
    private void mul1(ActionEvent event)
    {
        int  one = Integer.parseInt(val1.getText());
        int two = Integer.parseInt(val2.getText());
        int sum = one *two;
        ans.setText(Integer.toString(sum));
    }

   @FXML
private void reset(ActionEvent event) {
    val1.clear();
    val2.clear();
    ans.setText("");
}
    
}
