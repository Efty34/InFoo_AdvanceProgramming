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

public class bvbController {
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
                new DataItem("GoalKeepers","Gregor Kobel\nMarcel Lotka\nAlexander Meyer"),
                new DataItem("Defenders","Nico Schlotterbeck\nNiklas Süle\nMats Hummels\nAntonios Papadopoulos\nRamy Bensebain\nJulian Ryerson\nMarius Wolf\nThomas Meunier"),
                new DataItem("MidFielders","Emre Can\nSalih Özcan\nAbdoulaye Kamara\nMarcel Sabitzer\nOle Pohlmann\nJulian Brandt\nGiovanni Reyna\nMarco Reus"),
                new DataItem("Forwards","Karim Adeyemi\nJamie Bynoe-Gittens\nDonyell Malen\nJulien Duranville\nYoussoufa Moukoko\nSébastien Haller\nNiclas Füllkrug")
        );
        ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                new DataItem("Coach","Edin Terzic"),
                new DataItem("Assistant Coach","Armin Reutershahn"),
                new DataItem("TECHNICAL COACH","Edin Terzic"),
                new DataItem("HEAD FITNESS COACH","Dr. Andreas Schlumberger"),
                new DataItem("ASSISTANT TECHNICAL & FITNESS COACH","Oliver Bartlett"),
                new DataItem("GOALKEEPER COACH","Matthias Kleinsteiber")
        );
        ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                new DataItem("World Ranking","12"),
                new DataItem("Continental Ranking","12"),
                new DataItem("National Ranking","3")
        );
        ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                new DataItem("CHAMPIONS LEAGUE","1X"),
                new DataItem("GERMAN CHAMPION","8X"),
                new DataItem("CUP WINNERS CUP","1X"),
                new DataItem("GERMAN CUP","5X"),
                new DataItem("GERMAN SUPER CUP","6X"),
                new DataItem("INTERCONTINENTAL CUP","1X"),
                new DataItem("WESTERN GERMAN CUP","2X")
        );
        ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                new DataItem("Official club name","Borussia Dortmund"),
                new DataItem("Country","Germany"),
                new DataItem("Website","www.bvb.de"),
                new DataItem("Founded","Dec 19, 1909"),
                new DataItem("Name of stadium","SIGNAL IDUNA PARK"),
                new DataItem("Total capacity","81.365"),
                new DataItem("NET WORTH","€466.60m"),
                new DataItem("ALL-TIME TOP GOALSCORER","Adi Preißler(177)"),
                new DataItem("RECORD ARRIVAL","Julian Brandt(€50.00m)"),
                new DataItem("RECORD DEPARTURE","Erling Haaland(€150.00m)"),
                new DataItem("RIVAL CLUB","Bayern Munich"),
                new DataItem("BIGGEST WIN","14-1 Against BSV Schwenningen"),
                new DataItem("BIGGEST LOSS","12-0 Against Borussia Mönchengladbach")
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
