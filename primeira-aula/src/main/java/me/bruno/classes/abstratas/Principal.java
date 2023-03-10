package me.bruno.classes.abstratas;

public class Principal {

    public static void main(String[] args) {
        System.out.println("########## Ônibus ##########");
        //Onibus onibus = new Onibus();
        Veiculo onibus = new Onibus();
        onibus.acelerar();
        onibus.freiar();
        onibus.fazerAlgoDiferente();

        System.out.println("########## Carro ##########");
        CarroDePasseio carro = new CarroDePasseio();
        carro.acelerar();
        carro.freiar();
        carro.fazerAlgoDiferente();
        System.out.println("é automático:" + carro.isAutomatico());
    }

}
