package com.sinewave.creational.factorymethod.maze;

import com.sinewave.creational.entities.Door;
import com.sinewave.creational.entities.Maze;
import com.sinewave.creational.entities.Room;
import com.sinewave.creational.entities.Wall;

public interface AbstractMazeFactory {
    public Maze makeMaze();
    public Room makeRoom(int roomNumber);
    public Wall makeWall();
    public Door makeDoor(Room A, Room B);
}
