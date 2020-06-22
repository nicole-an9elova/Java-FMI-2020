package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class Controller {

    private Alert mb;
    private Alert alertInfo;
    private String output;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnSend;

    @FXML
    private Button btnQuit;

    @FXML
    private TextField txtTo;

    @FXML
    private TextField txtCc;

    @FXML
    private TextField txtBcc;

    @FXML
    private TextField txtSubject;

    @FXML
    private TextField txtMessage;

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        if (ButtonType.OK == mb.showAndWait().get()) {
            Platform.exit();
        }
    }

    @FXML
    void btnSendOnAction(ActionEvent event) {

        alertInfo = new Alert(Alert.AlertType.INFORMATION);
        alertInfo.setTitle("Written Email");
        alertInfo.setContentText("To: " + txtTo.getText() + "\n" + "Cc: " + txtCc.getText() + "\n"
                + "Bcc: " + txtBcc.getText() + "\n" + "Subject: " + txtSubject.getText() + "\n"
                + "Message: " + txtMessage.getText());
        alertInfo.setHeaderText(null);
        alertInfo.show();

    }

    @FXML
    void initialize() {
        txtMessage.setPromptText("Enter text here...");
        mb = new Alert(Alert.AlertType.CONFIRMATION);
        mb.setContentText("Do you really want to quit?");
        mb.setHeaderText(null);
        mb.setTitle("Quit");

    }
}
