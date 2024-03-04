package org.example;
import java.util.List;
public class CalculatorController {
    private UserInputView view;

    public CalculatorController() {
        this.view = new UserInputView(this);
    }

    public void calculate(Operation operation) {
        List<Float> userInput = view.getUserInput();
        ComplexNumber complex1 = new ComplexNumber(userInput.get(0), userInput.get(1));
        ComplexNumber complex2 = new ComplexNumber(userInput.get(2), userInput.get(3));
        ComplexNumber result = operation.operation(complex1, complex2);
        view.displayResult(result);
    }
}
