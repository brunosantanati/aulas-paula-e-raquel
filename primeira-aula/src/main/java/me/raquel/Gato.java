package me.raquel;

public class Gato extends Animal {

  @Override
  public void fazerAcao() {
    System.out.println("Gato Andando !!");
  }

  @Override
  public String fazerBarulho() {
    return "Miauu!!";
  }
}
