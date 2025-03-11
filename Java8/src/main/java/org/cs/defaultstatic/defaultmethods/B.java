package org.cs.defaultstatic.defaultmethods;

public interface B {
    default void show() {
        System.out.println("B is a default method.");
    }
}
