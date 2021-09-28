package com.example.f21comp1011lhw4;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NumberInputViewController {

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private Label areaCodeLabel;

    @FXML
    private Label cityCodeLabel;

    @FXML
    private Label xxxxLabel;

    @FXML
    private Label errorMsgLabel;

    @FXML
    private void assessPhoneNumber()
    {
        String phoneNumber = phoneNumberTextField.getText();
        if (phoneNumber.matches("[2-9][0-9][0-9][2-9]\\d{2}\\d{4}"))
        {
            errorMsgLabel.setText("valid phone number");
        }
        else
        {
            errorMsgLabel.setText("invalid phone number");
        }
    }
}

