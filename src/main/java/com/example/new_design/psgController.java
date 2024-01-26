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

public class psgController {
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
                new DataItem("GoalKeepers","Gianluigi Donnarumma\nArnau Tenas\nKeylor Navas"),
                new DataItem("Defenders","Marquinhos\nMilan Skrinia\nLucas Hernández\nPresnel Kimpembe\nNuno Mendes\nLayvin Kurzawa\nAchraf Hakimi\nNordi Mukiele"),
                new DataItem("MidFielders","Manuel Ugarte\nDanilo Pereira\nWarren Zaïre-Emery\nVitinha\nFabián Ruiz\nKang-in Lee\nMarco Asensio\nDaniel Gore\nHannibal Mejbri"),
                new DataItem("Forwards","Ousmane Dembélé\nBradley Barcola\nKylian Mbappé\nRandal Kolo Muani\nGonçalo Ramos\nHugo Ekitiké")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","Christophe Galtier"),
                new DataItem("Assistant Coach","Aitor Unzué"),
                new DataItem("TECHNICAL COACH","Ludovic Taillandier"),
                new DataItem("HEAD FITNESS COACH","Nicolas Mayer"),
                new DataItem("ASSISTANT TECHNICAL & FITNESS COACH","Sebastiano Pochettino"),
                new DataItem("GOALKEEPER COACH","Borja Álvarez")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","19"),
                new DataItem("Continental Ranking","19"),
                new DataItem("National Ranking","1")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("FRENCH CHAMPION","11X"),
                new DataItem("CUP WINNERS CUP","1X"),
                new DataItem("FRENCH CUP","14X"),
                new DataItem("FRENCH LEAGUE CUP","9X"),
                new DataItem("FRENCH SUPERCUP","11X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","Paris Saint-Germain Football Club"),
                new DataItem("Country","France"),
                new DataItem("Website","psg.fr"),
                new DataItem("Founded","Aug 12, 1970"),
                new DataItem("Name of stadium","\tParc des Princes"),
                new DataItem("Total capacity","49.69"),
                new DataItem("NET WORTH","€1.07b"),
                new DataItem("PRESIDENT","Nasser Al-Khelaïfi"),
                new DataItem("ALL-TIME TOP GOALSCORER","Kylian Mbappé(222)"),
                new DataItem("RECORD ARRIVAL","Neymar(€222.00m)"),
                new DataItem("RECORD DEPARTURE","Neymar(€90.00m)"),
                new DataItem("RIVAL CLUB","AS Monaco"),
                new DataItem("BIGGEST WIN","10-0 Against Côte-Chaude Sportif St-Etienne"),
                new DataItem("BIGGEST LOSS","6-0 Against FC Nantes")
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
