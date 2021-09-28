package com.example.f21comp1011lhw4;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class NumberInputViewController implements Initializable {

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
        getAreaCode(phoneNumber);

        if (phoneNumber.matches("\\(?[2-9][0-9][0-9]\\)?[-' '.]?[2-9]\\d{2}[-\\s.]?\\d{4}"))
        {
            errorMsgLabel.setText("valid phone number");
        }
        else
        {
            errorMsgLabel.setText("invalid phone number");
        }
    }

    /**
     * The goal of this number is to update the area code label IF there is a valid area code
     * @param phoneNumber
     */
    private void getAreaCode(String phoneNumber)
    {
        //simple solution - it's just the first 3 digits
        if (phoneNumber.length()>=3 && phoneNumber.substring(0,3).matches("[2-9][0-9][0-9]"))
            areaCodeLabel.setText("Area Code: " + phoneNumber.substring(0,3));
        else if (phoneNumber.length()>=4 && phoneNumber.substring(1,4).matches("[2-9][0-9][0-9]"))
            areaCodeLabel.setText("Area Code: " + phoneNumber.substring(1,4));
        else
            areaCodeLabel.setText("Area Code: invalid area code");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        phoneNumberTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            assessPhoneNumber();
        });
    }
}

