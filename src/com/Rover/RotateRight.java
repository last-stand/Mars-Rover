package com.Rover;

public class RotateRight implements CommandRunner {
    @Override
    public void performAction(MarsRover marsRover){
        marsRover.setDirection(String.valueOf(marsRover.getDirection().right()));
    }
}
