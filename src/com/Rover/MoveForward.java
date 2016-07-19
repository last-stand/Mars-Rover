package com.Rover;

public class MoveForward implements CommandRunner {
    @Override
    public void performAction(MarsRover marsRover) {
        switch (marsRover.direction){
            case N:
                if(marsRover.coordinates.y < marsRover.plateau.maxCoordinates.y)
                    marsRover.coordinates.y++;
                break;
            case S:
                if(marsRover.coordinates.y > 0)
                    marsRover.coordinates.y--;
                break;
            case E:
                if(marsRover.coordinates.x < marsRover.plateau.maxCoordinates.x)
                    marsRover.coordinates.x++;
                break;
            case W:
                if(marsRover.coordinates.x > 0)
                    marsRover.coordinates.x--;
                break;
        }
    }
}
