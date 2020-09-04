package quantitymeasure;

public enum Unit {
    FEET(12.0),
    INCH(1.0);

    private final double convertToBaseUnit;

    Unit(double convertToBaseUnit) {
        this.convertToBaseUnit = convertToBaseUnit;
    }

    public double convertToBaseUnit(double value) {
        return value * convertToBaseUnit;
    }
}
