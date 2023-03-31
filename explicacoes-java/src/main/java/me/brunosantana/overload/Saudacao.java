package me.brunosantana.overload;

import java.time.LocalDate;
import java.time.Month;

public class Saudacao {

    public void dizerOla() {
        System.out.println("Olá");
    }

    public void dizerOla(String nome) {
        System.out.println("Olá " + nome);
    }

    public void dizerOla(String nome, String sobrenome) {
        System.out.println("Olá " + nome + " " + sobrenome);
    }

    public void dizerOla(String nome, LocalDate dataDeAniversario) {
        if(dataDeAniversario.isEqual(LocalDate.of(1986, Month.SEPTEMBER, 19))){
            System.out.println("Olá " + nome + "! Feliz aniversário!");
            return;
        }
        System.out.println("Olá " + nome);
    }
}
