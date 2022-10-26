package org.launchcode.enumerableplanets.controllers.data;

public enum Planets {
    MERCURY("Mercury", 88, "ROMAN GOD OF SPEED"),
    VENUS("Venus", 225, "ROMAN GODDESS OF LOVE"),
    EARTH("Earth", 365, "VARIATION OF 'THE GROUND' IN MANY LANGUAGES"),
    MARS("Mars", 687, "ROMAN GOD OF WAR"),
    JUPITER("Jupiter", 4333, "KING OF THE ROMAN GODS"),
    SATURN("Saturn", 10759, "FATHER OF JUPITER"),
    URANUS("Uranus", 30687, "GREEK GOD OF THE SKY"),
    NEPTUNE("Neptune", 60200, "ROMAN GOD OF THE SEA");

    private final String name;
    private final int yearLength;

    private final String namesake;
    Planets(String name, int yearLength, String namesake) {
        this.name = name;
        this.yearLength = yearLength;
        this.namesake = namesake;

    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public String getNamesake() {
        return namesake;
    }
}
