package com.Rover;

import java.util.List;

public class ActionHandler {
    private List<Direction> directionSequence = new CircularList<Direction>();
    {
        directionSequence.add(Direction.N);
        directionSequence.add(Direction.E);
        directionSequence.add(Direction.S);
        directionSequence.add(Direction.W);
    }

    private Position initialPosition;

    public ActionHandler(Position initialPosition) {
        this.initialPosition = initialPosition;
    }

    public ActionHandler rotateLeft(){
        int indexOfInitialPosition = directionSequence.indexOf(initialPosition.direction);
        initialPosition.direction = directionSequence.get(indexOfInitialPosition - 1);
        return new ActionHandler(initialPosition);
    }

    public ActionHandler rotateRight(){
        int indexOfInitialPosition = directionSequence.indexOf(initialPosition.direction);
        initialPosition.direction = directionSequence.get(indexOfInitialPosition + 1);
        return new ActionHandler(initialPosition);
    }

    public ActionHandler move(){
        switch (initialPosition.direction){
            case N:
                initialPosition.position_y++;
            case S:
                initialPosition.position_y--;
            case E:
                initialPosition.position_x++;
            case W:
                initialPosition.position_x--;
        }
        return new ActionHandler(initialPosition);
    }

    public Position getInitialPosition() {
        return initialPosition;
    }
}
