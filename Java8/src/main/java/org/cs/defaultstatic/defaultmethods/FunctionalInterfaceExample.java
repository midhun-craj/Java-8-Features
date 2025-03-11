package org.cs.defaultstatic.defaultmethods;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface anInterface = () -> System.out.println("Lambda implementation for the abstract method inside functional interface.");
        anInterface.abstractMethod();

        anInterface.defaultMethod();
    }
}
