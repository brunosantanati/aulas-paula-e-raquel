package me.raquel;

public class Cachorro extends Animal {

  @Override
  public void fazerAcao() {
    System.out.println("Cachorro Andando !!");
  }

  @Override
  public String fazerBarulho() {
    return "Au Au Au Au !!!!";
  }
}
