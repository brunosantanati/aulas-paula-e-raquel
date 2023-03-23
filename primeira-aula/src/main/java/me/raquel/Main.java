package me.raquel;

public class Main {

  public static void main(String[] args) {
    Animal gato = new Gato();
    Animal cachorro = new Cachorro();

    gato.comer();
    gato.fazerAcao();
    String barulhoGato = gato.fazerBarulho();
    System.out.println(barulhoGato);

    System.out.println(" ");

    cachorro.comer();
    cachorro.fazerAcao();
    String barulhoCachorro = cachorro.fazerBarulho();
    System.out.println(barulhoCachorro);
  }
}
