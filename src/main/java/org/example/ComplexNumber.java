package org.example;

public class ComplexNumber {
    private float a;
    private float b;

    public ComplexNumber(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public ComplexNumber add(ComplexNumber otherNumber) {
        float newA = a + otherNumber.getA();
        float newB = b + otherNumber.getB();
        return new ComplexNumber(newA, newB);
    }

    public ComplexNumber multiply(ComplexNumber otherNumber) {
        float newA = (a * otherNumber.getA()) - (b * otherNumber.getB());
        float newB = (b * otherNumber.getA()) + (a * otherNumber.getB());
        return new ComplexNumber(newA, newB);
    }

    public ComplexNumber divide(ComplexNumber otherNumber) {
        float denominator = (otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB());
        float newA = ((a * otherNumber.getA()) + (b * otherNumber.getB())) / denominator;
        float newB = ((b * otherNumber.getA()) - (a * otherNumber.getB())) / denominator;
        return new ComplexNumber(newA, newB);
    }

    public String toString() {
        return "(" + a + ") + (" + b + ")i";
    }
}
