package org.example;

import java.util.List;

public class Summary implements Operation {
    @Override
    public ComplexNumber operation(ComplexNumber complex1, ComplexNumber complex2) {
        return complex1.add(complex2);
    }
}
