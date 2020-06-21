package com.sinewave.creational.factorymethod.maze;

import com.sinewave.creational.entities.Door;
import com.sinewave.creational.entities.Room;

public interface DoorFactory {
    public Door doMakeDoor(Room A,Room B);
}
