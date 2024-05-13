package Ejercicio1.PatronesComportamiento.Command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> command = new ArrayList<>();

    public void addCommand(Command command){
        this.command.add(command);
    }

    public void executeCommands(){
        for (Command command : this.command) {
            command.execute();
        }
    }

}
