package com.Rover;

public class MoveForward implements CommandRunner {
    @Override
    public void performAction(MarsRover marsRover) {
        switch (marsRover.direction){
            case N:
                marsRover.position_y++;
                break;
            case S:
                if(marsRover.position_y > 0)
                    marsRover.position_y--;
                break;
            case E:
                marsRover.position_x++;
                break;
            case W:
                if(marsRover.position_x > 0)
                    marsRover.position_x--;
                break;
        }
    }
}
