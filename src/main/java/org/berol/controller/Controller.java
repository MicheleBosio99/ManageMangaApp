package org.berol.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Parent root;
    private Stage stage;
    private Scene scene;
    private FXMLLoader loader;

    private String path;

    public void setPath(String path) { this.path = path; }

    public void createLoader() throws IOException {
        this.loader = new FXMLLoader(getClass().getResource(this.path));
        root = loader.load();
    }

    public FXMLLoader getLoader() { return loader; }

    public void setScene(ActionEvent event) {
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
