/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package reversenum;

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
    private TextField num;
    @FXML
    private Button rev;
    @FXML
    private Label ans;
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void reverse(ActionEvent event)
    {
        String a = num.getText();
        String b = "";
        for(int i = a.length()-1; i>=0;i--)
        {
            b = b+a.charAt(i);
            
        }
        
        ans.setText(b);
    }
    
}
