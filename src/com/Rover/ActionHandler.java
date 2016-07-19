package com.Rover;

public class ActionHandler {
    private CommandRunner commandRunner;

    public ActionHandler(CommandRunner commandRunner) {
        this.commandRunner = commandRunner;
    }

    public void executeCommand(MarsRover marsRover){
        commandRunner.performAction(marsRover);
    }
}
