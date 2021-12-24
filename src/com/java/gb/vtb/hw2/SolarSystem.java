package com.java.gb.vtb.hw2;
// Enum with constructor
// enum could not be a super-class nor extend another class
public enum SolarSystem {
    // each enum's constant is the instance of the class and has own constructor.

    MERCURY(1, 0),
    VENUS(2, 0),
    EARTH(3, 1),
    MARS(4, 2),
    JUPITER(5, 79),
    SATURN(6, 82),
    URANUS(7, 27),
    NEPTUNE(8, 14);


    private Integer placeAfterTheSun;
    private Integer satelliteQuantity;

    SolarSystem(Integer placeAfterTheSun, Integer satelliteQuantity) {
        this.placeAfterTheSun = placeAfterTheSun;
        this.satelliteQuantity = satelliteQuantity;
    }

    @Override
    public String toString() {
        return "The planet \"" + name() + "\" is located in " +
                placeAfterTheSun + " place from the Sun and " +
                " has " + satelliteQuantity + " satellites.";
    }
}
