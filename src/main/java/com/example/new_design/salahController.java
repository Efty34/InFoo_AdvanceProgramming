package com.example.new_design;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class salahController {

    @FXML
    private TableColumn<playerdata, String > ci_content;

    @FXML
    private TableColumn<playerdata, String> ci_information;

    @FXML
    private TableView<playerdata> ci_table;
    @FXML
    private Hyperlink ytlink;

    @FXML
    private Hyperlink ytlink2;

    @FXML
    private Hyperlink ytlink3;

    @FXML
    private Hyperlink ytlink4;

    @FXML
    private Hyperlink ytlink5;

    @FXML
    private Hyperlink ytlink6;


    //My Declaration of Class
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;

    private Stage stage;
    private Scene scene1;
    private Parent root;

    // For go back to PlayerPage
    public void playerpage(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("player.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    //For Hyperlink
    public void openlink(ActionEvent event) throws URISyntaxException,IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=pPJNkY7Tpxs"));
    }
    public void openlink2(ActionEvent event) throws URISyntaxException,IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=7zRSqKZNJdA"));
    }public void openlink3(ActionEvent event) throws URISyntaxException,IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=m69uMeG92RU"));
    }public void openlink4(ActionEvent event) throws URISyntaxException,IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=CI9BvU365f4"));
    }public void openlink5(ActionEvent event) throws URISyntaxException,IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=XbX_rexTv2c"));
    }public void openlink6(ActionEvent event) throws URISyntaxException,IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=0wDzE9IAejI"));
    }

    // For read data from DataBase
    public ObservableList<playerdata> playerlist()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM salah";
        connect = database.connect();

        try
        {
            prepare = connect.prepareStatement(selectData);
            result = prepare.executeQuery();

            playerdata pData;
            while (result.next())
            {
                pData = new playerdata(result.getString("Content"),
                        result.getString("Information")
                );
                listData.add(pData);
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return listData;
    }

    private ObservableList<playerdata> pData;

    public void showData()
    {
        pData = playerlist();
        ci_content.setCellValueFactory(new PropertyValueFactory<>("Content"));
        ci_information.setCellValueFactory(new PropertyValueFactory<>("Information"));

        ci_table.setItems(pData);
    }

    public void initialize()
    {
        showData();
    }
}
