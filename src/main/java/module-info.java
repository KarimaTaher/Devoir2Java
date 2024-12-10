module org.example.devoir2java {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires java.sql;
    requires mysql.connector.j;


    opens org.example.devoir2java to javafx.fxml;
    exports org.example.devoir2java;
}