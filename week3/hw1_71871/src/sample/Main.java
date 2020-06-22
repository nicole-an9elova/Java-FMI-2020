package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.nio.channels.spi.AbstractSelectionKey;
import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Main extends Application {

    public static String inputDialog(String infoMessage, String titleBar, String headerMessage) {
        TextInputDialog dialog = new TextInputDialog();
        dialog.setTitle(titleBar);
        dialog.setContentText(infoMessage);
        dialog.setHeaderText(headerMessage);
        return dialog.showAndWait().get();
    }

    public static void changeRed(int inputYear, int inputMonth, Text calendarEl, String daysInCalendar) {
        int getCurrentDay = LocalDate.now().getDayOfMonth();
        String getCurrentDayStr = Integer.toString(getCurrentDay);
        int getCurrentMonth = LocalDate.now().getMonthValue();
        int getCurrentYear = LocalDate.now().getYear();

        if (inputYear == getCurrentYear && inputMonth == getCurrentMonth) {
            if (daysInCalendar.contentEquals(getCurrentDayStr)) {
                calendarEl.setFill(Color.RED);
            }
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        Scene scene = new Scene(pane);
        String mess = inputDialog("Enter date:", "Calendar Entry", "month/year");
        int separator = mess.indexOf("/");
        String month = mess.substring(0, separator);
        String year = mess.substring(separator + 1, mess.length());

        int monthInt = Integer.valueOf(month);
        int yearInt = Integer.valueOf(year);


        Text text1 = new Text(10, 20, "MON");
        text1.setFont(Font.font("Courier", FontWeight.BOLD, 15));
        Text text2 = new Text(50, 20, "TUE");
        text2.setFont(Font.font("Courier", FontWeight.BOLD, 15));
        Text text3 = new Text(90, 20, "WED");
        text3.setFont(Font.font("Courier", FontWeight.BOLD, 15));
        Text text4 = new Text(130, 20, "THR");
        text4.setFont(Font.font("Courier", FontWeight.BOLD, 15));
        Text text5 = new Text(170, 20, "FRI");
        text5.setFont(Font.font("Courier", FontWeight.BOLD, 15));
        Text text6 = new Text(210, 20, "SAT");
        text6.setFont(Font.font("Courier", FontWeight.BOLD, 15));
        Text text7 = new Text(250, 20, "SUN");
        text7.setFont(Font.font("Courier", FontWeight.BOLD, 15));

        pane.getChildren().add(text1);
        pane.getChildren().add(text2);
        pane.getChildren().add(text3);
        pane.getChildren().add(text4);
        pane.getChildren().add(text5);
        pane.getChildren().add(text6);
        pane.getChildren().add(text7);

        YearMonth yearMonthObj = YearMonth.of(yearInt, monthInt);
        int daysInMonth = yearMonthObj.lengthOfMonth();


        DayOfWeek firstDay = LocalDate.of(yearInt, monthInt, 1).getDayOfWeek();
        String day = firstDay.toString();

        int counter = 0;
        int day1 = 0;
        switch (day) {
            case "MONDAY":
                counter = 0;
                break;
            case "TUESDAY":
                counter = 1;
                break;
            case "WEDNESDAY":
                counter = 2;
                break;
            case "THURSDAY":
                counter = 3;
                break;
            case "FRIDAY":
                counter = 4;
                break;
            case "SATURDAY":
                counter = 5;
                break;
            case "SUNDAY":
                counter = 6;
                break;
        }
        for (int i = counter, days = 1; days <= daysInMonth; i++, days++) {
            String days2 = Integer.toString(days);
            Text calendar = new Text(10 + (i * 40), 60, days2);
            changeRed(yearInt, monthInt, calendar, days2);

            if (counter >= 7 && counter < 14) {
                calendar = new Text((10 + i * 40) - 280, 100, days2);
                changeRed(yearInt, monthInt, calendar, days2);
            } else if (counter >= 14 && counter < 21) {
                calendar = new Text((10 + i * 40) - 280 * 2, 140, days2);
                changeRed(yearInt, monthInt, calendar, days2);
            } else if (counter >= 21 && counter < 28) {
                calendar = new Text((10 + i * 40) - 280 * 3, 180, days2);
                changeRed(yearInt, monthInt, calendar, days2);
            } else if (counter >= 28 && counter < 35) {
                calendar = new Text((10 + i * 40) - 280 * 4, 220, days2);
                changeRed(yearInt, monthInt, calendar, days2);
            } else if (counter >= 35) {
                calendar = new Text((10 + i * 40) - 280 * 5, 260, days2);
                changeRed(yearInt, monthInt, calendar, days2);
            }
            pane.getChildren().add(calendar);
            counter++;
        }

        primaryStage.setTitle("CALENDAR");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
