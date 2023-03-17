package me.paula.exerciciosDeCasa;

import java.util.Map;

public class Principal {

  public static void main(String[] args) {
    PaniniService service = new PaniniService();
    Map<String, String> dadosHQ1 = service.getDadosHQByIsbn("9788583681595");
    Map<String, String> dadosHQ2 = service.getDadosHQByIsbn("9788583682325");
    Map<String, String> dadosHQ3 = service.getDadosHQByIsbn("9788583682330");

    System.out.println("Dados da HQ 1: " + dadosHQ1);
    System.out.println("Dados da HQ 2: " + dadosHQ2);
    System.out.println("Dados da HQ 3: " + dadosHQ3);
  }
}
