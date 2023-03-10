package me.bruno;

import java.util.List;

class Celular {
    private String marca;
    private String modelo;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Celular[" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ']';
    }
}

class CasaComAnimal {
    private int numeroDeComodos;
    private List<String> animais;

    @Override
    public String toString() {
        return "CasaComAnimal{" +
                "numeroDeComodos=" + numeroDeComodos +
                ", animais=" + animais +
                '}';
    }

    public int getNumeroDeComodos() {
        return numeroDeComodos;
    }

    public void setNumeroDeComodos(int numeroDeComodos) {
        if(numeroDeComodos < 1){
            throw new IllegalArgumentException("A casa precisa ter no mínimo 1 cômodo");
        } else {
            this.numeroDeComodos = numeroDeComodos;
        }
    }

    public List<String> getAnimais() {
        return animais;
    }

    public void setAnimais(List<String> animais) {
        this.animais = animais;
    }
}

public class Principal {

    public static void main(String[] args) {
        Celular celular1 = new Celular("Samsung", "Galaxy S23");
        Celular celular2 = new Celular("Apple", "Iphone");


        celular1.setMarca("Motorola");
        celular1.setModelo("AS20");
        System.out.println("Marca do celular1: " + celular1.getMarca());
        System.out.println("Modelo do celular1: " + celular1.getModelo());

        System.out.println(celular1);
        System.out.println(celular2);

        //################################

        CasaComAnimal c = new CasaComAnimal();
        c.setNumeroDeComodos(10);
        c.setAnimais(List.of("cachorro", "papagaio"));

        System.out.println(c);
    }

}
