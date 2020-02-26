package com.sinewave.creational.problem;

import com.sinewave.enums.Direction;

public class MazeGame {


    public Maze createMaze() {
        Maze maze = new Maze();
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Door door1 = new Door(room1, room2);
        maze.addRoom(room1);
        maze.addRoom(room1);

        room1.setSide(Direction.NORTH, new Wall());
        room1.setSide(Direction.SOUTH, door1);
        room1.setSide(Direction.EAST, new Wall());
        room1.setSide(Direction.WEST, new Wall());


        room1.setSide(Direction.NORTH, door1);
        room1.setSide(Direction.SOUTH, new Wall());
        room1.setSide(Direction.EAST, new Wall());
        room1.setSide(Direction.WEST, new Wall());

        return maze;
    }


}
