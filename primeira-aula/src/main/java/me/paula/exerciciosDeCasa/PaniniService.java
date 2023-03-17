package me.paula.exerciciosDeCasa;

import java.util.HashMap;
import java.util.Map;

public class PaniniService {

  private static final String O_REI_DA_COZINHA_DO_INFERNO_ISBN =
    "9788583681595";
  private static final String BATMAN_ANO_ZERO = "9788583682325";
  private static final String LENDAS_DO_UNIVERSO_DC = "9788583682330";

  public Map<String, String> getDadosHQByIsbn(String IsbnHQ) {
    Map<String, String> infoHQ = new HashMap<>();

    switch (IsbnHQ) {
      case O_REI_DA_COZINHA_DO_INFERNO_ISBN:
        infoHQ.put("nome", "O Rei da Cozinha do Inferno");
        infoHQ.put("preco", "50.00");
        infoHQ.put("roteirista", "Brian Michael Bendis");
        infoHQ.put("artista", "Alex Maleev");
        infoHQ.put("ISBN", O_REI_DA_COZINHA_DO_INFERNO_ISBN);
        break;
      case BATMAN_ANO_ZERO:
        infoHQ.put("nome", "Batman: Ano Zero");
        infoHQ.put("preco", "70.00");
        infoHQ.put("roteirista", "Scott Snyder");
        infoHQ.put("artista", "Greg Capullo");
        infoHQ.put("ISBN", BATMAN_ANO_ZERO);
        break;
      case LENDAS_DO_UNIVERSO_DC:
        infoHQ.put("nome", "Lendas do universo DC: Quarto mundo volume 8");
        infoHQ.put("preco", "42.00");
        infoHQ.put("roteirista", "Jack");
        infoHQ.put("artista", "Jack");
        infoHQ.put("ISBN", LENDAS_DO_UNIVERSO_DC);
        break;
    }
    return infoHQ;
  }
}
