package me.bruno;

class Celular {
    private String marca;
    private String modelo;

    public String getMarca() {
        return this.marca;
    }

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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

public class Principal {

    public static void main(String[] args) {
        Celular celular1 = new Celular("Samsung", "Galaxy S23");
        Celular celular2 = new Celular("Apple", "Iphone");
        System.out.println(celular1);
        System.out.println(celular2);
    }

}
