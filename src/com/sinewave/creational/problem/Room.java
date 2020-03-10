package com.sinewave.creational.problem;

import com.sinewave.enums.*;

import java.util.HashMap;

public class Room implements MapSite {

    private int roomNumber;
    private HashMap<Direction, MapSite> sides;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.sides = new HashMap<Direction, MapSite>();
    }

    @Override
    public void enter() {

    }

    public void setSide(Direction direction, MapSite site) {
        this.sides.put(direction, site);
    }

    public MapSite getSide(Direction direction) {
        return sides.get(direction);
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
