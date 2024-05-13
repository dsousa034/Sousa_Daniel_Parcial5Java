package PatronesEstructuracion.Composite;

import PatronesEstructuracion.Restaurante;

public abstract class RestauranteComposite implements Restaurante {
    public abstract void mostrarMenu();
    public abstract void realizarReserva();
}
