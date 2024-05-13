package Ejercicio1.PatronesConstruccion.Factory;

public class Lujo implements Restaurante{
    @Override
    public void servirCliente() {
        System.out.println("Sirviendo cliente en restaurante de lujo");
    }
}
