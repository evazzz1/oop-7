package org.example;

public class SummaryFactory implements OperationFactory {
    @Override
    public Operation createOperation() {
        return new Summary();
    }
}
