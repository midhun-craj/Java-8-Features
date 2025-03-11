package org.cs.defaultstatic.defaultmethods;

public class C implements A, B{
//    @Override
//    public void show() {
//        System.out.println("The diamond problem is solved.");
//    }


    @Override
    public void show() {
        B.super.show();
    }
}
