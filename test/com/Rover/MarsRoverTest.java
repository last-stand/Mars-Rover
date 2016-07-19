package com.Rover;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MarsRoverTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testMarsRoverShouldMoveOneUnitonOnY_axis() throws Exception {
        MarsRover rover = new MarsRover(0, 0, "N");
        rover.runCommands("M");
        assertTrue(rover.toString().equals("X: 0 Y: 1 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldMoveFiveUnitonOnY_axis() throws Exception {
        MarsRover rover = new MarsRover(0, 0, "N");
        rover.runCommands("MMMMM");
        assertTrue(rover.toString().equals("X: 0 Y: 5 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldMoveBackOneUnitonOnY_axis() throws Exception {
        MarsRover rover = new MarsRover(0, 3, "S");
        rover.runCommands("M");
        assertTrue(rover.toString().equals("X: 0 Y: 2 Direction: S"));
    }

    @Test
    public void testMarsRoverShouldMoveBackFourUnitonOnX_axis() throws Exception {
        MarsRover rover = new MarsRover(0, 0, "E");
        rover.runCommands("MMMM");
        assertTrue(rover.toString().equals("X: 4 Y: 0 Direction: E"));
    }

    @Test
    public void testMarsRoverShouldMoveBackTwoUnitonOnX_axis() throws Exception {
        MarsRover rover = new MarsRover(5, 1, "W");
        rover.runCommands("MM");
        assertTrue(rover.toString().equals("X: 3 Y: 1 Direction: W"));
    }

    @Test
    public void testMarsRoverShouldRotateLeftInWestDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "N");
        rover.runCommands("L");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: W"));
    }

    @Test
    public void testMarsRoverShouldRotateRightInEastDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "N");
        rover.runCommands("R");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: E"));
    }

    @Test
    public void testMarsRoverShouldRotateLeftInEastDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "S");
        rover.runCommands("L");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: E"));
    }

    @Test
    public void testMarsRoverShouldRotateRightInWestDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "S");
        rover.runCommands("R");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: W"));
    }

    @Test
    public void testMarsRoverShouldRotateLeftInNorthDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "E");
        rover.runCommands("L");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldRotateRightInSouthDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "E");
        rover.runCommands("R");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: S"));
    }

    @Test
    public void testMarsRoverShouldRotateLeftInSouthDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "W");
        rover.runCommands("L");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: S"));
    }

    @Test
    public void testMarsRoverShouldRotateRightInNorthDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "W");
        rover.runCommands("R");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldMoveToX_5AndY_5NorthFacing() throws Exception {
        MarsRover rover = new MarsRover(0, 0, "E");
        rover.runCommands("MLMRMLMRMLMRMLMRMLM");
        assertTrue(rover.toString().equals("X: 5 Y: 5 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldComeBackToSamePositionInWestFacing() throws Exception {
        MarsRover rover = new MarsRover(2, 1, "N");
        rover.runCommands("MRMRMRM");
        assertTrue(rover.toString().equals("X: 2 Y: 1 Direction: W"));
    }

    @Test
    public void testMarsRoverShouldNotMoveInSouthOnY_0() throws Exception {
        MarsRover rover = new MarsRover(2, 0, "S");
        rover.runCommands("M");
        assertTrue(rover.toString().equals("X: 2 Y: 0 Direction: S"));
    }

    @Test
    public void testMarsRoverShouldNotMoveInWestOnX_0() throws Exception {
        MarsRover rover = new MarsRover(0, 2, "W");
        rover.runCommands("M");
        assertTrue(rover.toString().equals("X: 0 Y: 2 Direction: W"));
    }

    @Test
    public void testMarsRoverShouldMoveX_1AndY_3InNorth() throws Exception {
        MarsRover rover = new MarsRover(1, 2, "N");
        rover.runCommands("LMLMLMLMM");
        assertTrue(rover.toString().equals("X: 1 Y: 3 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldMoveX_5AndY_1InEast() throws Exception {
        MarsRover rover = new MarsRover(3, 3, "E");
        rover.runCommands("MMRMMRMRRM");
        assertTrue(rover.toString().equals("X: 5 Y: 1 Direction: E"));
    }

}