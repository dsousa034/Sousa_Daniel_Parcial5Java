package PatronesConstruccion;

public class Gestor {
    private static Gestor instancia;

    private Gestor() {}

    public static Gestor getInstance() {
        if (instancia == null) {
            instancia = new Gestor();
        }
        return instancia;
    }

    public Restaurante crearRestaurante(String tipo) {
        if (tipo.equalsIgnoreCase("rápido")) {
            return new Rapido();
        } else if (tipo.equalsIgnoreCase("temático")) {
            return new Temático();
        } else if (tipo.equalsIgnoreCase("de lujo")) {
            return new Lujo();
        }
        return null;
    }
}

