package com.sinewave.creational.factorymethod.maze;

import com.sinewave.creational.entities.Door;
import com.sinewave.creational.entities.Maze;
import com.sinewave.creational.entities.Room;
import com.sinewave.creational.entities.Wall;

public class SimpleMazeFactory implements AbstractMazeFactory {

    Maze maze;

    public SimpleMazeFactory() {

    }

    @Override
    public Maze makeMaze() {
        return null;
    }

    @Override
    public Room makeRoom(int roomNumber) {
        return null;
    }

    @Override
    public Wall makeWall() {
        return null;
    }

    @Override
    public Door makeDoor(Room A, Room B) {
        return null;
    }


}
