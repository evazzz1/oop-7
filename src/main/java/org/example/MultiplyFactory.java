package org.example;

public class MultiplyFactory implements OperationFactory{
    @Override
    public Operation createOperation() {
        return new Multiply();
    }
}
