package PatronesComportamiento;

public class OrdenarCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Orden realizada");
    }
}
