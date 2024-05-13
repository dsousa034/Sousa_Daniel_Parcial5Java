package PatronesComportamiento.Command;

public class ReservarCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Reserva realizada");
    }
}
