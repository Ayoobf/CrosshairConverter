module com.example.convertingapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.convertingapp to javafx.fxml;
    exports com.example.convertingapp;
}