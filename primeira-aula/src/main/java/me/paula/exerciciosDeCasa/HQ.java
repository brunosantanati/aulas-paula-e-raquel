package me.paula.exerciciosDeCasa;

import java.math.BigDecimal;

public class HQ {

  private String nome;
  private BigDecimal preco;
  private String roteirista;
  private String artista;
  private String ISBN;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPreco(BigDecimal preco) {
    this.preco = preco;
  }

  public void setRoteirista(String roteirista) {
    this.roteirista = roteirista;
  }

  public void setArtista(String artista) {
    this.artista = artista;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  @Override
  public String toString() {
    return (
      "HQ: \nnome=" +
      nome +
      "\npreco=" +
      preco +
      "\nroteirista=" +
      roteirista +
      "\nartista=" +
      artista +
      "\nISBN=" +
      ISBN +
      ""
    );
  }
}
