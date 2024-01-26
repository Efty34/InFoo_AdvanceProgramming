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

public class rmaController {

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
                new DataItem("GoalKeeper","Thibaut Courtois\nAndriy Lunin\nKepa Arrizabalaga"),
                new DataItem("Defenders","Éder Militão\nDavid Alaba\nAntonio Rüdiger\nNacho Fernández\nFerland Mendy\nFran García\nDaniel Carvajal"),
                new DataItem("MidFielder","Jude Bellingham\nToni Kroos\nLuka Modric\nEduardo Camavinga\nFederico Valverde\nLucas Vázquez\nAurélien Tchouaméni\nDani Ceballos\nBrahim Díaz"),
                new DataItem("Forward","Vinícius Júnior\nRodrygo\nJoselu\nÁlvaro Rodríguez\nGonzalo García")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","Carlo Ancelotti"),
                new DataItem("Assistant Coach","Davide Ancelotti"),
                new DataItem("TECHNICAL ASSISTANT COACH","FRANCESCO " + "MAURI"),
                new DataItem("HEAD FITNESS COACH","ANTONIO\n" +
                        "PINTUS"),
                new DataItem("ASSISTANT TECHNICAL & FITNESS COACH","BENIAMINO" + "FULCO"),
                new DataItem("GOALKEEPER COACH","LUIS " +"LLOPIS")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","3"),
                new DataItem("Continental Ranking","3"),
                new DataItem("National Ranking","1")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("CHAMPIONS LEAGUE","8X"),
                new DataItem("EUROPEAN CHAMPION CLUBS' CUP","6X"),
                new DataItem("5X FIFA CLUB WORLD CUP","5X"),
                new DataItem("SPANISH CHAMPION","35X"),
                new DataItem("UEFA SUPERCUP","5X"),
                new DataItem("UEFA CUP","2X"),
                new DataItem("SPANISH CUP","20X"),
                new DataItem("SPANISH SUPER CUP","12X"),
                new DataItem("INTERCONTINENTAL CUP","3X"),
                new DataItem("COPA EVA DUARTE","1X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","Real Madrid Club de Fútbol"),
                new DataItem("Country","Spain"),
                new DataItem("Website","realmadrid.com"),
                new DataItem("Founded","Mar 6, 1902"),
                new DataItem("Name of stadium","Santiago Bernabéu"),
                new DataItem("Total capacity","81.044"),
                new DataItem("NET WORTH","$6 billion"),
                new DataItem("PRESIDENT","Florentino Pérez"),
                new DataItem("ALL-TIME TOP GOALSCORER","Cristiano Ronaldo(438)"),
                new DataItem("RECORD ARRIVAL","Eden Hazard(€115.00m)"),
                new DataItem("RECORD DEPARTURE","Cristiano Ronaldo(€117.00m)"),
                new DataItem("RIVAL CLUB","FC BARCELONA)"),
                new DataItem("BIGGEST WIN","11-1 Against FC BARCELONA)"),
                new DataItem("BIGGEST LOSS","8-1 Against RCD ESPANOL)")
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
