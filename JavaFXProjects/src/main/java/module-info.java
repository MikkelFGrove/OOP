module com.example.javafxprojects {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;


    opens Module3_7.Installation to javafx.fxml;
    opens Module3_6.Installation to javafx.fxml;
    opens com.example.javafxprojects to javafx.fxml;
    exports Module3_7.Installation;
    exports Module3_6.Installation;
    exports com.example.javafxprojects;
    exports Module3_6.Farver;


}