package com.Rover;

import java.awt.Point;

public class MarsRover{
    public Point coordinates;
    public Direction direction;
    public Plateau plateau;

    public MarsRover(int position_x, int position_y, String direction, Plateau plateau) {
        this.coordinates = new Point(position_x, position_y);
        this.direction = Direction.valueOf(direction);
        this.plateau = plateau;
    }

    @Override
    public String toString() {
        return "X: "+this.coordinates.x+" Y: "+this.coordinates.y+" Direction: "+this.direction;
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
