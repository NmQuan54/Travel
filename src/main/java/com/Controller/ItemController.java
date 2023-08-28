package com.Controller;

import com.Models.Item;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ItemController {

    @FXML
    private ImageView img;

    @FXML
    private Label name;

    public void setData(Item item) {
        Image image = new Image(getClass().getResourceAsStream(item.getImgsrc()));
        img.setImage(image);
        name.setText(item.getName());
    }
}
