package Ejercicio1.PatronesComportamiento.State;

public class LibreState implements State{
    @Override
    public void ocupar() {
    }

    @Override
    public void reservar() {
    }

    @Override
    public void liberar() {
        System.out.println("Mesa libre");
    }
}
