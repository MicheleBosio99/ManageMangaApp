package org.berol.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DataPurchaseController extends Controller {

    @FXML
    private Label titleSetTextLabel;

    public void setTitleSetTextLabel(String titleNewSeries) { titleSetTextLabel.setText(titleNewSeries); }
}
