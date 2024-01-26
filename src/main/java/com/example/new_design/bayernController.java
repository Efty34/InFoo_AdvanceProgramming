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

public class bayernController {
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
                    new DataItem("GoalKeepers","Manuel Neuer\nDaniel Peretz\nSven Ulreich\nTom Hülsmann"),
                    new DataItem("Defenders","Dayot Upamecano\nMatthijs de Ligt\nKim Min-Jae\nLuca Denk\nAlphonso Davies\nBouna Sarr\nNoussair Mazraoui"),
                    new DataItem("MidFielders","Joshua Kimmich\nLeon Goretzka\nKonrad Laime\nFrans Krätzig\nAleksandar Pavlovic\nTaichi Fukui"),
                    new DataItem("Forwards","Serge Gnabry\nHarry Kane\nLeroy Sané\nKingsley Coman\nEric Maxim Choupo-Moting\nThomas Müller\nJamal Musiala")
            );
            ObservableList<DataItem> stufflist = FXCollections.observableArrayList(
                    new DataItem("Coach","Thomas Tuchel"),
                    new DataItem("Assistant Coach","Nicolas Mayer"),
                    new DataItem("TECHNICAL ASSISTANT COACH","Jos van Dijk"),
                    new DataItem("HEAD FITNESS COACH","Simon Martinello"),
                    new DataItem("ASSISTANT TECHNICAL & FITNESS COACH","Giovanni Mauri"),
                    new DataItem("GOALKEEPER COACH","Michael Rechner")
            );
            ObservableList<DataItem>ranklits=FXCollections.observableArrayList(
                    new DataItem("World Ranking","2"),
                    new DataItem("Continental Ranking","2"),
                    new DataItem("National Ranking","1")
            );
            ObservableList<DataItem>achievelist=FXCollections.observableArrayList(
                    new DataItem("CHAMPIONS LEAGUE","3X"),
                    new DataItem("EUROPEAN CHAMPION CLUBS' CUP","3X"),
                    new DataItem("FIFA CLUB WORLD CUP","2X"),
                    new DataItem("UEFA SUPERCUP","2X"),
                    new DataItem("UEFA CUP","1X"),
                    new DataItem("CUP WINNERS CUP","1X"),
                    new DataItem("GERMAN CUP","20X"),
                    new DataItem("GERMAN SUPER CUP","10X"),
                    new DataItem("INTERCONTINENTAL CUP","2X"),
                    new DataItem("LEAGUE CUP","6X")
            );
            ObservableList<DataItem>datalist=FXCollections.observableArrayList(
                    new DataItem("Official club name","FC Bayern München"),
                    new DataItem("Country","Germany"),
                    new DataItem("Website","fcbayern.com"),
                    new DataItem("Founded","Feb 27, 1900"),
                    new DataItem("Name of stadium","Allianz Arena"),
                    new DataItem("Total capacity","75.02"),
                    new DataItem("NET WORTH","€948.95m"),
                    new DataItem("PRESIDENT","Herbert Hainer"),
                    new DataItem("ALL-TIME TOP GOALSCORER","Sergio Agüero(260)"),
                    new DataItem("RECORD ARRIVAL","Harry Kane(€95.50m)"),
                    new DataItem("RECORD DEPARTURE","Lucas Hernández(€45.00m)"),
                    new DataItem("RIVAL CLUB","Borussia Dortmund"),
                    new DataItem("BIGGEST WIN","16-1 Against DJK Waldberg"),
                    new DataItem("BIGGEST LOSS","9-2 Against West Stuttgarter Kickers")
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
