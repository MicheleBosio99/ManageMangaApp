module org.berol {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    exports org.berol;
    exports org.berol.controller;
    exports org.berol.model;

    opens org.berol.controller to javafx.fxml;
    opens org.berol.model to com.google.gson;
    opens org.berol to javafx.fxml;
}