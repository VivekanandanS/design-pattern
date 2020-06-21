package com.sinewave.creational.builder;

import com.sinewave.creational.entities.Maze;

public interface MazeBuilder {
    public void buildMaze();

    public void buildRoom(int roomNumber);

    public void buildDoor(int roomA, int roomB) throws Exception;

    public Maze getMaze();
}
