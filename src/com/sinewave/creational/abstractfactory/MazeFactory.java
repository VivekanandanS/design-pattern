package com.sinewave.creational.abstractfactory;

import com.sinewave.creational.entities.Door;
import com.sinewave.creational.entities.Maze;
import com.sinewave.creational.entities.Room;
import com.sinewave.creational.entities.Wall;

public interface MazeFactory {
    public Maze makeMaze();
    public Wall makeWall();
    public Room makeRoom(int roomNumber);
    public Door makeDoor(Room A, Room B);
}
