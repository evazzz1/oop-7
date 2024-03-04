package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static org.example.Logg.addToLog;
import static org.example.Logg.printLog;

public class UserInputView {
    private CalculatorController controller;

    public UserInputView(CalculatorController controller) {
        this.controller = controller;
    }

    public CalculatorController getController() {
        return controller;
    }
    public List<Float> getUserInput() {
        Scanner scanner = new Scanner(System.in);
        List<Float> userInput = new ArrayList<>();

        addToLog("Введите вещественную часть первого комплексного числа:");
        float a1 = scanner.nextFloat();
        addToLog(String.valueOf(a1));
        userInput.add(a1);

        addToLog("Введите мнимую часть первого комплексного числа:");
        float b1 = scanner.nextFloat();
        addToLog(String.valueOf(b1));
        userInput.add(b1);

        addToLog("Введите вещественную часть второго комплексного числа:");
        float a2 = scanner.nextFloat();
        addToLog(String.valueOf(a2));
        userInput.add(a2);


        addToLog("Введите мнимую часть второго комплексного числа:");
        float b2 = scanner.nextFloat();
        addToLog(String.valueOf(b2));
        userInput.add(b2);

        return userInput;
    }

    public void displayResult(ComplexNumber result) {
        addToLog("Результат: " + result);
        printLog();
    }

    public OperationFactory chooseOperationFactory() {
        Scanner scanner = new Scanner(System.in);
        addToLog("Выберите операцию (1 - сложение, 2 - умножение, 3 - деление):");
        int choice = scanner.nextInt();
        addToLog(String.valueOf(choice));
        switch (choice) {
            case 1:
                return new SummaryFactory();
            case 2:
                return new MultiplyFactory();
            case 3:
                return new DivisionFactory();
            default:
                System.out.println("Неправильный ввод, по умолчанию сложение");
                return new SummaryFactory();
        }
    }
    public void performOperation() {
        OperationFactory operationFactory = chooseOperationFactory();
        Operation operation = operationFactory.createOperation();
        controller.calculate(operation);
    }
}