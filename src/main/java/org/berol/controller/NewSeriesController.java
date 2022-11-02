package org.berol.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import org.berol.model.MangaSeries;

import java.io.IOException;
import java.util.Calendar;

public class NewSeriesController extends Controller {

    @FXML
    private TextField titleTextFiledNewSeries;
    @FXML
    private TextField publisherTextFiledNewSeries;
    @FXML
    private TextField priceVolumeTextFiledNewSeries;
    @FXML
    private ToggleButton yFinishedButtonNewSeries;
    @FXML
    private ToggleButton nFinishedButtonNewSeries;
    @FXML
    private ToggleGroup isFinishedGroup;

    private String dataPurchasePath = "/org/berol/fxmlFiles/dataPurchase.fxml";
    private boolean isFinished;

    public void yesNoButton(ActionEvent event) {
        if(event.getSource() == yFinishedButtonNewSeries) {
            this.isFinished = true;
            System.out.println("yes");
        }
        else if (event.getSource() == nFinishedButtonNewSeries) {
            this.isFinished = false;
            System.out.println("no");
        }
        else { }
    }


    public void loadData(ActionEvent event) throws IOException {

        MangaSeries newMangaSeries = new MangaSeries(
                titleTextFiledNewSeries.getText(),
                publisherTextFiledNewSeries.getText(),
                Float.parseFloat(priceVolumeTextFiledNewSeries.getText()),
                Calendar.getInstance(),
                isFinished
        );

        System.out.println(newMangaSeries.toString());

        this.saveDataInJson(newMangaSeries);

        setPath(dataPurchasePath);
        createLoader();

        DataPurchaseController newPurchaseController = getLoader().getController();
        newPurchaseController.setTitleSetTextLabel(newMangaSeries.getTitle());

        setScene(event);

    }

    private void saveDataInJson(MangaSeries newMangaSeries) {
        //save in file mangaData.json
    }
}
