module hw5_zad3 {

    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx to javafx.fxml;
    exports org.openjfx;
}