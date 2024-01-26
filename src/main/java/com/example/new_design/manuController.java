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

public class manuController {
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
                new DataItem("GoalKeepers","Altay Bayindir\nTom Heaton\nAndré Onana"),
                new DataItem("Defenders","Harry Maguire\nLisandro Martínez\nSergio Reguilón\nRaphaël Varane\nDiogo Dalot\nLuke Shaw\nJonny Evans"),
                new DataItem("MidFielders","Mason Mount\nBruno Fernandes\nChristian Eriksen\nCasemiro\nFacundo Pellistri\nDonny van de Beek\nScott McTominay\nDaniel Gore\nHannibal Mejbri"),
                new DataItem("Forwards","Anthony Martial\nMarcus Rashford\nRasmus Højlund\nAntony\nAlejandro Garnacho\nJadon Sancho\nShola Shoretire")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","Erik ten Hag"),
                new DataItem("Assistant Coach","Steve McClaren"),
                new DataItem("TECHNICAL ASSISTANT COACH","Siôn Cox"),
                new DataItem("HEAD FITNESS COACH","Charlie Owen"),
                new DataItem("ASSISTANT TECHNICAL & FITNESS COACH","Paolo Gaudino"),
                new DataItem("GOALKEEPER COACH","Richard Hartis")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","30"),
                new DataItem("Continental Ranking","30"),
                new DataItem("National Ranking","8")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("CHAMPIONS LEAGUE","2X"),
                new DataItem("EUROPEAN CHAMPION CLUBS' CUP","1X"),
                new DataItem("FIFA CLUB WORLD CUP","1X"),
                new DataItem("ENGLISH CHAMPION","20X"),
                new DataItem("EUROPA LEAGUE WINNER","1X"),
                new DataItem(" CUP WINNERS CUP","1X"),
                new DataItem("FA CUP","12X"),
                new DataItem("ENGLISH LEAGUE CUP","6X"),
                new DataItem("ENGLISH SUPERCUP","21X"),
                new DataItem("INTERCONTINENTAL CUP","1X"),
                new DataItem("ENGLISH 2ND TIER","2X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","Manchester United Football Club"),
                new DataItem("Country","England"),
                new DataItem("Website","www.manutd.com"),
                new DataItem("Founded","Mar 5, 1878"),
                new DataItem("Name of stadium","Old Trafford"),
                new DataItem("Total capacity","74.879"),
                new DataItem("NET WORTH","€877.30m"),
                new DataItem("PRESIDENT","Avram Glazer"),
                new DataItem("ALL-TIME TOP GOALSCORER","Wayne Rooney(253)"),
                new DataItem("RECORD ARRIVAL","Paul Pogba(€105.00m)"),
                new DataItem("RECORD DEPARTURE","Cristiano Ronaldo(€94.00m)"),
                new DataItem("RIVAL CLUB","MANCHESTER CITY)"),
                new DataItem("BIGGEST WIN","10-0 Against RSC Anderlecht)"),
                new DataItem("BIGGEST LOSS","7-0 Against RCD Liverpool FC)")
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
