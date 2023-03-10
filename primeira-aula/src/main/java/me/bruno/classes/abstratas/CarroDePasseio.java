package me.bruno.classes.abstratas;

public class CarroDePasseio extends Veiculo implements Automatico{
    @Override
    public void fazerAlgoDiferente() {
        System.out.println("Carro de passeio fazendo algo diferente...");
    }

    @Override
    public boolean isAutomatico() {
        return true;
    }
}
