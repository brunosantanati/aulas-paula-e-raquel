package me.brunosantana.override;

import java.util.ArrayList;
import java.util.List;

public class ExemploOverride {

    //Override ou Sobrescrever
    //https://docs.oracle.com/javase/tutorial/java/IandI/override.html
    public static void main(String[] args) {
        Animal a = new Animal();
        a.testInstanceMethod();
        Animal.testClassMethod();

        System.out.println("###################");

        Cat c = new Cat();
        c.testInstanceMethod();
        Cat.testClassMethod();

        System.out.println("###################");

        Animal animal = c;
        animal.testInstanceMethod();

        /*Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();*/

        System.out.println("###################");

        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Dog());
        animais.add(new Cat());

        animais.forEach(catOrDog -> catOrDog.testInstanceMethod());
    }
}
