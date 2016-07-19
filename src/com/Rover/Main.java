package com.Rover;

public class Main {

    public static void main(String[] args) {
        MarsRover rover = new MarsRover(1, 2, "N");
        rover.runCommands("LMLMLMLMM");
        System.out.println(rover.toString());
    }
}
