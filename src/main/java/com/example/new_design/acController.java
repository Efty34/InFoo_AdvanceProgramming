package com.example.new_design;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class acController {


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
                new DataItem("GoalKeepers","Mike Maignan\nMarco Sportiello\nLapo Nava\nAntonio Mirante"),
                new DataItem("Defenders","Fikayo Tomori\nMalick Thiaw\nPierre Kalulu\nSimon Kjaer\nMarco Pellegrino\nMattia Caldara\nDavide Calabria"),
                new DataItem("MidFielders","Ismaël Bennace\nRade Krunic\nRuben Loftus-Cheek\nTijjani Reijnders\nYunus Musah\nTommaso Pobega\nYacine Adli"),
                new DataItem("Forwards","Rafael Leão\nChaka Traorè\nChristian Pulisic\nSamuel Chukwueze\nLuka Romero\nLuka Jović\nOlivier Giroud")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","Stefano Pioli"),
                new DataItem("Assistant Coach","Giacomo Murelli"),
                new DataItem("TECHNICAL COACH","Luciano Vulcano"),
                new DataItem("HEAD FITNESS COACH","Giuseppe Bellistri"),
                new DataItem("GOALKEEPER COACH","Tony Roberts")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","23"),
                new DataItem("Continental Ranking","23"),
                new DataItem("National Ranking","4")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("CHAMPIONS LEAGUE","3X"),
                new DataItem(" EUROPEAN CHAMPION CLUBS' CUP","4X"),
                new DataItem("FIFA CLUB WORLD CUP","1X"),
                new DataItem("ITALIAN CHAMPION","19X"),
                new DataItem("UEFA SUPERCUP","5X"),
                new DataItem("CUP WINNERS CUP","2X"),
                new DataItem("ITALIAN CUP","5X"),
                new DataItem("ITALIAN SUPER CUP","7X"),
                new DataItem("INTERCONTINENTAL CUP","2X"),
                new DataItem("ITALIAN SERIE B CHAMPION","2X"),
                new DataItem("MITROPACUP","1X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","Associazione Calcio Milan"),
                new DataItem("Country","Italy"),
                new DataItem("Website","www.acmilan.com"),
                new DataItem("Founded","Dec 16, 1899"),
                new DataItem("Name of stadium","Giuseppe Meazza"),
                new DataItem("Total capacity","75.923"),
                new DataItem("NET WORTH","€543.35m"),
                new DataItem("ALL-TIME TOP GOALSCORER","Gunnar Nordahl(214)"),
                new DataItem("RECORD ARRIVAL","Rafael Leão(€49.00m)"),
                new DataItem("RECORD DEPARTURE","Kaka(€67.00m)"),
                new DataItem("RIVAL CLUB","AC MILLAN"),
                new DataItem("BIGGEST WIN","9-0 Against US Palermo"),
                new DataItem("BIGGEST LOSS","8-0 Against Bologna FC 1909")
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
