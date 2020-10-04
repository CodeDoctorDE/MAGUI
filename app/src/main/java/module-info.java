module com.github.codedoctorde.mapmods.app {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.github.codedoctorde.mapmods.app to javafx.fxml;
    exports com.github.codedoctorde.mapmods.app;
}