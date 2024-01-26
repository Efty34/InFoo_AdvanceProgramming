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

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class neymarController {

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

    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;


    private Stage stage;
    private Scene scene1;
    private Parent root;

    //For HyperLink

    public void openlink(ActionEvent event) throws URISyntaxException,IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=VZGz8tgO3d8"));
    }
    public void openlink2(ActionEvent event) throws URISyntaxException,IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=tV6076aT_l0"));
    }public void openlink3(ActionEvent event) throws URISyntaxException,IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=DpVrn9HdMwc"));
    }public void openlink4(ActionEvent event) throws URISyntaxException,IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=UcLXIG3W7u4"));
    }public void openlink5(ActionEvent event) throws URISyntaxException,IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=XgnPF_3zAPk"));
    }public void openlink6(ActionEvent event) throws URISyntaxException,IOException
    {
        Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=MPn3a0Y6gyQ"));
    }

    // For PlayerPage
    public void playerpage(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("player.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

    public ObservableList<playerdata> playerlist()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM neymar";
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
