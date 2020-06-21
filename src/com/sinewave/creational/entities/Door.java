package com.sinewave.creational.entities;

public class Door implements MapSite {

    private Room room1;
    private Room room2;
    private boolean isOpen;

    public Door(Room A, Room B) {
        this.room1 = A;
        this.room2 = B;
    }

    @Override
    public void enter() {

    }


}
