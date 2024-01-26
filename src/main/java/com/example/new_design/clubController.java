package com.example.new_design;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class clubController {

    @FXML
    private Button clubGoBtn;

    @FXML
    private Button srcclubBtn;

    @FXML
    private ImageView srcclubimg;

    @FXML
    private TextField srcclubname;
    @FXML
    private Button backBtn;
    @FXML
    private Button rma;
    @FXML
    private Button barcaBtn;
    @FXML
    private Button manuBtn;
    @FXML
    private Button cityBtn;
    @FXML
    private Button bayernBtn;
    @FXML
    private Button arsenBtn;
    @FXML
    private Button livBtn;
    @FXML
    private Button chelBtn;
    @FXML
    private Button psgBtn;
    @FXML
    private Button bvbBtn;
    @FXML
    private Button interBtn;
    @FXML
    private Button acBtn;
    @FXML
    private Button juveBtn;
    @FXML
    private Button atmBtn;
    @FXML
    private Button ajaxBtn;



    // My Declaration of Different Class
    private Alert alert;
    private Stage stage;
    private Scene scene1;
    private Parent root;


    // For go back to MainPage
    public void mainpage(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For to go to Real Madrid
    public void realmadrid(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("rma.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    // For to go to Barcelona
    public void barcelona(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("barca.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    // For to go to Man Utd
    public void manutd(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("manu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    // For to go to Man City
    public void mancity(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("city.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    // For to go to Bayern Munich
    public void bayernmun(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("bayern.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    // For to go to Arsenal
    public void arsen(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("arsenal.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    // For to go to Arsenal
    public void liverpool(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("liv.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    // For to go to Arsenal
    public void chelsea(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("chel.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    // For to go to PSG
    public void paris(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("psg.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For to go to Dortmund
    public void bvb(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("bvb.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }


    // For to go to Inter
    public void inter(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("inter.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For to go to AC
    public void ac(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("ac.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    // For to go to Juventus
    public void juve(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("juve.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For to go to ATM
    public void atm(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("atm.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    // For to go to ATM
    public void ajax(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("ajax.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }


    //When Search Text equals to your searching club then imageview will change to that club
    public void searchBTN()
    {
        String searchText =srcclubname.getText().toLowerCase();
        switch (searchText) {
            case "real madrid" -> {
                Image rma = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\realmadrid.png");
                srcclubimg.setImage(rma);
            }
            case "barcelona" -> {
                Image fcb = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\barcelona.png");
                srcclubimg.setImage(fcb);
            }
            case "man utd" -> {
                Image manu = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\manchesterunited.png");
                srcclubimg.setImage(manu);
            }
            case "man city" -> {
                Image city = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\manchestercity.png");
                srcclubimg.setImage(city);
            }
            case "bayern" -> {
                Image bayern = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\bayern.png");
                srcclubimg.setImage(bayern);
            }
            case "arsenal" -> {
                Image arsenal = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\arsenal.png");
                srcclubimg.setImage(arsenal);
            }
            case "liverpool" -> {
                Image liverpool = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\liverpool.png");
                srcclubimg.setImage(liverpool);
            }
            case "chelsea" -> {
                Image chelsea = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\chelsea.png");
                srcclubimg.setImage(chelsea);
            }
            case "psg" -> {
                Image psg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\psg.png");
                srcclubimg.setImage(psg);
            }
            case "borussia" -> {
                Image borussia = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\bvb.png");
                srcclubimg.setImage(borussia);
            }
            case "inter" -> {
                Image inter = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\inter.png");
                srcclubimg.setImage(inter);
            }
            case "milan" -> {
                Image milan = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\ac.png");
                srcclubimg.setImage(milan);
            }
            case "juventus" -> {
                Image juventus = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\juventus.png");
                srcclubimg.setImage(juventus);
            }
            case "athletico" -> {
                Image athletico = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\atm.png");
                srcclubimg.setImage(athletico);
            }
            case "ajax" -> {
                Image ajax = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\afcajax.png");
                srcclubimg.setImage(ajax);
            }
//            case "sevilla" -> {
//                Image sevilla = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\sevilla.png");
//                srcclubimg.setImage(sevilla);
//            }
//            case "napoli" -> {
//                Image napoli = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\napoli.png");
//                srcclubimg.setImage(napoli);
//            }
//            case "porto" -> {
//                Image porto = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\porto.png");
//                srcclubimg.setImage(porto);
//            }
            default -> {
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please Enter a Club Name");
                alert.showAndWait();
            }
        }
    }
    //When you click Go!!! Button it will Go that that player page
    public void goButtonClicked(ActionEvent event) {
        String searchText = srcclubname.getText().toLowerCase();
        switch (searchText) {
            case "real madrid" ->
                    openInfoPage("rma.fxml", event);
            case "barcelona" ->
                    openInfoPage("barca.fxml", event);
            case "man utd" ->
                    openInfoPage("manu.fxml", event);
            case "man city" ->
                    openInfoPage("city.fxml", event);
            case "bayern" ->
                    openInfoPage("bayern.fxml", event);
            case "arsenal" ->
                    openInfoPage("arsenal.fxml", event);
            case "liverpool" ->
                    openInfoPage("liverpool.fxml", event);
            case "chelsea" ->
                    openInfoPage("chel.fxml", event);
            case "psg" ->
                    openInfoPage("psg.fxml", event);
            case "borussia" ->
                    openInfoPage("bvb.fxml", event);
            case "inter" ->
                    openInfoPage("inter.fxml", event);
            case "milan" ->
                    openInfoPage("ac.fxml", event);
            case "juventus" ->
                    openInfoPage("juve.fxml", event);
            case "athletico" ->
                    openInfoPage("atm.fxml", event);
            case "ajax" ->
                    openInfoPage("ajax.fxml", event);
        }

    }
    private void openInfoPage(String fxmlPath, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene1 = new Scene(root);
            stage.setScene(scene1);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
