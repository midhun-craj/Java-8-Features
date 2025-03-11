package org.cs.defaultstatic.staticmethods;

public interface MathOperations {
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static double div(int a, int b) {
        return (double) a / b;
    }
}
