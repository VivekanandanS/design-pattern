package com.sinewave.creational.builder;

import com.sinewave.creational.entities.Door;
import com.sinewave.creational.entities.Maze;
import com.sinewave.creational.entities.Room;
import com.sinewave.creational.entities.Wall;
import com.sinewave.enums.Direction;

public class SimpleMazeBuilder implements MazeBuilder {
    private Maze maze;

    @Override
    public void buildMaze() {
        maze = new Maze();
    }

    @Override
    public void buildRoom(int roomNumber) {
        if (null != maze.findRoom(roomNumber))
            return;
        Room room = new Room(roomNumber);
        room.setSide(Direction.NORTH,new Wall());
        room.setSide(Direction.SOUTH,new Wall());
        room.setSide(Direction.EAST,new Wall());
        room.setSide(Direction.WEST,new Wall());
        maze.addRoom(room);
    }

    @Override
    public void buildDoor(int roomA, int roomB) throws Exception {
        Room A = maze.findRoom(roomA);
        Room B = maze.findRoom(roomB);

        if (null == A || null == B)
            throw new Exception("Room could not be found");

        Door door = new Door(A, B);
    }

    @Override
    public Maze getMaze() {
        return maze;
    }
}
