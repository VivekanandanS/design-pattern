package com.sinewave.creational.builder;

import com.sinewave.creational.entities.Maze;

public class Client {

    public static void main(String[] args) throws Exception {

        MazeGame mazeGame = new MazeGame();
        Maze maze = mazeGame.createMaze(new SimpleMazeBuilder());


    }
}
