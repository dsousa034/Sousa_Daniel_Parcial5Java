package PatronesEstructuracion;

public class RestauranteIndividual extends RestauranteComposite{
    @Override
    public void servirCliente() {
        System.out.println("Entrega individual en restaurante");

    }

    @Override
    public void mostrarMenu() {
        System.out.println("Menu intividual del restaurante");
    }

    @Override
    public void realizarReserva() {
        System.out.println("Reserva individual realizada en restaurante");
    }
}
