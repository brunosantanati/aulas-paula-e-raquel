package me.brunosantana.override;

public class Dog extends Animal {

    @Override
    public void testInstanceMethod() {
        System.out.println("The instance method in Dog");
    }

}
