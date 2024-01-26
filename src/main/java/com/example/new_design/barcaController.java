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


public class barcaController {
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
                new DataItem("GoalKeeper","Marc-André ter Stegen\nIñaki Peña\nAnder Astralaga"),
                new DataItem("Defenders","João Cancelo\nAlejandro Balde\nRonald Araújo\nIñigo Martínez\nMarcos Alonso\nSergi Roberto\nJules Koundé"),
                new DataItem("MidFielder","Gavi \nPedri\nLuka Modric\nOriol Romeu\nFrenkie de Jong\nIlkay Gündogan\nAurélien Tchouaméni\nÁngel Alarcón\nMarc Casadó"),
                new DataItem("Forward","Ferran Torres\nRobert Lewandowski\nRaphinha\nJoão Félix\nLamine Yamal")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","Xavi"),
                new DataItem("Assistant Coach","Óscar Hernández"),
                new DataItem("TECHNICAL ASSISTANT COACH","Iván Torres"),
                new DataItem("HEAD FITNESS COACH","ANTONIO\n" +
                        "PINTUS"),
                new DataItem("ASSISTANT TECHNICAL & FITNESS COACH","Andrés Martín"),
                new DataItem("GOALKEEPER COACH","José de la Fuente")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","6"),
                new DataItem("Continental Ranking","6"),
                new DataItem("National Ranking","2")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("CHAMPIONS LEAGUE","4X"),
                new DataItem("EUROPEAN CHAMPION CLUBS' CUP","1X"),
                new DataItem("FIFA CLUB WORLD CUP","3X"),
                new DataItem("SPANISH CHAMPION","27X"),
                new DataItem("UEFA SUPERCUP","5X"),
                new DataItem("UEFA CUP","2X"),
                new DataItem("SPANISH CUP","31X"),
                new DataItem("INTER-CITIES FAIRS CUP","3X"),
                new DataItem("SPANISH SUPER CUP","14X"),
                new DataItem("COPA CATALUNYA","9X"),
                new DataItem("COPA EVA DUARTE","3X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","Futbol Club Barcelona"),
                new DataItem("Country","Spain"),
                new DataItem("Website","fcbarcelona.com"),
                new DataItem("Founded","Nov 29, 1899"),
                new DataItem("Name of stadium","Olímpic Lluís Companys"),
                new DataItem("Total capacity","55.926"),
                new DataItem("NET WORTH","€862.00m"),
                new DataItem("PRESIDENT","Joan Laporta"),
                new DataItem("ALL-TIME TOP GOALSCORER","Lionel Messi(672)"),
                new DataItem("RECORD ARRIVAL","Philippe Coutinho(€135.00m)"),
                new DataItem("RECORD DEPARTURE","Neymar(€222.00m)"),
                new DataItem("RIVAL CLUB","REAL MADRID CF)"),
                new DataItem("BIGGEST WIN","10-1 Against CD Basconia)"),
                new DataItem("BIGGEST LOSS","12-1 Against RCD Athletic Bilbao)")
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
