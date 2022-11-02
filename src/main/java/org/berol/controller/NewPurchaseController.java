package org.berol.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class NewPurchaseController extends Controller {

    @FXML
    private String newSeriesPath = "/org/berol/fxmlFiles/newSeries.fxml";

    public void switchToPurchaseScreen(ActionEvent event) throws IOException {
        setPath(newSeriesPath);
        createLoader();
        setScene(event);
    }

}
