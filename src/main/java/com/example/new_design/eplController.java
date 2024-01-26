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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class eplController {
    @FXML
    private Button backBtn;

    @FXML
    private Button sum2021Btn;

    @FXML
    private Button sum1819Btn1;

    @FXML
    private TableColumn<DataInfo,String> SumDate;

    @FXML
    private TableColumn<DataInfo,String> SumDate1;

    @FXML
    private TableColumn<DataInfo,String> SumT1;

    @FXML
    private TableColumn<DataInfo,String> SumT11;

    @FXML
    private TableColumn<DataInfo,Integer> sumInd;

    @FXML
    private TableColumn<DataInfo,Integer> sumInd1;

    @FXML
    private TableColumn<DataInfo,String> sumRou;

    @FXML
    private TableColumn<DataInfo,String> sumRou1;

    @FXML
    private TableColumn<DataInfo,Integer> sumT1s;

    @FXML
    private TableColumn<DataInfo,Integer> sumT1s1;

    @FXML
    private TableColumn<DataInfo,String> sumT2;

    @FXML
    private TableColumn<DataInfo,String> sumT21;

    @FXML
    private TableColumn<DataInfo,Integer> sumT2s;

    @FXML
    private TableColumn<DataInfo,Integer> sumT2s1;

    @FXML
    private TableView<DataInfo> sumTable;

    @FXML
    private TableView<DataInfo> sumTable1;


    @FXML
    private Button team2021Btn;

    @FXML
    private Button team1819Btn1;


    @FXML
    private TableColumn<FootballClub, String> teamCode;

    @FXML
    private TableColumn<FootballClub, String> teamCode1;


    @FXML
    private TableColumn<FootballClub, String> teamCountry;

    @FXML
    private TableColumn<FootballClub, String> teamCountry1;


    @FXML
    private TableColumn<FootballClub, Integer> teamInd;

    @FXML
    private TableColumn<FootballClub, Integer> teamInd1;


    @FXML
    private TableColumn<FootballClub, String> teamName;

    @FXML
    private TableColumn<FootballClub, String> teamName1;


    @FXML
    private TableView<FootballClub> teamTable;

    @FXML
    private TableView<FootballClub> teamTable1;

    @FXML
    private Button pltable;

    @FXML
    private TableColumn<TableForClub, Integer> c1;

    @FXML
    private TableColumn<TableForClub, String> c10;

    @FXML
    private TableColumn<TableForClub, String> c2;

    @FXML
    private TableColumn<TableForClub, Integer> c3;

    @FXML
    private TableColumn<TableForClub, Integer> c4;

    @FXML
    private TableColumn<TableForClub, Integer> c5;

    @FXML
    private TableColumn<TableForClub, Integer> c6;

    @FXML
    private TableColumn<TableForClub, Integer> c7;

    @FXML
    private TableColumn<TableForClub, Integer> c8;

    @FXML
    private TableColumn<TableForClub, Integer> c9;

    @FXML
    private TableView<TableForClub> tableofpl;

    @FXML
    private Button pltable2;

    @FXML
    private TableColumn<TableForClub, Integer> c11;

    @FXML
    private TableColumn<TableForClub, String> c101;

    @FXML
    private TableColumn<TableForClub, String> c21;

    @FXML
    private TableColumn<TableForClub, Integer> c31;

    @FXML
    private TableColumn<TableForClub, Integer> c41;

    @FXML
    private TableColumn<TableForClub, Integer> c51;

    @FXML
    private TableColumn<TableForClub, Integer> c61;

    @FXML
    private TableColumn<TableForClub, Integer> c71;

    @FXML
    private TableColumn<TableForClub, Integer> c81;

    @FXML
    private TableColumn<TableForClub, Integer> c91;

    @FXML
    private TableView<TableForClub> tableofpl1;



    //For Switch Form
    public void switchForm(ActionEvent event) {
        if (event.getSource() == team2021Btn)
        {
            teamTable.setVisible(true);
            teamTable1.setVisible(false);
            sumTable.setVisible(false);
            sumTable1.setVisible(false);
            tableofpl.setVisible(false);
            tableofpl1.setVisible(false);


        }
        else if (event.getSource() == sum2021Btn) {
            sumTable.setVisible(true);
            sumTable1.setVisible(false);
            teamTable.setVisible(false);
            teamTable1.setVisible(false);
            tableofpl.setVisible(false);
            tableofpl1.setVisible(false);



        }
        else if (event.getSource() == team1819Btn1) {
            sumTable.setVisible(false);
            teamTable1.setVisible(true);
            teamTable.setVisible(false);
            sumTable1.setVisible(false);
            tableofpl.setVisible(false);
            tableofpl1.setVisible(false);


        }
        else if (event.getSource() == sum1819Btn1) {
            sumTable.setVisible(false);
            teamTable1.setVisible(false);
            teamTable.setVisible(false);
            sumTable1.setVisible(true);
            tableofpl.setVisible(false);
            tableofpl1.setVisible(false);


        }
        else if (event.getSource() == pltable) {
            sumTable.setVisible(false);
            teamTable1.setVisible(false);
            teamTable.setVisible(false);
            sumTable1.setVisible(false);
            tableofpl.setVisible(true);
            tableofpl1.setVisible(false);
        }
        else if (event.getSource() == pltable2) {
            sumTable.setVisible(false);
            teamTable1.setVisible(false);
            teamTable.setVisible(false);
            sumTable1.setVisible(false);
            tableofpl.setVisible(false);
            tableofpl1.setVisible(true);
        }

    }

    //Initialize Data
    public void initialize() {
        teamInd.setCellValueFactory(new PropertyValueFactory<>("index"));
        teamName.setCellValueFactory(new PropertyValueFactory<>("name"));
        teamCode.setCellValueFactory(new PropertyValueFactory<>("code"));
        teamCountry.setCellValueFactory(new PropertyValueFactory<>("country"));
        fetchData1();

        teamInd1.setCellValueFactory(new PropertyValueFactory<>("index"));
        teamName1.setCellValueFactory(new PropertyValueFactory<>("name"));
        teamCode1.setCellValueFactory(new PropertyValueFactory<>("code"));
        teamCountry1.setCellValueFactory(new PropertyValueFactory<>("country"));
        fetchData3();

        sumInd.setCellValueFactory(new PropertyValueFactory<>("index"));
        sumRou.setCellValueFactory(new PropertyValueFactory<>("round"));
        SumDate.setCellValueFactory(new PropertyValueFactory<>("date"));
        SumT1.setCellValueFactory(new PropertyValueFactory<>("team1"));
        sumT2.setCellValueFactory(new PropertyValueFactory<>("team2"));
        sumT1s.setCellValueFactory(new PropertyValueFactory<>("team1score"));
        sumT2s.setCellValueFactory(new PropertyValueFactory<>("team2score"));
        fetchData2();

        sumInd1.setCellValueFactory(new PropertyValueFactory<>("index"));
        sumRou1.setCellValueFactory(new PropertyValueFactory<>("round"));
        SumDate1.setCellValueFactory(new PropertyValueFactory<>("date"));
        SumT11.setCellValueFactory(new PropertyValueFactory<>("team1"));
        sumT21.setCellValueFactory(new PropertyValueFactory<>("team2"));
        sumT1s1.setCellValueFactory(new PropertyValueFactory<>("team1score"));
        sumT2s1.setCellValueFactory(new PropertyValueFactory<>("team2score"));
        fetchData4();

        c1.setCellValueFactory(new PropertyValueFactory<>("id"));
        c2.setCellValueFactory(new PropertyValueFactory<>("team"));
        c3.setCellValueFactory(new PropertyValueFactory<>("wins"));
        c4.setCellValueFactory(new PropertyValueFactory<>("draws"));
        c5.setCellValueFactory(new PropertyValueFactory<>("losses"));
        c6.setCellValueFactory(new PropertyValueFactory<>("played"));
        c7.setCellValueFactory(new PropertyValueFactory<>("points"));
        c8.setCellValueFactory(new PropertyValueFactory<>("goalsFor"));
        c9.setCellValueFactory(new PropertyValueFactory<>("goalsAgainst"));
        c10.setCellValueFactory(new PropertyValueFactory<>("goalDifference"));
        fetchData5();

        c11.setCellValueFactory(new PropertyValueFactory<>("id"));
        c21.setCellValueFactory(new PropertyValueFactory<>("team"));
        c31.setCellValueFactory(new PropertyValueFactory<>("wins"));
        c41.setCellValueFactory(new PropertyValueFactory<>("draws"));
        c51.setCellValueFactory(new PropertyValueFactory<>("losses"));
        c61.setCellValueFactory(new PropertyValueFactory<>("played"));
        c71.setCellValueFactory(new PropertyValueFactory<>("points"));
        c81.setCellValueFactory(new PropertyValueFactory<>("goalsFor"));
        c91.setCellValueFactory(new PropertyValueFactory<>("goalsAgainst"));
        c101.setCellValueFactory(new PropertyValueFactory<>("goalDifference"));
        fetchData6();

    }

// Fetch Team Data
public void fetchData1() {
    try {
        URL url = new URL("https://raw.githubusercontent.com/openfootball/football.json/master/2019-20/en.1.clubs.json");

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
        BufferedReader reader = new BufferedReader(inputStreamReader);

        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();
        connection.disconnect();

        String json = response.toString();
        jsonParse1(json);

    } catch (MalformedURLException e) {
        throw new RuntimeException(e);
    } catch (ProtocolException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    } catch (ParseException e) {
        throw new RuntimeException(e);
    }
}

    public void jsonParse1(String response) throws ParseException
    {
        ObservableList<FootballClub> footballClubs = FXCollections.observableArrayList();

        JSONParser parser = new JSONParser();
        Object object = parser.parse(response);

        JSONObject mainJsonObject = (JSONObject) object;

        String name = (String) mainJsonObject.get("name");

        JSONArray jsonArrayClub = (JSONArray) mainJsonObject.get("clubs");

        for (int i = 0; i < jsonArrayClub.size(); i++) {
            JSONObject details = (JSONObject) jsonArrayClub.get(i);

            String name1 = (String) details.get("name");
            String code = (String) details.get("code");
            String country = (String) details.get("country");

            footballClubs.add(new FootballClub(i + 1, name1, code, country));
        }
        teamTable.setItems(footballClubs);
    }


    public void fetchData3() {
        try {
            URL url = new URL("https://raw.githubusercontent.com/openfootball/football.json/master/2018-19/en.1.clubs.json");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            String json = response.toString();
            jsonParse3(json);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public void jsonParse3(String response) throws ParseException
    {
        ObservableList<FootballClub> footballClubs = FXCollections.observableArrayList();

        JSONParser parser = new JSONParser();
        Object object = parser.parse(response);

        JSONObject mainJsonObject = (JSONObject) object;

        String name = (String) mainJsonObject.get("name");

        JSONArray jsonArrayClub = (JSONArray) mainJsonObject.get("clubs");

        for (int i = 0; i < jsonArrayClub.size(); i++) {
            JSONObject details = (JSONObject) jsonArrayClub.get(i);

            String name1 = (String) details.get("name");
            String code = (String) details.get("code");
            String country = (String) details.get("country");

            footballClubs.add(new FootballClub(i + 1, name1, code, country));
        }
        teamTable1.setItems(footballClubs);
    }



    //Fetch Summary Data
    public void fetchData2() {
        try {
            URL url = new URL("https://raw.githubusercontent.com/openfootball/football.json/master/2019-20/en.1.json");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            String json = response.toString();
            jsonParse2(json);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public void jsonParse2(String response) throws ParseException
    {
        ObservableList<DataInfo> footballClubs = FXCollections.observableArrayList();

        JSONParser parser = new JSONParser();
        Object object = parser.parse(response);

        JSONObject mainJsonObject = (JSONObject) object;

        String name = (String) mainJsonObject.get("name");

        JSONArray jsonArrayClub = (JSONArray) mainJsonObject.get("matches");

        for (int i = 0; i < jsonArrayClub.size(); i++) {
            JSONObject details = (JSONObject) jsonArrayClub.get(i);

            String round = (String) details.get("round");
            String date = (String) details.get("date");
            String team1 = (String) details.get("team1");
            String team2 = (String) details.get("team2");

            JSONObject score = (JSONObject) details.get("score");

            JSONArray fullTimeScores = (JSONArray) score.get("ft");
            int team1Score = ((Long) fullTimeScores.get(0)).intValue();
            int team2Score = ((Long) fullTimeScores.get(1)).intValue();

            footballClubs.add(new DataInfo(i + 1, round,date,team1,team2,team1Score,team2Score));
        }
        sumTable.setItems(footballClubs);
    }

    public void fetchData4() {
        try {
            URL url = new URL("https://raw.githubusercontent.com/openfootball/football.json/master/2018-19/en.1.json");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            String json = response.toString();
            jsonParse4(json);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public void jsonParse4(String response) throws ParseException
    {
        ObservableList<DataInfo> footballClubs = FXCollections.observableArrayList();

        JSONParser parser = new JSONParser();
        Object object = parser.parse(response);

        JSONObject mainJsonObject = (JSONObject) object;

        String name = (String) mainJsonObject.get("name");

        JSONArray jsonArrayClub = (JSONArray) mainJsonObject.get("matches");

        for (int i = 0; i < jsonArrayClub.size(); i++) {
            JSONObject details = (JSONObject) jsonArrayClub.get(i);

            String round = (String) details.get("round");
            String date = (String) details.get("date");
            String team1 = (String) details.get("team1");
            String team2 = (String) details.get("team2");

            JSONObject score = (JSONObject) details.get("score");

            JSONArray fullTimeScores = (JSONArray) score.get("ft");
            int team1Score = ((Long) fullTimeScores.get(0)).intValue();
            int team2Score = ((Long) fullTimeScores.get(1)).intValue();

            footballClubs.add(new DataInfo(i + 1, round,date,team1,team2,team1Score,team2Score));
        }
        sumTable1.setItems(footballClubs);
    }

    //For Table

    public void fetchData5() {
        try {
            URL url = new URL("https://api.myjson.online/v1/records/5a90a2c4-5e95-4e55-ba43-ba0adb7f63e0");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            String json = response.toString();
            jsonParse5(json);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public void jsonParse5(String response) throws ParseException {
        ObservableList<TableForClub> tableclub = FXCollections.observableArrayList();

        JSONParser parser = new JSONParser();
        Object object = parser.parse(response);

        JSONObject mainJsonObject = (JSONObject) object;

        // Assuming the JSON structure has a key named "data" for clubs
        JSONArray jsonArrayClub = (JSONArray) mainJsonObject.get("data");

        for (int i = 0; i < jsonArrayClub.size(); i++) {
            JSONObject details = (JSONObject) jsonArrayClub.get(i);

            String team = (String) details.get("team");
            JSONObject stats = (JSONObject) details.get("stats");

            int wins = Integer.parseInt(stats.get("wins").toString());
            int draws = Integer.parseInt(stats.get("draws").toString());
            int losses = Integer.parseInt(stats.get("losses").toString());
            int played = Integer.parseInt(stats.get("played").toString());
            int points = Integer.parseInt(stats.get("points").toString());
            int goalsFor = Integer.parseInt(stats.get("goalsFor").toString());
            int goalsAgainst = Integer.parseInt(stats.get("goalsAgainst").toString());
            String goalDifference = (String) stats.get("goalDifference");

            // Add the parsed data to your FootballClub model
            tableclub.add(new TableForClub(i + 1, team, wins, draws, losses, played, points, goalsFor, goalsAgainst, goalDifference));
        }

        // Assuming teamTable is a TableView of FootballClub objects
        tableofpl.setItems(tableclub);
    }

    public void fetchData6() {
        try {
            URL url = new URL("https://api.myjson.online/v1/records/abd7a296-c78e-4994-b5a7-56ce42b41f87");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
            BufferedReader reader = new BufferedReader(inputStreamReader);

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            String json = response.toString();
            jsonParse6(json);

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public void jsonParse6(String response) throws ParseException {
        ObservableList<TableForClub> tableclub = FXCollections.observableArrayList();

        JSONParser parser = new JSONParser();
        Object object = parser.parse(response);

        JSONObject mainJsonObject = (JSONObject) object;

        // Assuming the JSON structure has a key named "data" for clubs
        JSONArray jsonArrayClub = (JSONArray) mainJsonObject.get("data");

        for (int i = 0; i < jsonArrayClub.size(); i++) {
            JSONObject details = (JSONObject) jsonArrayClub.get(i);

            String team = (String) details.get("team");
            JSONObject stats = (JSONObject) details.get("stats");

            int wins = Integer.parseInt(stats.get("wins").toString());
            int draws = Integer.parseInt(stats.get("draws").toString());
            int losses = Integer.parseInt(stats.get("losses").toString());
            int played = Integer.parseInt(stats.get("played").toString());
            int points = Integer.parseInt(stats.get("points").toString());
            int goalsFor = Integer.parseInt(stats.get("goalsFor").toString());
            int goalsAgainst = Integer.parseInt(stats.get("goalsAgainst").toString());
            String goalDifference = (String) stats.get("goalDifference");

            // Add the parsed data to your FootballClub model
            tableclub.add(new TableForClub(i + 1, team, wins, draws, losses, played, points, goalsFor, goalsAgainst, goalDifference));
        }

        // Assuming teamTable is a TableView of FootballClub objects
        tableofpl1.setItems(tableclub);
    }


    private Stage stage;
    private Scene scene1;
    private Parent root;


    // For League Page
    public void leaguepage(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("league.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

}
