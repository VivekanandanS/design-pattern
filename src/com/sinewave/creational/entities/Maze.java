package com.sinewave.creational.entities;

import java.util.ArrayList;

public class Maze {

    private ArrayList<Room> rooms;

    public Maze() {
        this.rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room) {
        this.rooms.add(room);
    }

    public Room findRoom(int roomNo) {
        return rooms.stream().filter(room -> room.getRoomNumber() == roomNo).findFirst().get();
    }
}
