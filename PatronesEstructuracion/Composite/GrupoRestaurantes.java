package PatronesEstructuracion.Composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoRestaurantes extends RestauranteComposite{
    List<RestauranteIndividual> listaRestaurantes = new ArrayList<>();

    @Override
    public void servirCliente() {
        System.out.println("Entrega del servicio en grupo de restaurantes");
    }

    @Override
    public void mostrarMenu() {
        System.out.println("Menu del grupo de restaurantes");
    }

    @Override
    public void realizarReserva() {
        System.out.println("Reserva en grupo de restaurantes realizada");
    }
}
