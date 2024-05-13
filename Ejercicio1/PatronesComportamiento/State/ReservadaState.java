package Ejercicio1.PatronesComportamiento.State;

public class ReservadaState implements State{
    @Override
    public void ocupar() {

    }

    @Override
    public void reservar() {
        System.out.println("Mesa reservada");
    }

    @Override
    public void liberar() {

    }
}
