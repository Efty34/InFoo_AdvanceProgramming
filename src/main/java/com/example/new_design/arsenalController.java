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

public class arsenalController {
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
                new DataItem("GoalKeepers","Aaron Ramsdale\nDavid Raya\nKarl Hein"),
                new DataItem("Defenders","William Saliba\nBen White\nGabriel\nJurriën Timber\nJakub Kiwior\nTakehiro Tomiyasu\nOleksandr Zinchenko"),
                new DataItem("MidFielders","Thomas Partey\nMartin Ødegaard\nEmile Smith Rowe\nJorginho \nFabio Vieira\nDeclan Rice\nKai Havertz\nMohamed Elneny"),
                new DataItem("Forwards","Bukayo Saka\nGabriel Jesus\nGabriel Martinelli\nEddie Nketiah\nLeandro Trossard\nReiss Nelson\nCharles Sagoe Junior")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","Mikel Arteta"),
                new DataItem("Assistant Coach","Miguel Molina"),
                new DataItem("TECHNICAL COACH","Nicolas Jover"),
                new DataItem("HEAD FITNESS COACH","Sam Wilson"),
                new DataItem("ASSISTANT TECHNICAL & FITNESS COACH","Shad Forsythe"),
                new DataItem("GOALKEEPER COACH","Richard Hartis")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","8"),
                new DataItem("Continental Ranking","8"),
                new DataItem("National Ranking","3")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("ENGLISH CHAMPION","20X"),
                new DataItem(" CUP WINNERS CUP","1X"),
                new DataItem("FA CUP","14X"),
                new DataItem("ENGLISH LEAGUE CUP","2X"),
                new DataItem("ENGLISH SUPERCUP","17X"),
                new DataItem(" INTER-CITIES FAIRS CUP","1X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","Arsenal Football Club"),
                new DataItem("Country","England"),
                new DataItem("Website","\twww.arsenal.com"),
                new DataItem("Founded","Oct 1, 1886"),
                new DataItem("Name of stadium","Emirates Stadium"),
                new DataItem("Total capacity","60.704"),
                new DataItem("NET WORTH","€1.10B"),
                new DataItem("PRESIDENT","Sir Henry Norris †"),
                new DataItem("ALL-TIME TOP GOALSCORER","Thierry Henry(228)"),
                new DataItem("RECORD ARRIVAL","Declan Rice(€116.60m)"),
                new DataItem("RECORD DEPARTURE","Alex Oxlade-Chamberlain(€38.00m)"),
                new DataItem("RIVAL CLUB","Chelsea FC"),
                new DataItem("BIGGEST WIN","7-0 Against SK Slavia Prague"),
                new DataItem("BIGGEST LOSS","8-2 Against RCD \tManchester United")
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
