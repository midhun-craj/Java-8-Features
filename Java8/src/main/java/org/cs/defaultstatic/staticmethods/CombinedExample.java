package org.cs.defaultstatic.staticmethods;

public class CombinedExample {
    public static void main(String[] args) {
        TestInterface obj = new TestInterface() {};
        obj.defaultMethod();
        TestInterface.staticMethod();
    }
}
