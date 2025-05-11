module com.management {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.management to javafx.fxml;
    exports com.management;
}
