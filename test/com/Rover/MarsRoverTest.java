package com.Rover;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MarsRoverTest {

    Plateau plateau = new Plateau(5, 5);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testMarsRoverShouldMoveOneUnitonOnY_axis() throws Exception {
        MarsRover rover = new MarsRover(0, 0, "N", plateau);
        rover.runCommands("M");
        assertTrue(rover.toString().equals("X: 0 Y: 1 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldMoveFiveUnitonOnY_axis() throws Exception {
        MarsRover rover = new MarsRover(0, 0, "N", plateau);
        rover.runCommands("MMMMM");
        assertTrue(rover.toString().equals("X: 0 Y: 5 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldMoveBackOneUnitonOnY_axis() throws Exception {
        MarsRover rover = new MarsRover(0, 3, "S", plateau);
        rover.runCommands("M");
        assertTrue(rover.toString().equals("X: 0 Y: 2 Direction: S"));
    }

    @Test
    public void testMarsRoverShouldMoveBackFourUnitonOnX_axis() throws Exception {
        MarsRover rover = new MarsRover(0, 0, "E", plateau);
        rover.runCommands("MMMM");
        assertTrue(rover.toString().equals("X: 4 Y: 0 Direction: E"));
    }

    @Test
    public void testMarsRoverShouldMoveBackTwoUnitonOnX_axis() throws Exception {
        MarsRover rover = new MarsRover(5, 1, "W", plateau);
        rover.runCommands("MM");
        assertTrue(rover.toString().equals("X: 3 Y: 1 Direction: W"));
    }

    @Test
    public void testMarsRoverShouldRotateLeftInWestDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "N", plateau);
        rover.runCommands("L");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: W"));
    }

    @Test
    public void testMarsRoverShouldRotateRightInEastDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "N", plateau);
        rover.runCommands("R");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: E"));
    }

    @Test
    public void testMarsRoverShouldRotateLeftInEastDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "S", plateau);
        rover.runCommands("L");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: E"));
    }

    @Test
    public void testMarsRoverShouldRotateRightInWestDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "S", plateau);
        rover.runCommands("R");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: W"));
    }

    @Test
    public void testMarsRoverShouldRotateLeftInNorthDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "E", plateau);
        rover.runCommands("L");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldRotateRightInSouthDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "E", plateau);
        rover.runCommands("R");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: S"));
    }

    @Test
    public void testMarsRoverShouldRotateLeftInSouthDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "W", plateau);
        rover.runCommands("L");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: S"));
    }

    @Test
    public void testMarsRoverShouldRotateRightInNorthDirection() throws Exception {
        MarsRover rover = new MarsRover(1, 1, "W", plateau);
        rover.runCommands("R");
        assertTrue(rover.toString().equals("X: 1 Y: 1 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldMoveToX_5AndY_5NorthFacing() throws Exception {
        MarsRover rover = new MarsRover(0, 0, "E", plateau);
        rover.runCommands("MLMRMLMRMLMRMLMRMLM");
        assertTrue(rover.toString().equals("X: 5 Y: 5 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldComeBackToSamePositionInWestFacing() throws Exception {
        MarsRover rover = new MarsRover(2, 1, "N", plateau);
        rover.runCommands("MRMRMRM");
        assertTrue(rover.toString().equals("X: 2 Y: 1 Direction: W"));
    }

    @Test
    public void testMarsRoverShouldNotMoveInSouthOnY_0() throws Exception {
        MarsRover rover = new MarsRover(2, 0, "S", plateau);
        rover.runCommands("M");
        assertTrue(rover.toString().equals("X: 2 Y: 0 Direction: S"));
    }

    @Test
    public void testMarsRoverShouldNotMoveInWestOnX_0() throws Exception {
        MarsRover rover = new MarsRover(0, 2, "W", plateau);
        rover.runCommands("M");
        assertTrue(rover.toString().equals("X: 0 Y: 2 Direction: W"));
    }

    @Test
    public void testMarsRoverShouldNotMoveInEastOnX_5() throws Exception {
        MarsRover rover = new MarsRover(5, 2, "E", plateau);
        rover.runCommands("M");
        assertTrue(rover.toString().equals("X: 5 Y: 2 Direction: E"));
    }

    @Test
    public void testMarsRoverShouldNotMoveInNorthOnY_5() throws Exception {
        MarsRover rover = new MarsRover(1, 5, "N", plateau);
        rover.runCommands("M");
        assertTrue(rover.toString().equals("X: 1 Y: 5 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldRotateLeftFromNorthOnY_5() throws Exception {
        MarsRover rover = new MarsRover(1, 5, "N", plateau);
        rover.runCommands("ML");
        assertTrue(rover.toString().equals("X: 1 Y: 5 Direction: W"));
    }

    @Test
    public void testMarsRoverShouldRotateRightFromEastOnX_5() throws Exception {
        MarsRover rover = new MarsRover(5, 0, "E", plateau);
        rover.runCommands("MR");
        assertTrue(rover.toString().equals("X: 5 Y: 0 Direction: S"));
    }

    @Test
    public void testMarsRoverShouldMoveX_1AndY_3InNorth() throws Exception {
        MarsRover rover = new MarsRover(1, 2, "N", plateau);
        rover.runCommands("LMLMLMLMM");
        assertTrue(rover.toString().equals("X: 1 Y: 3 Direction: N"));
    }

    @Test
    public void testMarsRoverShouldMoveX_5AndY_1InEast() throws Exception {
        MarsRover rover = new MarsRover(3, 3, "E", plateau);
        rover.runCommands("MMRMMRMRRM");
        assertTrue(rover.toString().equals("X: 5 Y: 1 Direction: E"));
    }

}