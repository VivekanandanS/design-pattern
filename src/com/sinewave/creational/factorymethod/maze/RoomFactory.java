package com.sinewave.creational.factorymethod.maze;

import com.sinewave.creational.entities.Room;

public interface RoomFactory {
    public Room doMakeRoom(int roomNumber);
}
