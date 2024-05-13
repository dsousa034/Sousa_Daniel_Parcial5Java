package PatronesConstruccion.Strategy;

public class StrategyRapido implements StrategyServicio{
    @Override
    public void servirCliente() {
        System.out.println("Entrega rapida en restaurante");
    }
}
