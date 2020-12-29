package org.openjfx;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    public Button tableButton;
    public Button secondaryButton;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void switchToTable() throws IOException {
        App.setRoot("table");
    }
}
