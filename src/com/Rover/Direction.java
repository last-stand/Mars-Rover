package com.Rover;

public enum  Direction {
    E("S", "N"), W("N", "S"), N("E", "W"), S("W", "E");

    private String right;
    private String left;

    Direction(String right, String left) {
        this.right = right;
        this.left = left;
    }

    public Direction right(){
        return Direction.valueOf(right);
    }

    public Direction left(){
        return Direction.valueOf(left);
    }
}
