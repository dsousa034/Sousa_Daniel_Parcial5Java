package PatronesComportamiento;

public class CancelarCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Cancelación realizada");
    }
}
