package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    private Alert mb;
    private Alert forKey;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnSearch;

    @FXML
    private Button btnQuit;

    @FXML
    private Label lblArr;

    @FXML
    private Label lblKey;

    @FXML
    private Label lblResult;

    @FXML
    private TextField txtInput;

    @FXML
    private TextField txtKey;

    @FXML
    private TextField txtResult;

    private void search(String[] results, int key){
        String temp = " ";

        for (int i = 0; i < results.length; i++) {
            int resultInt = Integer.parseInt(results[i]);
            if(resultInt == key){
                temp = "Found value in element " + (i + 1);
                break;
            }else{
                temp = "Search key not found";
            }
        }
        txtResult.setText(temp);
    }


    @FXML
    void btnQuitOnAction(ActionEvent event) {
        if (ButtonType.OK == mb.showAndWait().get()) {
            Platform.exit();
        }
    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {
        int  newKey = 0;
        String input = txtInput.getText();
        String[] results = input.split("\\s+");
        String key = txtKey.getText();
        if (!key.matches("\\d+")) {
            forKey.showAndWait();
        }else{
            newKey = Integer.parseInt(key);
            search(results, newKey);
        }

    }

    @FXML
    void initialize() {
        mb = new Alert(Alert.AlertType.CONFIRMATION);
        mb.setTitle("Quit");
        mb.setHeaderText(null);


        forKey = new Alert(Alert.AlertType.ERROR);
        forKey.setTitle("Error");
        forKey.setHeaderText(null);
        forKey.setContentText("The key must be a digit number! Try again!");

        assert btnSearch != null : "fx:id=\"btnSearch\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblArr != null : "fx:id=\"lblArr\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblKey != null : "fx:id=\"lblKey\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblResult != null : "fx:id=\"lblResult\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtInput != null : "fx:id=\"txtInput\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtKey != null : "fx:id=\"txtKey\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
