package me.raquel;

public abstract class Animal {

  public void comer() {
    System.out.println(this.getClass().getSimpleName() + " comendo!!");
  }

  public abstract void fazerAcao();

  public abstract String fazerBarulho();
}
