package org.cs.defaultstatic.defaultmethods;

@FunctionalInterface
public interface MyFunctionalInterface {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("This is a default method inside a functional interface.");
    }
}
