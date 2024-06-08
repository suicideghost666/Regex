package org.example.repos;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloController {
    List<String> regExps = Arrays.asList(
        ".*a.*b.*",
        ".*1.........$",
        "^(0|01|10|^(11))*11(0|01|10|^(11))*$",
        "^(01|11|10|0011)*$",
        "^(1*01*01*01*01*01*)*$",
        "^(0*(100|110|111|11|10$|1$)*)*$",
        "(*)01*",
        "(0+1)01",
        "00(0+1)*"
    );


    @FXML
    private Label reg, answer;
    @FXML
    TextField expr;
    int count = 0;
    @FXML
    protected void onCheckButtonClick() {
        String s = expr.getText().strip();
        if (s.matches(regExps.get(count))) {
            answer.setText("Пройдено");
        } else {
            answer.setText("Не пройдено");
        }
    }
    @FXML
    protected void onNextModeClick() {
        count++;
        count = count % regExps.size();
        reg.setText(regExps.get(count));
    }
    protected void initialize() {
        reg.setText(regExps.get(count));
    }
}