package com.sinewave.creational.abstractfactory;

import com.sinewave.creational.entities.Door;
import com.sinewave.creational.entities.Maze;
import com.sinewave.creational.entities.Room;
import com.sinewave.enums.Direction;

public class MazeGame {

    public Maze createMaze(MazeFactory factory){
        Maze maze = factory.makeMaze();
        Room A = factory.makeRoom(1);
        Room B = factory.makeRoom(2);
        Door d1 = factory.makeDoor(A,B);

        maze.addRoom(A);
        maze.addRoom(B);

        A.setSide(Direction.NORTH,factory.makeWall());
        A.setSide(Direction.SOUTH,factory.makeWall());
        A.setSide(Direction.EAST,d1);
        A.setSide(Direction.WEST,factory.makeWall());


        A.setSide(Direction.NORTH,factory.makeWall());
        A.setSide(Direction.SOUTH,factory.makeWall());
        A.setSide(Direction.EAST,factory.makeWall());
        A.setSide(Direction.WEST,d1);


        return  maze;

    }
}
