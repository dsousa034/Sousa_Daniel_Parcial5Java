package PatronesConstruccion;

public class StrategyLujo implements StrategyServicio{
    @Override
    public void servirCliente() {
        System.out.println("Atencion lujosa para el cliente en restaurante de lujo");
    }
}
