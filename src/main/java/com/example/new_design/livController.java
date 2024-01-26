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

public class livController {
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
                new DataItem("GoalKeepers","Alisson\nCaoimhín Kelleher\nAdrián"),
                new DataItem("Defenders","Ibrahima Konaté\nVirgil van Dijk\nJoel Matip\nJarell Quansah\nAndrew Robertson\nTrent Alexander-Arnold\nConor Bradley"),
                new DataItem("MidFielders","Wataru Endo\nStefan Bajcetic\nDominik Szoboszlai\nAlexis Mac Allister\nRyan Gravenberch\nLuis Díaz\nThiago\nHarvey Elliott"),
                new DataItem("Forwards","Luis Díaz\nCody Gakpo\nDiogo Jota\nMohamed Salah\nBen Doak\n\tDarwin Núñez")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","Jürgen Klopp"),
                new DataItem("Assistant Coach","Pepijn Lijnders"),
                new DataItem("TECHNICAL COACH","Julian Ward"),
                new DataItem("HEAD FITNESS COACH","Tom King"),
                new DataItem("ASSISTANT TECHNICAL & FITNESS COACH","Andreas Kornmayer"),
                new DataItem("GOALKEEPER COACH","Claudio Taffarel")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","5"),
                new DataItem("Continental Ranking","5"),
                new DataItem("National Ranking","2")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("CHAMPIONS LEAGUE","2X"),
                new DataItem("EUROPEAN CHAMPION CLUBS' CUP","4X"),
                new DataItem("FIFA CLUB WORLD CUP","1X"),
                new DataItem("UEFA SUPERCUP","4X"),
                new DataItem("ENGLISH CHAMPION","19X"),
                new DataItem("UEFA CUP","3X"),
                new DataItem("FA CUP","8X"),
                new DataItem("ENGLISH LEAGUE CUP","9X"),
                new DataItem("ENGLISH SUPERCUP","16X"),
                new DataItem("ENGLISH 2ND TIER","4X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","Liverpool Football Club"),
                new DataItem("Country","England"),
                new DataItem("Website","www.liverpoolfc.com"),
                new DataItem("Founded","Mar 15, 1892"),
                new DataItem("Name of stadium","Anfield"),
                new DataItem("Total capacity","54.074"),
                new DataItem("NET WORTH","€877.30m"),
                new DataItem("PRESIDENT","Tom Hicks"),
                new DataItem("ALL-TIME TOP GOALSCORER","Ian Rush(336)"),
                new DataItem("RECORD ARRIVAL","Virgil van Dijk(€84.65m)"),
                new DataItem("RECORD DEPARTURE","Philippe Coutinho(€135.00m)"),
                new DataItem("RIVAL CLUB","Arsenal"),
                new DataItem("BIGGEST WIN","11-0 Against Strømsgodset IF"),
                new DataItem("BIGGEST LOSS","9-1 Against Birmingham City")
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
