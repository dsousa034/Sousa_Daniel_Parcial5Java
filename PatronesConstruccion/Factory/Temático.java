package PatronesConstruccion.Factory;

public class Temático implements Restaurante{
    @Override
    public void servirCliente() {
        System.out.println("Sirviendo cliente en restaurante temático");
    }
}
