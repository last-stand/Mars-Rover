package com.Rover;

import java.util.List;

public class RotateLeft implements CommandRunner {
    @Override
    public void performAction(MarsRover marsRover){
        marsRover.direction = marsRover.direction.left();
    }
}
