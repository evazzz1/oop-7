package org.example;

import java.util.List;

public class Division implements Operation {
    @Override
    public ComplexNumber operation(ComplexNumber complex1, ComplexNumber complex2) {
        return complex1.divide(complex2);
    }
}
