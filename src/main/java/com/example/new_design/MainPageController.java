package com.example.new_design;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageController {

    @FXML
    private Button player;

    @FXML
    private Button clubBtb;

    @FXML
    private Button leagueBtn;

    @FXML
    private Button collationBtn;
    @FXML
    private Button legendBtn;


    private Stage stage;
    private Scene scene1;
    private Parent root;


    // For Player Page
    public void player(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("player.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For Club Page
    public void club(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("club.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For League Page
    public void league(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("league.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For Collation Page
    public void collation(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("collation.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For Legend Page
    public void legend(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("legend.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }


}