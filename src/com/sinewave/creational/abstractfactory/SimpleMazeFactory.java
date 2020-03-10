package com.sinewave.creational.abstractfactory;

import com.sinewave.creational.problem.Door;
import com.sinewave.creational.problem.Maze;
import com.sinewave.creational.problem.Room;
import com.sinewave.creational.problem.Wall;

public class SimpleMazeFactory implements MazeFactory {

    @Override
    public Maze makeMaze() {
        return null;
    }

    @Override
    public Wall makeWall() {
        return new Wall();
    }

    @Override
    public Room makeRoom(int roomNumber) {
        return new Room(roomNumber);
    }

    @Override
    public Door makeDoor(Room A, Room B) {
        return new Door(A, B);
    }
}
