package PatronesComportamiento.Mediator;

import java.awt.*;

public class RestauranteMediator implements Mediator{
    @Override
    public void enviarMensaje(String mensaje, Component component) {
        System.out.println(mensaje);
    }
}
