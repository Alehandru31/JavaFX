module com.example.javafxcapitol1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxcapitol1 to javafx.fxml;
    exports com.example.javafxcapitol1;
}