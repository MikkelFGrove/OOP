module com.example.javafxprojects {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens Installation to javafx.fxml;
    opens com.example.javafxprojects to javafx.fxml;
    exports Installation;
    exports com.example.javafxprojects;
}