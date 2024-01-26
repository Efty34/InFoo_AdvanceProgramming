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

public class juveController {
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
                new DataItem("GoalKeepers","Wojciech Szczesny\nMattia Perin\nCarlo Pinsoglio"),
                new DataItem("Defenders","Bremer\nDanilo\nFederico Gatt\nDaniele Rugan\nDean Huijsen\nAndrea Cambiaso\nAlex Sandro"),
                new DataItem("MidFielders","Manuel Locatelli\nAdrien Rabio\nNicolò Fagioli\nWeston McKennie\nFabio Miretti\nHans Nicolussi Caviglia\nPaul Pogba"),
                new DataItem("Forwards","Federico Chiesa\nSamuel Iling Junior\nKenan Yildiz\nDušan Vlahović\nLuka Romero\nMoise Kean\nArkadiusz Milik")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","Massimiliano Allegri"),
                new DataItem("Assistant Coach","Marco Landucci"),
                new DataItem("TECHNICAL COACH","Francesco Magnanelli"),
                new DataItem("HEAD FITNESS COACH","Giovanni Andreini"),
                new DataItem("GOALKEEPER COACH","Massimo Nenci")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","17"),
                new DataItem("Continental Ranking","17"),
                new DataItem("National Ranking","3")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("CHAMPIONS LEAGUE","1X"),
                new DataItem("EUROPEAN CHAMPION CLUBS' CUP","1X"),
                new DataItem("ITALIAN CHAMPION","36X"),
                new DataItem("UEFA SUPERCUP","2X"),
                new DataItem("UEFA CUP WINNER","3X"),
                new DataItem("CUP WINNERS CUP","1X"),
                new DataItem("ITALIAN CUP","14X"),
                new DataItem("ITALIAN SUPER CUP","9X"),
                new DataItem("INTERCONTINENTAL CUP","2X"),
                new DataItem("ITALIAN SERIE B CHAMPION","1X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","Juventus Football Club"),
                new DataItem("Country","Italy"),
                new DataItem("Website","www.juventus.com"),
                new DataItem("Founded","Nov 1, 1897"),
                new DataItem("Name of stadium","Allianz Stadium"),
                new DataItem("Total capacity","41.507"),
                new DataItem("NET WORTH","441.60m"),
                new DataItem("ALL-TIME TOP GOALSCORER","Alessandro Del Piero(290)"),
                new DataItem("RECORD ARRIVAL","Cristiano Ronaldo(€117.00m)"),
                new DataItem("RECORD DEPARTURE","Paul Pogba(€105.00m)"),
                new DataItem("RIVAL CLUB","Inter Millan"),
                new DataItem("BIGGEST WIN","15-0 Centese Calcio 1913"),
                new DataItem("BIGGEST LOSS","7-0 Against Wiener Sport-Club")
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
