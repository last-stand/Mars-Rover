package com.Rover;

public enum Command {
    L{
        @Override
        public ActionHandler performAction(Position position){
            ActionHandler handler = new ActionHandler(position);
            return handler.rotateLeft();
        }
    },
    R{
        @Override
        public ActionHandler performAction(Position position){
            ActionHandler handler = new ActionHandler(position);
            return handler.rotateRight();
        }
    },
    M{
        @Override
        public ActionHandler performAction(Position position){
            ActionHandler handler = new ActionHandler(position);
            return handler.move();
        }
    };
    public abstract ActionHandler performAction(Position position);
}
