module org.nick {
    requires javafx.controls;
    requires javafx.fxml;

    exports org.nick.controllers;
    opens org.nick.controllers to javafx.fxml;
}