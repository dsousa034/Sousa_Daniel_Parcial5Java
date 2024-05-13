package Ejercicio1.PatronesEstructuracion.Adapter;

import Ejercicio1.PatronesEstructuracion.Restaurante;

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
