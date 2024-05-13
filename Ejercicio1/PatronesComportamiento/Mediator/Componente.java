package Ejercicio1.PatronesComportamiento.Mediator;

public abstract class Componente {
    protected Mediator mediator;

    public Componente(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void enviar(String mensaje);

    public abstract void recibir(String mensaje);

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
