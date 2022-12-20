package com.example.calculator;

import javafx.fxml.FXML;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import java.net.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.Label;

public class CalculatorController {
    @FXML
    private int a, b;
    String res = "";
    @FXML
    private TextField Number1, Number2, Result;

    @FXML
    public void Add() {
        a = Integer.parseInt(Number1.getText());
        b = Integer.parseInt(Number2.getText());
        res += (a+b);
        Result.setText(res);
        res = "";
    }
    public void Sub() {
        a = Integer.parseInt(Number1.getText());
        b = Integer.parseInt(Number2.getText());
        res += (a-b);
        Result.setText(res);
        res = "";
    }
    public void Mult() {
        a = Integer.parseInt(Number1.getText());
        b = Integer.parseInt(Number2.getText());
        res += (a*b);
        Result.setText(res);
        res = "";
    }
    public void Div() {
        a = Integer.parseInt(Number1.getText());
        b = Integer.parseInt(Number2.getText());
        res += (a/b);
        Result.setText(res);
        res = "";
    }
}