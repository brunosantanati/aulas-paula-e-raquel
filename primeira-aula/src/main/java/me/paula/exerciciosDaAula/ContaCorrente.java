package me.paula.exerciciosDaAula;

import java.math.BigDecimal;

public class ContaCorrente implements Conta{

    private String nomeProprietario;
    private int numero;
    private BigDecimal saldo;

    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public void sacar(BigDecimal valorSaque){
        this.saldo =  saldo.subtract(valorSaque);
    }

}
