package org.cs.defaultstatic.defaultmethods;

public interface A {
    default void show() {
        System.out.println("A is a default method.");
    }
}
