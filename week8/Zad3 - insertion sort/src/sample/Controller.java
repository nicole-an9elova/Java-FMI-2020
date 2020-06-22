package sample;

import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    private Alert mb;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblUnsorted;

    @FXML
    private Label lblChoice;

    @FXML
    private Label lblSorted;

    @FXML
    private TextField txtUnsorted;

    @FXML
    private TextField txtChoice;

    @FXML
    private TextField txtSorted;

    @FXML
    private Button btnSort;

    @FXML
    private Button btnQuit;

    @FXML
    void btnQuitOnAction(ActionEvent event) {
        if (ButtonType.OK == mb.showAndWait().get()) {
            Platform.exit();
        }
    }

    @FXML
    void btnSortOnAction(ActionEvent event) {
        String input = txtUnsorted.getText();
        String[] inputArr = input.split("\\s+");
        Integer[] inputArrInt = new Integer[inputArr.length];

        for(int i = 0; i < inputArr.length; i++) {
            inputArrInt[i] = Integer.valueOf(inputArr[i]);
        }

        if (txtChoice.getText().matches("[Yy]")) {
            Arrays.sort(inputArrInt);
        } else if (txtChoice.getText().matches("[Nn]")) {
            Arrays.sort(inputArrInt, Collections.reverseOrder());
        } else{
            return;
        }

        txtSorted.setText(Arrays.toString(inputArrInt));
    }

    @FXML
    void initialize() {
        mb = new Alert(Alert.AlertType.CONFIRMATION);
        mb.setTitle("Quit");
        mb.setHeaderText(null);
        mb.setContentText("Do you really want to quit?");


        assert lblUnsorted != null : "fx:id=\"lblUnsorted\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblChoice != null : "fx:id=\"lblChoice\" was not injected: check your FXML file 'sample.fxml'.";
        assert lblSorted != null : "fx:id=\"lblSorted\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtUnsorted != null : "fx:id=\"txtUnsorted\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtChoice != null : "fx:id=\"txtChoice\" was not injected: check your FXML file 'sample.fxml'.";
        assert txtSorted != null : "fx:id=\"txtSorted\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnSort != null : "fx:id=\"btnSort\" was not injected: check your FXML file 'sample.fxml'.";
        assert btnQuit != null : "fx:id=\"btnQuit\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
