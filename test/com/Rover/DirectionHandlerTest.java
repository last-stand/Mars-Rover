package com.Rover;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DirectionHandlerTest {

    @Test
    public void testRotateLeftShouldGiveWestIfGivenDirectionIsNorth() throws Exception {
        DirectionHandler handler = new DirectionHandler(Direction.N);
        assertTrue(handler.rotateLeft().getInitialDirection().equals(Direction.W));
    }

    @Test
    public void testRotateRightShouldGiveNorthIfGivenDirectionIsWest() throws Exception {
        DirectionHandler handler = new DirectionHandler(Direction.W);
        assertTrue(handler.rotateRight().getInitialDirection().equals(Direction.N));
    }

    @Test
    public void testRotateLeftShouldGiveNorthIfGivenDirectionIsEast() throws Exception {
        DirectionHandler handler = new DirectionHandler(Direction.E);
        assertTrue(handler.rotateLeft().getInitialDirection().equals(Direction.N));
    }

    @Test
    public void testRotateRightShouldGiveEastIfGivenDirectionIsNorth() throws Exception {
        DirectionHandler handler = new DirectionHandler(Direction.N);
        assertTrue(handler.rotateRight().getInitialDirection().equals(Direction.E));
    }

    @Test
    public void testRotateRight4TimesShouldGiveEastIfGivenDirectionIsEast() throws Exception {
        DirectionHandler handler = new DirectionHandler(Direction.E);
        assertTrue(handler.rotateRight().rotateRight().rotateRight().rotateRight().getInitialDirection().equals(Direction.E));
    }
}