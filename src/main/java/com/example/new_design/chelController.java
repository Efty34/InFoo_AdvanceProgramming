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

public class chelController {
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
                new DataItem("GoalKeepers","Robert Sánchez\nDjordje Petrovic\nMarcus Bettinelli"),
                new DataItem("Defenders","Levi Colwill\nAxel Disasi\nBenoît Badiashile\nWesley Fofana\nThiago Silva\nIan Maatsen\nMalang Sarr"),
                new DataItem("MidFielders","Reece James\nMalo Gusto\nMoisés Caicedo\nRoméo Lavia\nEnzo Fernández\nChristopher Nkunku\nCole Palmer"),
                new DataItem("Forwards","Raheem Sterling\nMykhaylo Mudryk\nNoni Madueke\nNicolas Jackson\nArmando Broja\nDeivid Washington")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","Mauricio Pochettino"),
                new DataItem("Assistant Coach","Jesús Pérez"),
                new DataItem("TECHNICAL COACH","Marco Ianni"),
                new DataItem("HEAD FITNESS COACH","Sebastiano Pochettino"),
                new DataItem("ASSISTANT TECHNICAL & FITNESS COACH","Tom Farrow"),
                new DataItem("GOALKEEPER COACH","Toni Jiménez")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","68"),
                new DataItem("Continental Ranking","68"),
                new DataItem("National Ranking","12")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("CHAMPIONS LEAGUE","2X"),
                new DataItem("FIFA CLUB WORLD CUP","1X"),
                new DataItem("ENGLISH CHAMPION","6X"),
                new DataItem("UEFA SUPERCUP","2X"),
                new DataItem("EUROPA LEAGUE","2X"),
                new DataItem("CUP WINNERS CUP","2X"),
                new DataItem("FA CUP","8X"),
                new DataItem("ENGLISH LEAGUE CUP","5X"),
                new DataItem("ENGLISH SUPERCUP","4X"),
                new DataItem("ENGLISH 2ND TIER","2X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","Chelsea Football Club"),
                new DataItem("Country","England"),
                new DataItem("Website","www.chelseafc.com"),
                new DataItem("Founded","Mar 10, 1905"),
                new DataItem("Name of stadium","Stamford Bridge"),
                new DataItem("Total capacity","40.853"),
                new DataItem("NET WORTH","€999.00m"),
                new DataItem("PRESIDENT","Ken Bates"),
                new DataItem("ALL-TIME TOP GOALSCORER","Frank Lampard(211)"),
                new DataItem("RECORD ARRIVAL","Enzo Fernández(€121.00m)"),
                new DataItem("RECORD DEPARTURE","Eden Hazard(€115.00m)"),
                new DataItem("RIVAL CLUB","ARSENAL"),
                new DataItem("BIGGEST WIN","13-0 Against \tJeunesse Hautcharage"),
                new DataItem("BIGGEST LOSS","8-1 Against Wolverhampton Wanderers")
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
