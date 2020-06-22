package sample;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {

    String[][] arr = new String[30][3];
    LoanComponent component;
    DecimalFormat fmt = new DecimalFormat("0.##");

    public int countDigitsAfterDecimalPoint(double number) {
        String numberCopy = String.valueOf(number);
        int position = numberCopy.indexOf(".");
        String newStr = numberCopy.substring(position + 1, numberCopy.length());
        int count = newStr.length();
        return count;
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txaLoanClass;

    @FXML
    private TextField txtLoanAmount;

    @FXML
    private TextField txtNumberOfYears;

    @FXML
    private Button btnShowTable;

    @FXML
    void btnShowTableOnAction(ActionEvent event) {

        arr[0][0] = "Interest Rate";
        arr[0][1] = "Monthly Payment";
        arr[0][2] = "Total Payment";

        double k = 5.0;
        String str = "";
        str = str + arr[0][0] + "\t\t\t\t" + arr[0][1] + "\t\t\t" + arr[0][2] + "\n";
        for (int i = 1; i < 26; i++) {
            arr[i][0] = String.valueOf(k);

            component = new LoanComponent(k, Double.valueOf(txtLoanAmount.getText()), Integer.parseInt(txtNumberOfYears.getText()));
            int counter = countDigitsAfterDecimalPoint(k);
            String tabs = "";
            switch (counter) {
                case 1:
                case 2:
                    tabs = "\t\t\t\t\t\t";
                    break;
                case 3:
                    tabs = "\t\t\t\t\t";
                    break;
            }
            k += 0.125;
            double temp = component.monthlyPayment();
            arr[i][1] = fmt.format(temp);
            arr[i][2] = fmt.format(temp * 12 * component.getNumberOfYears());
            str = str + arr[i][0] + tabs + arr[i][1] + "\t\t\t\t\t" + arr[i][2];
            str = str + "\n";
        }
        txaLoanClass.setText(str);
    }


    @FXML
    void initialize() {


    }
}

