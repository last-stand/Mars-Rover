package com.Rover;

public class MarsRover{
    public int position_x;
    public int position_y;
    public Direction direction;

    public MarsRover(int position_x, int position_y, String direction) {
        this.position_x = position_x;
        this.position_y = position_y;
        this.direction = Direction.valueOf(direction);
    }

    @Override
    public String toString() {
        return "X: "+this.position_x+" Y: "+this.position_y+" Direction: "+this.direction;
    }

    public void runCommands(String commandString){
        for (String command : commandString.split("")) {
            switch (command) {
                case "L":
                    new ActionHandler(new RotateLeft()).executeCommand(this);
                    break;
                case "R":
                    new ActionHandler(new RotateRight()).executeCommand(this);
                    break;
                case "M":
                    new ActionHandler(new MoveForward()).executeCommand(this);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid command: " + command);
            }
        }
    }
}
