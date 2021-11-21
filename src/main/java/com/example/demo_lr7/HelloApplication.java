package com.example.demo_lr7;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;

public class HelloApplication extends Application {
    public static final int MS_TIMEOUT = 50;
    public static final int TIMEOUT = 30000;
    TableView<Meta> table;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 450, 240);
        stage.setTitle("Bank!");
        stage.setScene(scene);
        stage.show();

    }

    /*public ObservableList<Meta> getMeta(){
        ObservableList<Meta> metas = FXCollections.observableArrayList();
        metas.add(new Meta(1,"Sde", 2,"da","ds"));
        metas.add(new Meta(2,"Sde", 21,"da","ds"));
        metas.add(new Meta(3,"Sde", 22,"da","ds"));
        return metas;
       }*/

    public static void main(String[] args) throws IOException, InterruptedException {


        launch();
    }
}