package com.Rover;

public class MarsRover{
    private Position position;

    public MarsRover(Position position) {

        this.position = position;
    }

    @Override
    public String toString() {
        return "X: "+position.position_x+" Y: "+position.position_y+" Direction: "+position.direction;
    }
}
