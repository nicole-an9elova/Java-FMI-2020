package org.openjfx;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class FXSceneController {

    private Stage mainMenu;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblUserName;

    @FXML
    private Label lblPhoneNumber;

    @FXML
    private Label lblEmailAddress;

    @FXML
    private Label lblPassword;

    @FXML
    private Label lblConfirmPassword;

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnRegister;

    @FXML
    private TextField txtUserName;

    @FXML
    private TextField txtPhoneNumber;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private PasswordField txtConfirm;


    @FXML
    private Label lblUserN;

    @FXML
    private Label lblPhoneNum;

    @FXML
    private Label lblEmail;

    @FXML
    private Label lblPass;

    @FXML
    private Label lblConfPass;

    @FXML
    void btnCancelOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void btnRegisterOnAction(ActionEvent event) {
        boolean usernameValid = txtUserName.getText().matches("[A-z]{2,}");
        boolean phoneNumberValid = txtPhoneNumber.getText().matches("(\\d{4}) (\\d{7})");
        boolean emailValid = txtEmail.getText().matches("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$");
        boolean passwordValid = txtPassword.getText().matches("([0-9]+[A-z]+|[A-z]+[0-9]+)+");

        if (usernameValid == false) {
            lblUserN.setText("User name is incorrect! Try again!");
        } else{
            lblUserN.setText("");
        }

        if(phoneNumberValid == false){
            lblPhoneNum.setText("Phone number is incorrect! Try again!");
        }else{
            lblPhoneNum.setText("");
        }

        if(emailValid == false){
            lblEmail.setText("E-mail is incorrect! Try again!");
        } else{
            lblEmail.setText("");
        }

        if(passwordValid == false){
            lblPass.setText("Password is incorrect! Try again!");
        }else{
            lblPass.setText("");
        }

        if(txtPassword.getText().equals(txtConfirm.getText())){
            lblConfPass.setText("");
        }else{
            lblConfPass.setText("Passwords don't match!");
        }

    }


    @FXML
    void initialize() {
        assert btnCancel != null : "fx:id=\"btnCancel\" was not injected: check your FXML file 'FXScene.fxml'.";
        assert btnRegister != null : "fx:id=\"btnRegister\" was not injected: check your FXML file 'FXScene.fxml'.";
        assert txtUserName != null : "fx:id=\"txtUserName\" was not injected: check your FXML file 'FXScene.fxml'.";
        assert txtPhoneNumber != null : "fx:id=\"txtPhoneNumber\" was not injected: check your FXML file 'FXScene.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'FXScene.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'FXScene.fxml'.";
        assert txtConfirm != null : "fx:id=\"txtConfirm\" was not injected: check your FXML file 'FXScene.fxml'.";

    }
}

