/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author dompl
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private RadioButton r1;
    @FXML
    private RadioButton r2;
    @FXML
    private RadioButton r3;
    @FXML
    private RadioButton r4;
    @FXML
    private TextField numberA;
    @FXML
    private TextField numberB;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        if (r1.isSelected())
        {
            label.setText(String.valueOf(Double.valueOf(numberA.getText())+Double.valueOf(numberB.getText())));
        }
        else if (r2.isSelected())
        {
            label.setText(String.valueOf(Double.valueOf(numberA.getText())-Double.valueOf(numberB.getText())));
        }
        else if (r3.isSelected())
        {
            label.setText(String.valueOf(Double.valueOf(numberA.getText())*Double.valueOf(numberB.getText())));
        }
        else if (r4.isSelected())
        {
            if(Double.valueOf(numberB.getText())==0)
            {
                Alert a = new Alert(Alert.AlertType.ERROR);
                a.setTitle("ERROR");
                a.setHeaderText("NIE DZIEL PRZEZ ZERO");
                a.showAndWait();
            }
            else
            {
            label.setText(String.valueOf(Double.valueOf(numberA.getText())/Double.valueOf(numberB.getText())));
            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
