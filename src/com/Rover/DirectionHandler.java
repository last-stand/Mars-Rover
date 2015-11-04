package com.Rover;

import java.util.List;

public class DirectionHandler {
    private List<Direction> directionSequence = new CircularList<Direction>();
    {
        directionSequence.add(Direction.N);
        directionSequence.add(Direction.E);
        directionSequence.add(Direction.S);
        directionSequence.add(Direction.W);
    }

    private Direction initialDirection;

    public DirectionHandler(Direction initialDirection) {
        this.initialDirection = initialDirection;
    }

    public DirectionHandler rotateLeft(){
        int indexOfInitialPosition = directionSequence.indexOf(initialDirection);
        return new DirectionHandler(directionSequence.get(indexOfInitialPosition - 1));
    }

    public DirectionHandler rotateRight(){
        int indexOfInitialPosition = directionSequence.indexOf(initialDirection);
        return new DirectionHandler(directionSequence.get(indexOfInitialPosition + 1));
    }

    public Direction getInitialDirection() {
        return initialDirection;
    }
}
