package com.Controller;

import com.App;
import com.Models.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.control.ScrollPane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


import org.json.JSONArray;
import org.json.JSONObject;

public class UserHomeController {
    @FXML
    private WebView webView;
    @FXML
    private Button btLogout;
    @FXML
    private TextField tfSearch;
    @FXML
    private Button home;
    @FXML
    private Button tfsearch;
    @FXML
    private Button plan;
    @FXML
    private TextField tfSearch1;

    public void onClickLogOut(ActionEvent actionEvent) throws IOException {
        App.setRoot("example/travels/Login.fxml");
    }

    public void onClickHome(ActionEvent actionEvent) throws IOException {
        App.setRoot("example/travels/UserHome.fxml");
    }

    public void onClickPlan(ActionEvent actionEvent) throws IOException {
        App.setRoot("example/travels/Plan.fxml");
    }

    public void onClickSearch(ActionEvent actionEvent) throws IOException {
        App.setRoot("example/travels/search.fxml");

    }
    public void search(ActionEvent actionEvent) throws IOException {
        String apiKey = "AIzaSyDZgRz_2vM_AQm0seNC2kcYEjjNIfV5pLs";
        String location = tfSearch1.getText();
        try {
            String apiUrl = "https://maps.google.com/maps?q=" + location + "&key=" + apiKey;
            WebEngine webEngine = webView.getEngine();
            webEngine.load(apiUrl);
        } catch (Exception e) {
            e.printStackTrace();
            tfSearch1.setText("Lỗi: " + e.getMessage());
        }
    }
}