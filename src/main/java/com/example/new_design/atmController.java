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

public class atmController {

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
                new DataItem("GoalKeeper","Jan Oblak\nIvo Grbic\nJosé María Giménez"),
                new DataItem("Defenders","Mario Hermoso\nÇağlar Söyüncü\nStefan Savic\nAxel Witsel\nReinildo Mandava\nJavi Galán\nNahuel Molina"),
                new DataItem("MidFielder","Rodrigo de Paul\nMarcos Llorente\nPablo Barrios\nKoke\nSaúl Ñíguez\nThomas Lemar\nSamuel Lino"),
                new DataItem("Forward","Samuel Lino\nRodrigo Riquelme\nVitolo\nÁngel Correa\nAntoine Griezmann\nÁlvaro Morata\nMemphis Depay")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","Diego Simeone"),
                new DataItem("Assistant Coach","Hernán Bonvicini"),
                new DataItem("TECHNICAL ASSISTANT COACH","Gustavo López"),
                new DataItem("HEAD FITNESS COACH","Óscar Ortega"),
                new DataItem("GOALKEEPER COACH","Pablo Vercellone")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","9"),
                new DataItem("Continental Ranking","9"),
                new DataItem("National Ranking","3")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("SPANISH CHAMPION","11X"),
                new DataItem("UEFA SUPERCUP","3X"),
                new DataItem("EUROPA LEAGUE","3X"),
                new DataItem("CUP WINNERS CUP","1X"),
                new DataItem("SPANISH CUP","10X"),
                new DataItem("SPANISH SUPER CUP","2X"),
                new DataItem("INTERCONTINENTAL CUP","1X"),
                new DataItem("COPA EVA DUARTE","1X"),
                new DataItem("SPANISH 2ND TIER CHAMPION","1X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","Club Atlético de Madrid S.A.D."),
                new DataItem("Country","Spain"),
                new DataItem("Website","en.atleticodemadrid.com"),
                new DataItem("Founded","Apr 26, 1903"),
                new DataItem("Name of stadium","Civitas Metropolitano"),
                new DataItem("Total capacity","67.829"),
                new DataItem("NET WORTH","€472.00m"),
                new DataItem("ALL-TIME TOP GOALSCORER","Antoine Griezmann(168)"),
                new DataItem("RECORD ARRIVAL","João Félix(€127.00m)"),
                new DataItem("RECORD DEPARTURE","Antoine Griezmann(€120.00m)"),
                new DataItem("BIGGEST WIN","9-0 Against UD Las Palmas"),
                new DataItem("BIGGEST LOSS","8-1 Against CF Barcelona")
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
