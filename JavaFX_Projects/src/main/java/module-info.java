module part3.javafx_projects {
    requires javafx.controls;
    requires javafx.fxml;


    opens part3.javafx_projects to javafx.fxml;
    exports part3.javafx_projects;
}