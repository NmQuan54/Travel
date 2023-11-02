package com.Controller;

import com.App;
import com.Helper.AlertHelper;
import com.Models.AccountNguoidung;
import com.utils.ExecuteQuery;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class LoginController {
    @FXML
    private TextField txtUsername;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private TextField txtEmail;
    @FXML
    Button btnLogin;
    @FXML
    Button btnSignup;
    @FXML
    private AnchorPane background;

    private ArrayList<AccountNguoidung> userAccounts = new ArrayList<>();

    @FXML
    public void initialize() {

        initAccount();
    }
    private void initAccount() {

        ExecuteQuery queryUser = new ExecuteQuery("SELECT * FROM accountNguoidung");

        ResultSet resultSet = queryUser.executeQuery();
        try {
            while (resultSet.next()) userAccounts.add(new AccountNguoidung(resultSet.getString("username"),
                    resultSet.getString("password"), resultSet.getString("email")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private int checkAccount() {
        String inputUsername = txtUsername.getText();
        String inputPassword = txtPassword.getText();

        for (AccountNguoidung account : userAccounts) {
            if (account.getUsername().equals(inputUsername) && account.getPassword().equals(inputPassword)) {
                return 1;
            }
        }

        return 0;
    }


    public void onClickLogin(ActionEvent actionEvent) throws IOException {
        if (txtUsername.getText().equals("") || txtPassword.getText().equals("")) {
            AlertHelper.showLoginError("Vui lòng nhập đầy đủ thông tin");
            return;
        }  if (checkAccount() == 1) {
            App.setRoot("example/travels/UserHome.fxml");
        } else {
            AlertHelper.showLoginError("Sai tên đăng nhập hoặc mật khẩu");
        }
    }

    public void onClickSignup(ActionEvent actionEvent) throws IOException {
        App.setRoot("example/travels/register.fxml");
    }

}