package com.Controller;

import com.App;
import com.Helper.AlertHelper;
import com.utils.ExecuteQuery;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterController {

    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private PasswordField txtRePassword;
    @FXML
    private TextField txtEmail;

    @FXML
    Button btBack;
    @FXML
    Button btnSignup;
    @FXML
    public void onPressSignup(ActionEvent actionEvent) throws IOException {

        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String rePassword = txtRePassword.getText();
        String email = txtEmail.getText();
        if(!rePassword.equals(password)) {
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Warning", null, "Mật khẩu xác nhận không giống nhau");
            return ;
        }else if(email == null || email.isEmpty() || !email.contains("@") ) {
            AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Warning", null, "Email không hợp lệ!");
            return ;
        }
        ExecuteQuery query = new ExecuteQuery(
                "INSERT INTO accountNguoidung (username, password, email) VALUES ('" + username + "', '" + password + "', '" + email + "')");
        query.executeUpdate();
        AlertHelper.showAlert(Alert.AlertType.INFORMATION, "Login successful", null, "You have successfully logged.");
        App.setRoot("example/travels/Login.fxml");

    }
    public void onClickBack(ActionEvent actionEvent) throws IOException {
        App.setRoot("example/travels/Login.fxml");
    }
}
