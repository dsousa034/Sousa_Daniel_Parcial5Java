package Ejercicio1.PatronesComportamiento.State;

public class Mesa {
    private State state;

    public Mesa() {
        this.state = new LibreState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void ocupar() {
        this.state.ocupar();
    }

    public void reservar() {
        this.state.reservar();
    }

    public void liberar() {
        this.state.liberar();
    }
}
