module com.example.demo_lr7 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires com.fasterxml.jackson.annotation;
    requires json.simple;

    opens com.example.demo_lr7 to javafx.fxml;
    exports com.example.demo_lr7;
}