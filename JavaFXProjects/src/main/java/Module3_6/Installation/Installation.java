package Module3_6.Installation;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Installation extends Application {
    @Override
    public void start(Stage stage){
        Button button = new Button("Hello and Goodbye");
        StackPane pane = new StackPane();

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello, World!");
                System.out.println("Goodbye, World!");
                Platform.exit();
            }
        });
        pane.getChildren().add(button);
        stage.setScene(new Scene(pane));

        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
