package Ejercicio1.PatronesConstruccion.Strategy;

public class StrategyTematico implements StrategyServicio{
    @Override
    public void servirCliente() {
        System.out.println("Experiencia unica para el cliente en restaurante temático");
    }
}
