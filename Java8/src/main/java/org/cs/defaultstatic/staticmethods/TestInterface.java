package org.cs.defaultstatic.staticmethods;

public interface TestInterface {
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
