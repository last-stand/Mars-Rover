package com.Rover;

public class Main {

    public static void main(String[] args) {
        Position position = new Position(0,0,Direction.N);
        MarsRover rover = new MarsRover(position);
        System.out.println(rover.toString());
    }
}
