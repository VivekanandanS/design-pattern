package com.sinewave.creational.abstractfactory;

import com.sinewave.creational.problem.Door;
import com.sinewave.creational.problem.Maze;
import com.sinewave.creational.problem.Room;
import com.sinewave.creational.problem.Wall;

public interface MazeFactory {
    public Maze makeMaze();
    public Wall makeWall();
    public Room makeRoom(int roomNumber);
    public Door makeDoor(Room A, Room B);
}
