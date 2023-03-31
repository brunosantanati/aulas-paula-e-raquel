package me.brunosantana.overload;

import java.time.LocalDate;
import java.time.Month;

public class ExemploOverload {

    //Overload ou Sobrecarga
    //https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
    public static void main(String[] args) {
        Saudacao saudacao = new Saudacao();
        saudacao.dizerOla();
        saudacao.dizerOla("Bruno");
        saudacao.dizerOla("Paula", "Figueiredo");
        saudacao.dizerOla("Raquel", LocalDate.of(1991, 5, 5));
        saudacao.dizerOla("Bruno", LocalDate.of(1986, 9, 19));
    }

}
