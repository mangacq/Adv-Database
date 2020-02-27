/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement;

import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Bambi
 */
public class CashierController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML
    void Attendance(MouseEvent event) { 
         //For attendance imagebtn
         try{
            FXMLLoader fx1 = new FXMLLoader(getClass().getResource("Attend.fxml"));
            Parent root1 = (Parent)fx1.load();
            Stage s1 = new Stage();
            
            s1.setTitle("Att");
            s1.setScene(new Scene(root1));
            s1.show();
             
        }catch(Exception e){
            System.out.println("weak");
        }
    }

    @FXML
    void Home(MouseEvent event) { 
        //For home imagebtn
         try{
            FXMLLoader fx2 = new FXMLLoader(getClass().getResource("Home.fxml"));
            Parent root2 = (Parent)fx2.load();
            Stage s2 = new Stage();
            
            s2.setTitle("Home");
            s2.setScene(new Scene(root2));
            s2.show();
   
        }catch(Exception e){
            System.out.println("weak");
        }
    }

    @FXML
    void addMember(MouseEvent event) {
        //For addMember imagebtn
            try{
            FXMLLoader fx3 = new FXMLLoader(getClass().getResource("AddMember.fxml"));
            Parent root3 = (Parent)fx3.load();
            Stage s3 = new Stage();
            
            s3.setTitle("Add");
            s3.setScene(new Scene(root3));
            s3.show();
              
        }catch(Exception e){
            System.out.println("weak");
        }
    }

   @FXML
    void Payment(MouseEvent event) {
        //For payment imagebtn
         try{
            FXMLLoader fx4 = new FXMLLoader(getClass().getResource("Payment.fxml"));
            Parent root4 = (Parent)fx4.load();
            Stage s4 = new Stage();
            
            s4.setTitle("Pay");
            s4.setScene(new Scene(root4));
            s4.show();

        }catch(Exception e){
            System.out.println("weak");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
