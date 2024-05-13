package Ejercicio1.PatronesComportamiento.State;

public class OcupadaState implements State{
    @Override
    public void ocupar() {
        System.out.println("Mesa ocupada");
    }

    @Override
    public void reservar() {

    }

    @Override
    public void liberar() {

    }
}
