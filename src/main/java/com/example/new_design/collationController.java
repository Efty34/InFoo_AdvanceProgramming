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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class collationController {

    @FXML
    private Button backBtn;

    @FXML
    private ComboBox<String> boxLeft;

    @FXML
    private ComboBox<String> boxRight;

    @FXML
    private ImageView img1;

    @FXML
    private ImageView img2;

    @FXML
    private TableColumn<playerdata,String> col_info_p1;

    @FXML
    private TableColumn<playerdata,String> col_info_p2;

    @FXML
    private TableColumn<playerdata,String> col_p1;

    @FXML
    private TableColumn<playerdata,String> col_p2;

    @FXML
    private TableView<playerdata> table;
    @FXML
    private TableView<playerdata> table2;

    private Connection connect; // Database connection
    private PreparedStatement prepare;
    private ResultSet result;



    // Populate ComboBox(Left Box)
    private String[] playerlist = {"Lionel Messi","Cristiano Ronaldo","Neymar Jr.","Robert Lewandowski","Kylian Mbappe","Kevin De Bruyne","Karim Benzema","Erling Haaland","Luka Modric",
    "Thomas Muller","Harry Kane","Mohamed Salah","Thibaut Courtois","Alisson Becker","Antoine Griezmann"};
    private String[] playerImages = {"C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\messi.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\ronaldo.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\neymar.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\lewa.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\mbappe.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\kevin.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\karim.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\haland.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\luka.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\muller.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\kane.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\salah.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\cortoa.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\alison.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\grizman.png"

    };

    // Populate ComboBox(Right Box)
    private String[] playerlist1 = {"Lionel Messi","Cristiano Ronaldo","Neymar Jr.","Robert Lewandowski","Kylian Mbappe","Kevin De Bruyne","Karim Benzema","Erling Haaland","Luka Modric",
    "Thomas Muller","Harry Kane","Mohamed Salah","Thibaut Courtois","Alisson Becker","Antoine Griezmann"};
    private String[] playerImages1 = {"C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\messi.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\ronaldo.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\neymar.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\lewa.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\mbappe.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\kevin.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\karim.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\haland.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\luka.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\muller.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\kane.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\salah.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\cortoa.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\alison.png",
            "C:\\Users\\Asus\\Desktop\\Advanced Programming\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\grizman.png"

    };
    public void plist1()
    {
        ObservableList<String> listData = FXCollections.observableArrayList(playerlist);
        boxLeft.setItems(listData);
    }

    public void plist2()
    {
        ObservableList<String> listData1 = FXCollections.observableArrayList(playerlist1);
        boxRight.setItems(listData1);
    }


    public void initialize() {
        plist1(); // Populates the left ComboBox
        plist2(); // Populates the right ComboBox

        // Action for left ComboBox
        boxLeft.setOnAction(event -> {
            String selectedPlayer = boxLeft.getSelectionModel().getSelectedItem();
            if (selectedPlayer != null) {
                if (selectedPlayer.equals("Lionel Messi")) {
                    File file = new File(playerImages[0]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataMessi();
                } else if (selectedPlayer.equals("Cristiano Ronaldo")) {
                    File file = new File(playerImages[1]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataRonaldo();
                }
                else if (selectedPlayer.equals("Neymar Jr.")) {
                    File file = new File(playerImages[2]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataNeymar();
                }
                else if (selectedPlayer.equals("Robert Lewandowski")) {
                    File file = new File(playerImages[3]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataLewa();
                }
                else if (selectedPlayer.equals("Kylian Mbappe")) {
                    File file = new File(playerImages[4]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataMbappe();
                }
                else if (selectedPlayer.equals("Kevin De Bruyne")) {
                    File file = new File(playerImages[5]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataKevin();
                }
                else if (selectedPlayer.equals("Karim Benzema")) {
                    File file = new File(playerImages[6]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataKarim();
                }
                else if (selectedPlayer.equals("Erling Haaland")) {
                    File file = new File(playerImages[7]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataHaland();
                }
                else if (selectedPlayer.equals("Luka Modric")) {
                    File file = new File(playerImages[8]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataLuka();
                }
                else if (selectedPlayer.equals("Thomas Muller")) {
                    File file = new File(playerImages[9]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataMuller();
                }
                else if (selectedPlayer.equals("Harry Kane")) {
                    File file = new File(playerImages[10]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataKane();
                }
                else if (selectedPlayer.equals("Mohamed Salah")) {
                    File file = new File(playerImages[11]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataSalah();
                }
                else if (selectedPlayer.equals("Thibaut Courtois")) {
                    File file = new File(playerImages[12]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataCortoa();
                }
                else if (selectedPlayer.equals("Alisson Becker")) {
                    File file = new File(playerImages[13]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataAlison();
                }
                else if (selectedPlayer.equals("Antoine Griezmann")) {
                    File file = new File(playerImages[14]);
                    Image image = new Image(file.toURI().toString());
                    img1.setImage(image);
                    showDataGriz();
                }
            }
        });

        // Action for right ComboBox
        boxRight.setOnAction(event -> {
            String selectedPlayer = boxRight.getSelectionModel().getSelectedItem();
            if (selectedPlayer != null) {
                if (selectedPlayer.equals("Lionel Messi")) {
                    File file = new File(playerImages1[0]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataMessir();
                } else if (selectedPlayer.equals("Cristiano Ronaldo")) {
                    File file = new File(playerImages1[1]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataRonaldor();
                }
                else if (selectedPlayer.equals("Neymar Jr.")) {
                    File file = new File(playerImages[2]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataNeymarR();
                }
                else if (selectedPlayer.equals("Robert Lewandowski")) {
                    File file = new File(playerImages[3]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataLewaR();
                }
                else if (selectedPlayer.equals("Kylian Mbappe")) {
                    File file = new File(playerImages[4]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataMbappeR();
                }
                else if (selectedPlayer.equals("Kevin De Bruyne")) {
                    File file = new File(playerImages[5]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataKevinR();
                }
                else if (selectedPlayer.equals("Karim Benzema")) {
                    File file = new File(playerImages[6]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataKarimR();
                }
                else if (selectedPlayer.equals("Erling Haaland")) {
                    File file = new File(playerImages[7]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataHalandR();
                }
                else if (selectedPlayer.equals("Luka Modric")) {
                    File file = new File(playerImages[8]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataLukaR();
                }
                else if (selectedPlayer.equals("Thomas Muller")) {
                    File file = new File(playerImages[9]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataMullerR();
                }
                else if (selectedPlayer.equals("Harry Kane")) {
                    File file = new File(playerImages[10]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataKaneR();
                }
                else if (selectedPlayer.equals("Mohamed Salah")) {
                    File file = new File(playerImages[11]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataSalahR();
                }
                else if (selectedPlayer.equals("Thibaut Courtois")) {
                    File file = new File(playerImages[12]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataCortoaR();
                }
                else if (selectedPlayer.equals("Alisson Becker")) {
                    File file = new File(playerImages[13]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataAlisonR();
                }
                else if (selectedPlayer.equals("Antoine Griezmann")) {
                    File file = new File(playerImages[14]);
                    Image image = new Image(file.toURI().toString());
                    img2.setImage(image);
                    showDataGrizR();
                }
            }
        });
    }

    // For Left Combo Box

    // To Fetch Messi Data from Database
    public ObservableList<playerdata> playerlist()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM messi";
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

    public void showDataMessi()
    {
        pData = playerlist();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData);
    }

    // To Fetch Ronaldo Data from DataBase

    public ObservableList<playerdata> playerlist1()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM ronaldo";
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

    private ObservableList<playerdata> pData1;

    public void showDataRonaldo()
    {
        pData1 = playerlist1();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData1);
    }

    // To Fetch Neymar Data from DataBase

    public ObservableList<playerdata> playerlist2()
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

    private ObservableList<playerdata> pData2;

    public void showDataNeymar()
    {
        pData2 = playerlist2();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData2);
    }


    // To Fetch Lewandowski Data from DataBase

    public ObservableList<playerdata> playerlist3()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM lewa";
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

    private ObservableList<playerdata> pData3;

    public void showDataLewa()
    {
        pData3 = playerlist3();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData3);
    }


    // To Fetch Mbappe Data from DataBase

    public ObservableList<playerdata> playerlist4()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM mbappe";
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

    private ObservableList<playerdata> pData4;

    public void showDataMbappe()
    {
        pData4 = playerlist4();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData4);
    }

    // To Fetch Kevin Data from DataBase

    public ObservableList<playerdata> playerlist5()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM kevin";
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

    private ObservableList<playerdata> pData5;

    public void showDataKevin()
    {
        pData5 = playerlist5();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData5);
    }

    // To Fetch Benzema Data from DataBase

    public ObservableList<playerdata> playerlist6()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM karim";
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

    private ObservableList<playerdata> pData6;

    public void showDataKarim()
    {
        pData6 = playerlist6();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData6);
    }
    // To Fetch Haland Data from DataBase

    public ObservableList<playerdata> playerlist7()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM haland";
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

    private ObservableList<playerdata> pData7;

    public void showDataHaland()
    {
        pData7 = playerlist7();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData7);
    }

    // To Fetch Modric Data from DataBase

    public ObservableList<playerdata> playerlist8()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM luka";
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

    private ObservableList<playerdata> pData8;

    public void showDataLuka()
    {
        pData8 = playerlist8();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData8);
    }

    // To Fetch Muller Data from DataBase

    public ObservableList<playerdata> playerlist9()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM muller";
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

    private ObservableList<playerdata> pData9;

    public void showDataMuller()
    {
        pData9 = playerlist9();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData9);
    }

    // To Fetch Kane Data from DataBase

    public ObservableList<playerdata> playerlist10()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM kane";
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

    private ObservableList<playerdata> pData10;

    public void showDataKane()
    {
        pData10 = playerlist10();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData10);
    }

    // To Fetch Salah Data from DataBase

    public ObservableList<playerdata> playerlist11()
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

    private ObservableList<playerdata> pData11;

    public void showDataSalah()
    {
        pData11 = playerlist11();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData11);
    }

    // To Fetch Courtois Data from DataBase

    public ObservableList<playerdata> playerlist12()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM cortoa";
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

    private ObservableList<playerdata> pData12;

    public void showDataCortoa()
    {
        pData12 = playerlist12();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData12);
    }

    // To Fetch Alison Data from DataBase

    public ObservableList<playerdata> playerlist13()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM alison";
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

    private ObservableList<playerdata> pData13;

    public void showDataAlison()
    {
        pData13 = playerlist13();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData13);
    }

    // To Fetch Griezmann Data from DataBase

    public ObservableList<playerdata> playerlist14()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM grizman";
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

    private ObservableList<playerdata> pData14;

    public void showDataGriz()
    {
        pData14 = playerlist14();
        col_p1.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p1.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table.setItems(pData14);
    }


    // For Right Combo Box

    // To Fetch Messi Data from Database
    public ObservableList<playerdata> playerlistr()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM messi";
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

    private ObservableList<playerdata> pDatar;

    public void showDataMessir()
    {
        pDatar = playerlistr();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pDatar);
    }

    // To Fetch Ronaldo Data from DataBase

    public ObservableList<playerdata> playerlist1r()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM ronaldo";
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

    private ObservableList<playerdata> pData1r;

    public void showDataRonaldor()
    {
        pData1r = playerlist1r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData1r);
    }

    // To Fetch Neymar Data from DataBase

    public ObservableList<playerdata> playerlist2r()
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

    private ObservableList<playerdata> pData2r;

    public void showDataNeymarR()
    {
        pData2r = playerlist2r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData2r);
    }


    // To Fetch Lewandowski Data from DataBase

    public ObservableList<playerdata> playerlist3r()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM lewa";
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

    private ObservableList<playerdata> pData3r;

    public void showDataLewaR()
    {
        pData3r = playerlist3r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData3r);
    }

    // To Fetch Kevin Data from DataBase

    public ObservableList<playerdata> playerlist5r()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM kevin";
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

    private ObservableList<playerdata> pData5r;

    public void showDataKevinR()
    {
        pData5r = playerlist5r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData5r);
    }

    // To Fetch Mbappe Data from DataBase

    public ObservableList<playerdata> playerlist4r()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM mbappe";
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

    private ObservableList<playerdata> pData4r;

    public void showDataMbappeR()
    {
        pData4r = playerlist4r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData4r);
    }

    // To Fetch Benzema Data from DataBase

    public ObservableList<playerdata> playerlist6r()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM karim";
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

    private ObservableList<playerdata> pData6r;

    public void showDataKarimR()
    {
        pData6r = playerlist6r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData6r);
    }

    // To Fetch Haland Data from DataBase

    public ObservableList<playerdata> playerlist7r()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM haland";
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

    private ObservableList<playerdata> pData7r;

    public void showDataHalandR()
    {
        pData7r = playerlist7r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData7r);
    }

    // To Fetch Modric Data from DataBase

    public ObservableList<playerdata> playerlist8r()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM luka";
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

    private ObservableList<playerdata> pData8r;

    public void showDataLukaR()
    {
        pData8r = playerlist8r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData8r);
    }

    // To Fetch Muller Data from DataBase

    public ObservableList<playerdata> playerlist9r()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM muller";
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

    private ObservableList<playerdata> pData9r;

    public void showDataMullerR()
   {
        pData9r = playerlist9r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData9r);
    }

    // To Fetch Kane Data from DataBase

    public ObservableList<playerdata> playerlist10r()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM kane";
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

    private ObservableList<playerdata> pData10r;

    public void showDataKaneR()
    {
        pData10r = playerlist10r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData10r);
    }

    // To Fetch Salah Data from DataBase

    public ObservableList<playerdata> playerlist11r()
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

    private ObservableList<playerdata> pData11r;

    public void showDataSalahR()
    {
        pData11r = playerlist11r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData11r);
    }

    // To Fetch Courtois Data from DataBase

    public ObservableList<playerdata> playerlist12r()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM cortoa";
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

    private ObservableList<playerdata> pData12r;

    public void showDataCortoaR()
    {
        pData12r = playerlist12r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData12r);
    }

    // To Fetch Alison Data from DataBase

    public ObservableList<playerdata> playerlist13r()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM alison";
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

    private ObservableList<playerdata> pData13r;

    public void showDataAlisonR()
    {
        pData13r = playerlist13r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData13r);
    }

    // To Fetch Griezzman Data from DataBase

    public ObservableList<playerdata> playerlist14r()
    {
        ObservableList<playerdata> listData = FXCollections.observableArrayList();
        String selectData = "SELECT * FROM grizman";
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

    private ObservableList<playerdata> pData14r;

    public void showDataGrizR()
    {
        pData14r = playerlist14r();
        col_p2.setCellValueFactory(new PropertyValueFactory<>("Content"));
        col_info_p2.setCellValueFactory(new PropertyValueFactory<>("Information"));

        table2.setItems(pData14r);
    }



    // Back to Main Page
    private Stage stage;
    private Scene scene1;
    private Parent root;


    // For Player Page
    public void mainpage(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }

}
