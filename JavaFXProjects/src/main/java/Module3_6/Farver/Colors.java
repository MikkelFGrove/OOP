package Module3_6.Farver;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Colors extends Application {
    Slider redSlider, greenSlider, blueSlider, hueSlider, saturationSlider, valueSlider;

    Label red, green, blue, hue, saturation, value;

    Rectangle inputRect;
    Rectangle outputRect;

    @Override
    public void start(Stage stage) {
        HBox hbox = new HBox(10);
        VBox inputbox = new VBox(10);
        VBox outputbox = new VBox(10);

        redSlider = new Slider(0, 255, 0);
        greenSlider = new Slider(0, 255, 0);
        blueSlider = new Slider(0, 255, 0);
        hueSlider = new Slider(0, 255, 0);
        saturationSlider = new Slider(0, 255, 0);
        valueSlider = new Slider(0, 255, 0);

        inputRect = new Rectangle(50, 50);
        outputRect = new Rectangle(50, 50);

        red = new Label();
        green = new Label();
        blue = new Label();
        hue = new Label();
        saturation = new Label();
        value = new Label();

        red.setText("Red");
        green.setText("Green");
        blue.setText("Blue");
        hue.setText("Hue");
        saturation.setText("Saturation");
        value.setText("Value");

        inputbox.getChildren().addAll(redSlider, greenSlider, blueSlider, hueSlider, saturationSlider, valueSlider);
        outputbox.getChildren().addAll(red, green, blue, hue, saturation, value);

        hbox.getChildren().addAll(inputbox, inputRect, outputbox, outputRect);
        hbox.setAlignment(Pos.CENTER);

        redSlider.setOnMouseDragged(this::newRGB);
        greenSlider.setOnMouseDragged(this::newRGB);
        blueSlider.setOnMouseDragged(this::newRGB);

        hueSlider.setOnMouseDragged(this::newHSV);
        saturationSlider.setOnMouseDragged(this::newHSV);
        valueSlider.setOnMouseDragged(this::newHSV);

        Scene scene = new Scene(hbox);
        stage.setScene(scene);

        stage.show();
    }

    void newRGB(MouseEvent event) {
        RGB rgb = new RGB((int) redSlider.getValue(),
                (int) greenSlider.getValue(),
                (int) blueSlider.getValue());

        HSV hsv = rgb.asHSV();
        hueSlider.setValue(hsv.getH());
        saturationSlider.setValue(hsv.getS());
        valueSlider.setValue(hsv.getV());

        updateInput(rgb);
        updateOutput(hsv);
    }

    void newHSV(MouseEvent event) {
        HSV hsv = new HSV((int) hueSlider.getValue(),
                (int) saturationSlider.getValue(),
                (int) valueSlider.getValue());

        RGB rgb = hsv.asRGB();
        redSlider.setValue(rgb.getR());
        greenSlider.setValue(rgb.getG());
        blueSlider.setValue(rgb.getB());

        updateInput(rgb);
        updateOutput(hsv);
    }

    void updateInput(RGB rgb) {
        inputRect.setFill(Color.rgb(rgb.getR(), rgb.getG(), rgb.getB()));
    }

    void updateOutput(HSV hsv) {
        RGB rgb = hsv.asRGB();
        outputRect.setFill(Color.rgb(rgb.getR(), rgb.getG(), rgb.getB()));
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

