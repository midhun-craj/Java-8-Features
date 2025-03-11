package org.cs.defaultstatic.defaultmethods;

public interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting...");
    }
}
