package PatronesConstruccion;

public class StrategyTematico implements StrategyServicio{
    @Override
    public void servirCliente() {
        System.out.println("Experiencia unica para el cliente en restaurante temático");
    }
}
