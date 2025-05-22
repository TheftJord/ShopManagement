module com.management {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.management to javafx.fxml, com.google.gson;
    exports com.management;
}
