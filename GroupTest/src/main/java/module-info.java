module com.example.grouptest {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    requires mysql.connector.j;


    opens com.example.grouptest to javafx.fxml;
    exports com.example.grouptest;
}