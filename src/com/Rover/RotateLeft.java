package com.Rover;

public class RotateLeft implements CommandRunner {
    @Override
    public void performAction(MarsRover marsRover){
        marsRover.direction = marsRover.direction.left();
    }
}
