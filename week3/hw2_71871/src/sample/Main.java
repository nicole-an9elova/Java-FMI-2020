package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, 500, 500);

        for (int i = 250, j = 1; i < 400; i = i + 30, j = j + 2) {
            Line line1 = new Line(i, i - 30 * j, i , i );
            line1.setStrokeWidth(2);
            line1.setStroke(Color.RED);
            group.getChildren().add(line1);
        }
        for (int i = 190, j = 2; i > 40; i = i - 30, j = j + 2) {
            Line line2 = new Line(i + 30, i, i + 30, i + 30 * j);
            line2.setStrokeWidth(2);
            line2.setStroke(Color.RED);
            group.getChildren().add(line2);
        }
        for (int i = 220, j = 1; i > 90; i = i - 30, j = j + 2) {
            Line line3 = new Line(i, i + 30 * j, i + 30 * j, i + 30 * j);
            line3.setStrokeWidth(2);
            line3.setStroke(Color.RED);
            group.getChildren().add(line3);
        }
        for (int i = 250, j = 1; i > 120; i = i - 30, j = j + 2) {
            Line line4 = new Line(i - 30, i - 60, i + 30 * j, i - 60);
            line4.setStrokeWidth(2);
            line4.setStroke(Color.RED);
            group.getChildren().add(line4);
        }

        primaryStage.setTitle("Spiral");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
