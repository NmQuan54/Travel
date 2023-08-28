package com.Controller;

import com.App;
import com.Models.Item;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.control.ScrollPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class UserHomeController //implements Initializable
{
@FXML
Button btLogout;

    public void onClickLogOut(ActionEvent actionEvent) throws IOException {
        App.setRoot("example/travels/Login.fxml");
    }
//    @FXML
//    private ScrollPane gridPane;
//
//    private List<Item> items;
//
//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        items = getItems();
//        int column = 0;
//        int row = 0;
//
//        GridPane grid = new GridPane();
//        grid.setHgap(20);
//        grid.setVgap(20);
//
//        try {
//            for (Item item : items) {
//                FXMLLoader fxmlLoader = new FXMLLoader();
//                fxmlLoader.setLocation(getClass().getResource("/com/example/travels/item.fxml")); // Tên tệp FXML cho Item
//                Pane pane = fxmlLoader.load();
//
//                ItemController itemController = fxmlLoader.getController();
//                itemController.setData(item);
//
//                grid.add(pane, column, row);
//                GridPane.setMargin(pane, new Insets(20));
//
//                column++;
//                if (column == 3) {
//                    column = 0;
//                    row++;
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        VBox container = new VBox(grid);
//        gridPane.setContent(container);
//    }
//
//    private List<Item> getItems() {
//        List<Item> ls = new ArrayList<>();
//
//        Item item1 = new Item();
//        item1.setName("Ha Long");
//        item1.setImgsrc("@image/Dongphongnha-ok-2.jpg");
//        ls.add(item1);
//
//        Item item2 = new Item();
//        item2.setName("Cua Lo");
//        item2.setImgsrc("@image/du-lich-cua-lo-acc-2.webp");
//        ls.add(item2);
//
//        Item item3 = new Item();
//        item2.setName("Ha Noi");
//        item2.setImgsrc("@image/du-lich-cua-lo-acc-2.webp");
//        ls.add(item3);
//
//        return ls;
//    }
}
