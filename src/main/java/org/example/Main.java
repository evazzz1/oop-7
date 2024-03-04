package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController();
        UserInputView userInputView = new UserInputView(controller);
        userInputView.performOperation();
    }
}