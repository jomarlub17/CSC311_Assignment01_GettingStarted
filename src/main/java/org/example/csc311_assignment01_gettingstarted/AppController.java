package org.example.csc311_assignment01_gettingstarted;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class AppController {
    @FXML
    private Label welcomeText;

    // ToDo 01: add two text fields to the GUI so that the user can find the sum
    @FXML
    private TextField field1;

    @FXML
    private TextField field2;


    // ToDo 02: when the button is clicked show the output on the screen
    @FXML
    protected void onCalculateButtonClick() {
        welcomeText.setText("Welcome to JavaFx Application!");
        try {
            field1.setText(String.valueOf(field1.getText()));
            field2.setText(String.valueOf(field2.getText()));

            double sum = Double.parseDouble(field1.getText()) + Double.parseDouble(field2.getText());

            welcomeText.setText(String.valueOf(sum));
            // ToDo 03: you should accept only the numeric values
        } catch (NumberFormatException e) {
            welcomeText.setText("Only numeric values are supported");
        }

    }
}



// ToDo 04: modify the CSS file to make the background of the application Lightblue and the button color red

// ToDo 05: commit changes and push back to the same repo

