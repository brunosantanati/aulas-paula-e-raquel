package me.paula.exerciciosDaAula;

import java.math.BigDecimal;

public class TesteConta {

    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente();

        conta1.setSaldo(new BigDecimal("500"));

        System.out.println("Conta: " + conta1.getSaldo());
        
        conta1.sacar(new BigDecimal("100"));

        System.out.println("Conta depois do saque: " + conta1.getSaldo());
    }
    
}
