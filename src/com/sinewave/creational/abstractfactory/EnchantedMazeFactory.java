package com.sinewave.creational.abstractfactory;

import com.sinewave.creational.entities.Door;
import com.sinewave.creational.entities.Maze;
import com.sinewave.creational.entities.Room;
import com.sinewave.creational.entities.Wall;

public class EnchantedMazeFactory implements  MazeFactory{

    @Override
    public Maze makeMaze() {
        return null;
    }

    @Override
    public Wall makeWall() {
        return null;
    }

    @Override
    public Room makeRoom(int roomNumber) {
        return null;
    }

    @Override
    public Door makeDoor(Room A, Room B) {
        return null;
    }
}
