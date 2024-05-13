package PatronesConstruccion;

public class UsoRestaurante {
    public static void main(String[] args) {
        // Patrón Factory
        Gestor gestor = Gestor.getInstance();
        Restaurante restauranteRapido = gestor.crearRestaurante("rápido");
        Restaurante restauranteTemático = gestor.crearRestaurante("temático");
        Restaurante restauranteDeLujo = gestor.crearRestaurante("de lujo");

        restauranteRapido.servirCliente();
        restauranteTemático.servirCliente();
        restauranteDeLujo.servirCliente();

        // Patrón Strategy
        StrategyServicio estrategiaRapida = new StrategyRapido();
        StrategyServicio estrategiaTematica = new StrategyTematico();
        StrategyServicio estrategiaLujo = new StrategyLujo();

        estrategiaRapida.servirCliente();
        estrategiaTematica.servirCliente();
        estrategiaLujo.servirCliente();
    }
    }
