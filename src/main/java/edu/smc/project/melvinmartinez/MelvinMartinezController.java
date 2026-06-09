package edu.smc.project.melvinmartinez;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class MelvinMartinezController {
    //This connects to the fx:id from the fxml file
    @FXML
    private TextField firstNumber;

    @FXML
    private TextField secondNumber;

    @FXML
    private Label resultLabel;

    //when + button is clicked, it will run
    @FXML
    private void handleAdd() {
        calculate("+");
    }

    //when - button is clicked, it will run
    @FXML
    private void handleSubtract() {
        calculate("-");
    }

    //when * button is clicked, it will run
    @FXML
    private void handleMultiply() {
        calculate("*");
    }

    //when / button is clicked, it will run
    @FXML
    private void handleDivide() {
        calculate("/");
    }

    //a method to handle math calculations
    private void calculate(String operator) {
        try {
            //this converts text input to integers
            //this reminded me of Python where I would typically use int()
            int num1 = Integer.parseInt(firstNumber.getText());
            int num2 = Integer.parseInt(secondNumber.getText());

            int result = 0;

            //if and else to calculate the operations
            if (operator.equals("+")) {
                result = num1 + num2;
            } else if (operator.equals("-")) {
                result = num1 - num2;
            } else if (operator.equals("*")) {
                result = num1 * num2;
            } else if (operator.equals("/")) {
                result = num1 / num2;
            }

            //Results
            resultLabel.setText(num1 + " " + operator + " " + num2 + " = " + result);

        } catch (Exception e) {
            //Error message
            resultLabel.setText("Error: " + e.getMessage());
        }
    }
}
