package com.Rover;

import java.util.HashMap;
import java.util.Map;

public class MarsRover{
    private Position position;

    public MarsRover(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "X: "+position.position_x+" Y: "+position.position_y+" Direction: "+position.direction;
    }

    public void runCommands(String commandString){
        Map<String,Command> commandMap = commandMapper();
        for (String command : commandString.split("")) {
            Command commandToExecute = commandMap.get(command);
            this.position = commandToExecute.performAction(position).getInitialPosition();
        }
    }

    private Map<String,Command> commandMapper(){
        Map<String,Command> commandMap = new HashMap<String, Command>();
        for (Command command : Command.values()) {
            commandMap.put(command.toString(),command);
        }
        return commandMap;
    }
}
