package com.Rover;

import java.awt.Point;

public class MoveForward implements CommandRunner {
    @Override
    public void performAction(MarsRover marsRover) {
        Point location = marsRover.getCoordinates();
        switch (marsRover.getDirection()){
            case N:
                if(location.y < marsRover.getPlateau().getMaxCoordinates().y)
                    location.y++;
                break;
            case S:
                if(location.y > 0)
                    location.y--;
                break;
            case E:
                if(location.x < marsRover.getPlateau().getMaxCoordinates().x)
                    location.x++;
                break;
            case W:
                if(marsRover.getCoordinates().x > 0)
                    location.x--;
                break;
        }
        marsRover.setCoordinates(location);
    }
}
