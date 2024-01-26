package com.example.new_design;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class leagueController {
    @FXML
    private Button clBtn;

    @FXML
    private Button eplBtn;

    @FXML
    private Button laBtn;

    @FXML
    private Button backBtn;

    private Stage stage;
    private Scene scene1;
    private Parent root;


    // For MainPage Page
    public void mainpage(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }


    // For EPL Page
    public void eplpage(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("epl.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For LaLiga Page
    public void laliga(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("laliga.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For UCL Page
    public void ucl(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("chl.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

}
