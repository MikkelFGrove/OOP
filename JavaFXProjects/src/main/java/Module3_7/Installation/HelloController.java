package Module3_7.Installation;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {
    @FXML private Button button;

    @FXML public void initialize(){

    }

    @FXML
    private void action (){
        System.out.println("Hello, World!");
        System.out.println("Goodbye, World!");
        Platform.exit();
    }
}
