//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.studentattendance.controller;

import com.example.studentattendance.Navigation;
import com.example.studentattendance.models.Account;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import com.example.studentattendance.Navigation;
public class AdminController {
    @FXML
    private AnchorPane loginPane;
    @FXML
    private Button out;
    @FXML
    private Label user;
    Navigation navigation = new Navigation();
    Account account=new Account();
    public AdminController() {

    }

    public void initialize(){
//        user.setText(LoginController.getUsername());
    }
    public void logout(ActionEvent event){

        navigation.navigateTo(loginPane, navigation.LOGIN_FXML);
    }
    }








