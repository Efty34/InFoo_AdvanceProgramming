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

public class playerController {

    @FXML
    private Button mainpageBtn;

    @FXML
    private Button messiBtn;

    @FXML
    private Button ronaldoBtn;
    @FXML
    private Button neymarBtn;
    @FXML
    private Button lewaBtn;
    @FXML
    private Button mbappeBtn;
    @FXML
    private Button kevinBtn;
    @FXML
    private Button karimBtn;
    @FXML
    private Button halandBtn;
    @FXML
    private Button lukaBtn;
    @FXML
    private Button mullerBtn;
    @FXML
    private Button kaneBtn;
    @FXML
    private Button salahBtn;
    @FXML
    private Button corBtn;
    @FXML
    private Button alisonBtn;
    @FXML
    private Button grizmanBtn;
    @FXML
    private Button srcBtn;

    @FXML
    private ImageView srcimg;

    @FXML
    private TextField srctext;
    @FXML
    private Button goBtn;

    // My Declaration of Different Class
    private Stage stage;
    private Scene scene1;
    private Parent root;
    private Alert alert;

    //When Search Text equals then imageview will change to that image
    public void searchBTN()
    {
        String searchText =srctext.getText().toLowerCase();
        switch (searchText) {
            case "messi" -> {
                Image messiimage = new Image("D:\\Study Material\\2nd Year\\2-2\\Mine\\CSE 2200 Advanced Programming\\Advanced Programming(Mine)\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\messi.png");
                srcimg.setImage(messiimage);
            }
            case "ronaldo" -> {
                Image ronaldoimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\ronaldo.png");
                srcimg.setImage(ronaldoimg);
            }
            case "neymar" -> {
                Image neymarimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\neymar.png");
                srcimg.setImage(neymarimg);
            }
            case "lewandowski" -> {
                Image lewaimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\lewa.png");
                srcimg.setImage(lewaimg);
            }
            case "mbappe" -> {
                Image mbappeimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\mbappe.png");
                srcimg.setImage(mbappeimg);
            }
            case "de bruyne" -> {
                Image kevinimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\kevin.png");
                srcimg.setImage(kevinimg);
            }
            case "benzema" -> {
                Image karimimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\karim.png");
                srcimg.setImage(karimimg);
            }
            case "haaland" -> {
                Image halandimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\haland.png");
                srcimg.setImage(halandimg);
            }
            case "modric" -> {
                Image lukaimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\luka.png");
                srcimg.setImage(lukaimg);
            }
            case "muller" -> {
                Image mullerimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\muller.png");
                srcimg.setImage(mullerimg);
            }
            case "kane" -> {
                Image kaneimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\kane.png");
                srcimg.setImage(kaneimg);
            }
            case "salah" -> {
                Image salahimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\salah.png");
                srcimg.setImage(salahimg);
            }
            case "courtois" -> {
                Image cortoaimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\cortoa.png");
                srcimg.setImage(cortoaimg);
            }
            case "alisson" -> {
                Image alisonimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\alison.png");
                srcimg.setImage(alisonimg);
            }
            case "griezmann" -> {
                Image grizimg = new Image("C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\grizman.png");
                srcimg.setImage(grizimg);
            }
            default -> {
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Please Enter a Player Name");
                alert.showAndWait();
            }
        }
    }

    //When you click Go!!! Button it will Go that that player page
public void goButtonClicked(ActionEvent event) {
    String searchText = srctext.getText().toLowerCase();
    switch (searchText) {
        case "messi" ->
                openInfoPage("messi.fxml", event);
        case "ronaldo" ->
                openInfoPage("ronaldo.fxml", event);
        case "neymar" ->
                openInfoPage("neymar.fxml", event);
        case "lewandowski" ->
                openInfoPage("lewa.fxml", event);
        case "mbappe" ->
                openInfoPage("mbappe.fxml", event);
        case "de bruyne" ->
                openInfoPage("kevin.fxml", event);
        case "benzema" ->
                openInfoPage("karim.fxml", event);
        case "haaland" ->
                openInfoPage("haland.fxml", event);
        case "modric" ->
                openInfoPage("luka.fxml", event);
        case "muller" ->
                openInfoPage("muller.fxml", event);
        case "kane" ->
                openInfoPage("kane.fxml", event);
        case "salah" ->
                openInfoPage("salah.fxml", event);
        case "courtois" ->
                openInfoPage("cortoa.fxml", event);
        case "alisson" ->
                openInfoPage("alison.fxml", event);
        case "griezmann" ->
                openInfoPage("grizman.fxml", event);
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



    // For to back to MainPage
    public void mainpage(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }


    // For Messi
    public void messi(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("messi.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For Ronaldo
    public void ronaldo(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("ronaldo.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For Neymar
    public void neymar(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("neymar.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For Lewandowski
    public void lewa(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("lewa.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For Mbappe
    public void mbappe(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("mbappe.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For De Bruyne
    public void kevind(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("kevin.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For De karim
    public void karim(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("karim.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For Haaland
    public void haland(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("haland.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    //For Modric
    public void modric(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("luka.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    //For MUller
    public void muller(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("muller.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    //For Kane
    public void kane(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("kane.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For Salah
    public void salah(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("salah.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For Courtois
    public void cortoa(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("cortoa.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    // For Alison
    public void alison(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("alison.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    // For Griezmann
    public void grizman(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("grizman.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }


}
