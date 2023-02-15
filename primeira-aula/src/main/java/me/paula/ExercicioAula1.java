package me.paula;

import java.util.List;

/**
 * Essa classe tem como objetivo praticar as aulas 
 * de sala de aula virtual, aula 1
 */

class ServicoDeStreaming {

    //Modificadores de acesso, seus tipos, e seus atributos.
    private List<String> series;
    private List<String> filmes;
    private List<String> documentarios;

    //Construtor personalizado, para quando a classe for instanciada ela pedir esses valores
    public ServicoDeStreaming(List<String> series, List<String> filmes, List<String> documentarios) {
        this.series = series;
        this.filmes = filmes;
        this.documentarios = documentarios;
    }

    public List<String> getSeries() {
        return series;
    }

    public void setSeries(List<String> series) {
        this.series = series;
    }

    public List<String> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<String> filmes) {
        this.filmes = filmes;
    }

    public List<String> getDocumentarios() {
        return documentarios;
    }

    public void setDocumentarios(List<String> documentarios) {
        this.documentarios = documentarios;
    }

    //metodo TO string, é a representaçao textual do objeto
    @Override
    public String toString() {
        return "Netflix[" +
                "series='" + series + '\'' +
                ", filmes='" + filmes + '\'' +
                ", documentarios='" + documentarios + '\'' +
                ']';
    }
}

public class ExercicioAula1 {

    public static void main(String[] args) {

        List<String> series = List.of("You", "Casa de papel");
        List<String> filmes = List.of("Como eu era antes de voce","O homem do presidente");
        List<String> documentarios = List.of("Vida selvagem","A vida de hitler");

        ServicoDeStreaming netflix = new ServicoDeStreaming(series, filmes, documentarios);
        ServicoDeStreaming amazonPrime = new ServicoDeStreaming(series, filmes, documentarios);

        System.out.println("Bem vindos a Netflix, temos variedades no catalogo: ");
        System.out.println("  ");
        System.out.println("NETFLIX: "+ netflix);
        System.out.println("AMAZON: " + amazonPrime);

    }

}

