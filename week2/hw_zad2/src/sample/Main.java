package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Path;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group();
        Scene scene = new Scene(group, 400, 400);

        double width = scene.getWidth();
        double height = scene.getHeight();

        for(int i = 0; i < 20; i++) {
            Arc arcBottomLeft = new Arc(0, height, width + i * 20, height,  0, 90);

            arcBottomLeft.setType(ArcType.ROUND);
            arcBottomLeft.setFill(null);
            arcBottomLeft.setStroke(Color.ORANGE);
            group.getChildren().add(arcBottomLeft);

        }
        for(int i = 0; i < 20; i++) {
            Arc arcBottomLeft2 = new Arc(0, height, width, height + i * 20,  0, 90);

            arcBottomLeft2.setType(ArcType.ROUND);
            arcBottomLeft2.setFill(null);
            arcBottomLeft2.setStroke(Color.ORANGE);
            group.getChildren().add(arcBottomLeft2);

        }
        for(int i = 0; i < 20; i++) {
            Arc arcBottomRight = new Arc(width, height, width + i * 20, height, 90, 90);

            arcBottomRight.setType(ArcType.ROUND);
            arcBottomRight.setFill(null);
            arcBottomRight.setStroke(Color.ORANGE);
            group.getChildren().add(arcBottomRight);
        }

        for(int i = 0; i < 20; i++) {
            Arc arcBottomRight2 = new Arc(width, height, width, height + i * 20, 90, 90);

            arcBottomRight2.setType(ArcType.ROUND);
            arcBottomRight2.setFill(null);
            arcBottomRight2.setStroke(Color.ORANGE);
            group.getChildren().add(arcBottomRight2);
        }
        for(int i = 0; i < 20; i++) {
            Arc arcTopRight = new Arc(width, 0, width, height + i * 20, 180, 90);

            arcTopRight.setType(ArcType.OPEN);
            arcTopRight.setFill(null);
            arcTopRight.setStroke(Color.ORANGE);
            group.getChildren().add(arcTopRight);
        }
        for(int i = 0; i < 20; i++) {
            Arc arcTopRight2 = new Arc(width, 0 , width + i * 20, height, 180, 90);

            arcTopRight2.setType(ArcType.ROUND);
            arcTopRight2.setFill(null);
            arcTopRight2.setStroke(Color.ORANGE);
            group.getChildren().add(arcTopRight2);
        }
        for(int i = 0; i < 20; i++) {
            Arc arcTopLeft = new Arc(0,0, width, height + i * 20, 270, 90);

            arcTopLeft.setType(ArcType.ROUND);
            arcTopLeft.setFill(null);
            arcTopLeft.setStroke(Color.ORANGE);
            group.getChildren().add(arcTopLeft);
        }
        for(int i = 0; i < 20; i++) {
            Arc arcTopLeft2 = new Arc(0,0, width + i * 20, height, 270, 90);

            arcTopLeft2.setType(ArcType.ROUND);
            arcTopLeft2.setFill(null);
            arcTopLeft2.setStroke(Color.ORANGE);
            group.getChildren().add(arcTopLeft2);
        }

        primaryStage.setTitle("Arcs!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
