package com.Rover;

public enum Command {
    L{
        @Override
        public DirectionHandler performAction(Direction direction){
            DirectionHandler handler = new DirectionHandler(direction);
            return handler.rotateLeft();
        }
    },
    R{
        @Override
        public DirectionHandler performAction(Direction direction){
            DirectionHandler handler = new DirectionHandler(direction);
            return handler.rotateRight();
        }
    };
    public abstract DirectionHandler performAction(Direction direction);
}
