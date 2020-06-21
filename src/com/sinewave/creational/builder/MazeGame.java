package com.sinewave.creational.builder;

import com.sinewave.creational.entities.Maze;

public class MazeGame {

    public Maze createMaze(MazeBuilder builder) throws Exception {

        // Maze
        builder.buildMaze();

        // Rooms
        builder.buildRoom(1);
        builder.buildRoom(2);

        // Door
        builder.buildDoor(1,3);


        return builder.getMaze();
    }

}
