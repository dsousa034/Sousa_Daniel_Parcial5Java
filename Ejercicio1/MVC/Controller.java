package Ejercicio1.MVC;

public class Controller {
    private RestauranteModelo modelo;
    private Vista vista;

    public Controller(RestauranteModelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void actualizarVista() {
        vista.updateView(modelo.getNombre(), modelo.getMenu());
    }


}
