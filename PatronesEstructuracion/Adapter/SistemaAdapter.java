package PatronesEstructuracion.Adapter;

import PatronesEstructuracion.Restaurante;

public class SistemaAdapter implements Restaurante {
    private SistemaExterno sistemaExterno;
    @Override
    public void servirCliente() {

    }
    public void realizarReserva() {
        sistemaExterno.realizarReservaExterna();
    }
    public void entregarComida() {
        sistemaExterno.realizarEntregaComida();
    }
}
