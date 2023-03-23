package me.bruno.classes.abstratas;

public abstract class Veiculo {

  public void acelerar() {
    System.out.println("Acelerando...");
  }

  public void freiar() {
    System.out.println("Freiando...");
  }

  public abstract void fazerAlgoDiferente();
}
