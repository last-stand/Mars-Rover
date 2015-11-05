package com.Rover;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ActionHandlerTest {
    private Position position;

    @Before
    public void setUp(){
    }

    @Test
    public void testRotateLeftShouldGiveWestIfGivenDirectionIsNorth() throws Exception {
        position = new Position(0, 0, Direction.N);
        ActionHandler handler = new ActionHandler(position);
        assertTrue(handler.rotateLeft().getInitialPosition().direction.equals(Direction.W));
    }

    @Test
    public void testRotateRightShouldGiveNorthIfGivenDirectionIsWest() throws Exception {
        position = new Position(0, 0, Direction.W);
        ActionHandler handler = new ActionHandler(position);
        assertTrue(handler.rotateRight().getInitialPosition().direction.equals(Direction.N));
    }

    @Test
    public void testRotateLeftShouldGiveNorthIfGivenDirectionIsEast() throws Exception {
        position = new Position(0, 0, Direction.E);
        ActionHandler handler = new ActionHandler(position);
        assertTrue(handler.rotateLeft().getInitialPosition().direction.equals(Direction.N));
    }

    @Test
    public void testRotateRightShouldGiveEastIfGivenDirectionIsNorth() throws Exception {
        position = new Position(0, 0, Direction.N);
        ActionHandler handler = new ActionHandler(position);
        assertTrue(handler.rotateRight().getInitialPosition().direction.equals(Direction.E));
    }

    @Test
    public void testRotateRight4TimesShouldGiveEastIfGivenDirectionIsEast() throws Exception {
        position = new Position(0, 0, Direction.E);
        ActionHandler handler = new ActionHandler(position);
        assertTrue(handler.rotateRight().rotateRight().rotateRight().rotateRight().getInitialPosition().direction.equals(Direction.E));
    }
}