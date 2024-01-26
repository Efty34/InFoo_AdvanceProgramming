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

public class cityController {
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
                new DataItem("GoalKeepers","Ederson\nStefan Ortega\nZack Steffen"),
                new DataItem("Defenders","Kyle Walker\nRúben Dias\nJohn Stones\nNathan Aké\nManuel Akanji\nRico Lewis\nJosko Gvardiol"),
                new DataItem("MidFielders","Kalvin Phillips\nMateo Kovacic\nJack Grealish\nRodri\nKevin De Bruyne\nBernardo Silva\nSergio Gómez\nPhil Foden\nMicah Hamilton"),
                new DataItem("Forwards","Erling Haaland\nJérémy Doku\nJulián Álvarez")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","Pep Guardiola"),
                new DataItem("Assistant Coach","Juanma Lillo"),
                new DataItem("TECHNICAL ASSISTANT COACH","Nicolas Jover"),
                new DataItem("HEAD FITNESS COACH","Nick Chadd"),
                new DataItem("ASSISTANT TECHNICAL & FITNESS COACH","José Cabello"),
                new DataItem("GOALKEEPER COACH","Richard Wright")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","1"),
                new DataItem("Continental Ranking","1"),
                new DataItem("National Ranking","1")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("CHAMPIONS LEAGUE","1X"),
                new DataItem("ENGLISH CHAMPION","9X"),
                new DataItem("UEFA SUPERCUP WINNER","1X"),
                new DataItem("CUP WINNERS CUP","1X"),
                new DataItem("FA CUP","7X"),
                new DataItem("ENGLISH LEAGUE CUP","8X"),
                new DataItem("ENGLISH SUPERCUP","6X"),
                new DataItem("ENGLISH 2ND TIER","7X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","Manchester City Football Club"),
                new DataItem("Country","England"),
                new DataItem("Website","mancity.com"),
                new DataItem("Founded","Nov 23, 1880"),
                new DataItem("Name of stadium","Etihad Stadium"),
                new DataItem("Total capacity","55.017"),
                new DataItem("NET WORTH","€1.26B"),
                new DataItem("PRESIDENT","Sheikh Mansour bin Zayed Al-Nahyan"),
                new DataItem("ALL-TIME TOP GOALSCORER","Sergio Agüero(260)"),
                new DataItem("RECORD ARRIVAL","Jack Grealish(€117.50m)"),
                new DataItem("RECORD DEPARTURE","Raheem Sterling(€51.20m)"),
                new DataItem("RIVAL CLUB","MANCHESTER UNITED)"),
                new DataItem("BIGGEST WIN","9-0 Against Burton Albion)"),
                new DataItem("BIGGEST LOSS","9-2 Against West Bromwich Albion)")
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
