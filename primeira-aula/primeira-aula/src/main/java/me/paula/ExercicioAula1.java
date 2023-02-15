package me.paula;

/**
 * Essa classe tem como objetivo praticar as aulas 
 * de sala de aula virtual, aula 1
 */

class Netflix {

    //Modificadores de acesso, seus tipos, e seus atributos.
    private String series;
    private String filmes;
    private String documentarios;

    //Construtor personalizado, para quando a classe for instanciada ela pedir esses valores
    public Netflix(String series, String filmes, String documentarios){
        this.series = series;
        this.filmes = filmes;
        this.documentarios = documentarios;
    }
    public void setSeries(String series) {
        this.series = series;
    }

    public void setFilmes(String filmes) {
        this.filmes = filmes;
    }

    public void setDocumentarios(String documentarios) {
        this.documentarios = documentarios;
    }

    public void getSeries(String series) {
        this.series = series;
    }

    public void getFilmes(String filmes) {
        this.filmes = filmes;
    }

    public void getDocumentarios(String documentarios) {
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
    Netflix netflix = new Netflix("You", "Antes de voce", "O mundo vegano");

        System.out.println("Bem vindos a Netflix, temos variedades no catalogo: ");
        System.out.println("  ");
        System.out.println(netflix);

    }

}

