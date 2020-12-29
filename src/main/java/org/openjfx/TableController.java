package org.openjfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class TableController {


    public Button primaryButton;
    public Button secondaryButton;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
