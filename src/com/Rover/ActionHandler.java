package com.Rover;

import java.util.List;

public class ActionHandler {
    private CommandRunner commandRunner;

    public ActionHandler(CommandRunner commandRunner) {
        this.commandRunner = commandRunner;
    }

    public void executeCommand(MarsRover marsRover){
        commandRunner.performAction(marsRover);
    }
}
