package org.berol.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class HomeController extends Controller {

    private String newPurchasePath = "/org/berol/fxmlFiles/newPurchase.fxml";

    @FXML
    public void switchToPurchaseScreen(ActionEvent event) throws IOException {
        setPath(newPurchasePath);
        createLoader();
        setScene(event);
    }
}
