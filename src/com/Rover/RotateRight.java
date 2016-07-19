package com.Rover;

public class RotateRight implements CommandRunner {
    @Override
    public void performAction(MarsRover marsRover){
        marsRover.setDirection(marsRover.getDirection().right);
    }
}
