module org.berol {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.berol to javafx.fxml;
    exports org.berol;
    exports org.berol.controller;
    opens org.berol.controller to javafx.fxml;
}