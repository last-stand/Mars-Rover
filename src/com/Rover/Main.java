package com.Rover;

public class Main {

    public static void main(String[] args) {
        Position position = new Position(1,2,Direction.N);
        MarsRover rover = new MarsRover(position);
        rover.runCommands("LMLMLMLMM");
        System.out.println(rover.toString());
    }
}
