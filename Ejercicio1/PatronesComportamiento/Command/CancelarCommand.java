package Ejercicio1.PatronesComportamiento.Command;

public class CancelarCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Cancelación realizada");
    }
}
