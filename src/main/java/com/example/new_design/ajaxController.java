package com.example.new_design;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ajaxController {
    @FXML
    private TableView<DataItem> squad;

    @FXML
    private TableColumn<DataItem,String > name;

    @FXML
    private TableColumn<DataItem,String > position;



    @FXML
    private TableView<DataItem> stuff;

    @FXML
    private TableColumn<DataItem,String> nameStuff;

    @FXML
    private TableColumn<DataItem,String> positionStuff;



    @FXML
    private TableView<DataItem> rankingTable;

    @FXML
    private TableColumn<DataItem,String> rank;

    @FXML
    private TableColumn<DataItem,String> ranking;



    @FXML
    private TableView<DataItem> achievementtable;

    @FXML
    private TableColumn<DataItem,String> troname;

    @FXML
    private TableColumn<DataItem,String> trotimes;


    @FXML
    private TableView<DataItem> dataTable;
    @FXML
    private TableColumn<DataItem,String> concol;
    @FXML
    private TableColumn<DataItem,String> infocol;


    @FXML
    private Button backBtn;
    @FXML
    private Button squadBtn;
    @FXML
    private Button achiBtn;

    @FXML
    private Button dataBtn;

    @FXML
    private Button historyBtn;
    @FXML
    private Button rankingBtn;
    @FXML
    private Button stuffBtn;

    public void switchForm(ActionEvent event)
    {
        if(event.getSource()==squadBtn)
        {
            squad.setVisible(true);
            stuff.setVisible(false);
            rankingTable.setVisible(false);
            achievementtable.setVisible(false);
            dataTable.setVisible(false);



        } else if (event.getSource()==stuffBtn) {
            stuff.setVisible(true);
            squad.setVisible(false);
            rankingTable.setVisible(false);
            achievementtable.setVisible(false);
            dataTable.setVisible(false);



        }
        else if (event.getSource()==rankingBtn) {
            stuff.setVisible(false);
            squad.setVisible(false);
            rankingTable.setVisible(true);
            achievementtable.setVisible(false);
            dataTable.setVisible(false);


        }
        else if(event.getSource()==achiBtn)
        {
            stuff.setVisible(false);
            squad.setVisible(false);
            rankingTable.setVisible(false);
            achievementtable.setVisible(true);
            dataTable.setVisible(false);

        }
        else if(event.getSource()==dataBtn)
        {
            stuff.setVisible(false);
            squad.setVisible(false);
            rankingTable.setVisible(false);
            achievementtable.setVisible(false);
            dataTable.setVisible(true);
        }


    }

    public void initialize()
    {
        ObservableList<DataItem> squadlist = FXCollections.observableArrayList(
                new DataItem("GoalKeeper","Gerónimo Rullin\nJay Gorter\nDiant Ramaj"),
                new DataItem("Defenders","Josip Sutalo\nJorrel Hato\nAhmetcan Kaplan\nJakov Medic\nBorna Sosa\nGastón Ávila\nAnass Salah-Eddine"),
                new DataItem("MidFielder","Sivert Mannsverk\nBenjamin Tahirovic\nSilvano Vos\nKenneth Taylor\nBranco van den Boomen\nSteven Berghuis\nKristian Hlynsson"),
                new DataItem("Forward","Steven Bergwijn\nCarlos Forbs\nMika Godts\nAmourricho van Axel Dongen\nBrian Brobbey")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","John van 't Schip"),
                new DataItem("Assistant Coach","Michael Valkanis"),
                new DataItem("TECHNICAL ASSISTANT COACH","Hedwiges Maduro"),
                new DataItem("HEAD FITNESS COACH","Alessandro Schoenmaker"),
                new DataItem("GOALKEEPER COACH","Anton Scheutjens")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","71"),
                new DataItem("Continental Ranking","59"),
                new DataItem("National Ranking","4")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("CHAMPIONS LEAGUE","1X"),
                new DataItem("EUROPEAN CHAMPION CLUBS' CUP","3X"),
                new DataItem("UEFA SUPERCUP","3X"),
                new DataItem("UEFA CUP","1X"),
                new DataItem("CUP WINNERS CUP","1X"),
                new DataItem("DUTCH CHAMPION","36X"),
                new DataItem("DUTCH CUP","20X"),
                new DataItem("DUTCH SUPER CUP","9X"),
                new DataItem("INTERTOTO-CUP","1X"),
                new DataItem("INTERCONTINENTAL CUP","2X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","AFC Ajax Amsterdam"),
                new DataItem("Country","Netherlands"),
                new DataItem("Website","www.ajax.nl/Home.htm"),
                new DataItem("Founded","Mar 18, 1900"),
                new DataItem("Name of stadium","Johan Cruijff ArenA"),
                new DataItem("Total capacity","55.600"),
                new DataItem("NET WORTH","€185.90m"),
                new DataItem("ALL-TIME TOP GOALSCORER","Johan Cruyff(211)"),
                new DataItem("RECORD ARRIVAL","Steven Bergwijn(€31.25m)"),
                new DataItem("RECORD DEPARTURE","Antony(€95.00m)"),
                new DataItem("BIGGEST WIN","14-0 Against Red Boys Differdange"),
                new DataItem("BIGGEST LOSS","6-0 Against SV Limburgia")
        );



        squad.setItems(squadlist);
        name.setCellValueFactory(cellData -> cellData.getValue().valueProperty());
        position.setCellValueFactory(cellData -> cellData.getValue().fieldProperty());

        stuff.setItems(stufflist);
        nameStuff.setCellValueFactory(cellData -> cellData.getValue().valueProperty());
        positionStuff.setCellValueFactory(cellData -> cellData.getValue().fieldProperty());

        rankingTable.setItems(ranklits);
        rank.setCellValueFactory(cellData -> cellData.getValue().valueProperty());
        ranking.setCellValueFactory(cellData -> cellData.getValue().fieldProperty());

        achievementtable.setItems(achievelist);
        troname.setCellValueFactory(cellData -> cellData.getValue().fieldProperty());
        trotimes.setCellValueFactory(cellData -> cellData.getValue().valueProperty());

        dataTable.setItems(datalist);
        concol.setCellValueFactory(cellData -> cellData.getValue().fieldProperty());
        infocol.setCellValueFactory(cellData -> cellData.getValue().valueProperty());

        squad.setVisible(false);
        stuff.setVisible(false);
        rankingTable.setVisible(false);
        achievementtable.setVisible(false);
        dataTable.setVisible(false);

    }

    private Stage stage;
    private Scene scene1;
    private Parent root;


    // For go back to Clubpage
    public void clubpage(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("club.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
}
