package ma.cluzel.calculatrice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class CalcController {

    @FXML
    private Label number;
    @FXML
    private Label printedText; // Ajout de printedText

    private String operator;
    private String tmp = "";
    private int num1;
    private int num2;

    @FXML
    protected void onHelloButtonClick() {
        number.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onClickNumber(ActionEvent actionEvent) {
        String value = ((Button) actionEvent.getSource()).getText();
        this.tmp = this.tmp + value;
        if (num1 != 0) {
            printedText.setText(String.valueOf(num1) + operator + tmp);
        } else {
            printedText.setText(tmp);
        }
    }

    @FXML
    protected void onClickOperator(ActionEvent actionEvent) {
        num1 = Integer.valueOf(tmp);
        tmp = "";
        this.operator = ((Button) actionEvent.getSource()).getText();
        printedText.setText(String.valueOf(num1) + operator + tmp);
    }

    @FXML
    protected void onClickEqual(ActionEvent actionEvent) {
        num2 = Integer.valueOf(tmp);
        tmp = "";
        int result = 0;
        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        }
        printedText.setText(String.valueOf(result));
        num1 = 0;
        num2 = 0;
    }

    @FXML
    public void enterNumber(ActionEvent num) {
        String value = ((Button) num.getSource()).getText();
        tmp = tmp + value;
        printedText.setText(tmp);
    }
}
