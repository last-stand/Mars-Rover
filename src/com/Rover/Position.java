package com.Rover;

public class Position{
    protected int position_x;
    protected int position_y;
    protected Direction direction;

    public Position(int position_x, int position_y, Direction direction) {
        this.position_x = position_x;
        this.position_y = position_y;
        this.direction = direction;
    }
}
