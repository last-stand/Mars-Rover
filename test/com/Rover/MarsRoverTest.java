package com.Rover;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class MarsRoverTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testToStringShouldRetunPositionOfRoverInString() throws Exception {
        Position position = new Position(0,0,Direction.N);
        MarsRover rover = new MarsRover(position);
        assertTrue(rover.toString().equals("X: 0 Y: 0 Direction: N"));
    }
}