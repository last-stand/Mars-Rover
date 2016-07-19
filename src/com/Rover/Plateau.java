package com.Rover;
import java.awt.Point;

public class Plateau {
    private Point maxCoordinates;

    public Plateau(int x, int y){
        this.maxCoordinates = new Point(x, y);
    }

    public Point getMaxCoordinates() {
        return maxCoordinates;
    }
}
