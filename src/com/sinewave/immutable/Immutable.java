package com.sinewave.immutable;

/**
 * Simple Immutable class
 */
public class Immutable {

    /**
     * Immutable fields
     */
    private final String firstName;
    private final String lastName;

    public Immutable(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     *
     * Removed setter, so that fields are populated only during the object
     * initialization
     *
     */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
