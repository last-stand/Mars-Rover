package com.Rover;

public enum Command {
    L{
        public DirectionHandler rotateLeft(Direction direction){
            DirectionHandler handler = new DirectionHandler(direction);
            return handler.rotateLeft();
        }
    },
    R{
        public DirectionHandler rotateRight(Direction direction){
            DirectionHandler handler = new DirectionHandler(direction);
            return handler.rotateRight();
        }
    },
    M{

    }
}
