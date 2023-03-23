package me.paula.exerciciosDeCasa;

import java.math.BigDecimal;
import java.util.Map;

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

    public void consumirPaniniService(String IsbnHQ) {
		
		PaniniService service = new PaniniService();
		Map<String, String> dadosHQ = service.getDadosHQByIsbn(IsbnHQ);
		
		this.nome = dadosHQ.get("nome");
		this.preco = new BigDecimal(dadosHQ.get("preco"));
		this.roteirista = dadosHQ.get("roteirista");
		this.artista = dadosHQ.get("artista");
		this.ISBN = dadosHQ.get("ISBN");
	}

    @Override
    public String toString() {
        return "HQ: \nnome=" + nome + "\npreco=" + preco + "\nroteirista=" + roteirista + "\nartista=" + artista
                + "\nISBN=" + ISBN + "";
    }
}