package com.example.new_design;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPage extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainPage.class.getResource("MainPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1175, 700);

        Image icon = new Image("D:\\Study Material\\2nd Year\\2-2\\Mine\\CSE 2200 Advanced Programming\\Advanced Programming(Mine)\\InFoo\\new_design\\src\\main\\resources\\com\\example\\Image\\logoi.png");
        stage.getIcons().add(icon);

        stage.setTitle("InFOO");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}