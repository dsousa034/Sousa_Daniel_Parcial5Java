package Ejercicio1.PatronesComportamiento.Command;

public class OrdenarCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Orden realizada");
    }
}
