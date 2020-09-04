package quantitymeasure;

public enum Unit {
    FEET(12.0),
    INCH(1.0),
    YARD(36.0),
    CENTIMETER(0.4),
    GALLON(3.78),
    LITER(1);
    private final double convertToBaseUnit;

    Unit(double convertToBaseUnit) {
        this.convertToBaseUnit = convertToBaseUnit;
    }

    public double convertToBaseUnit(double value) {
        return value * convertToBaseUnit;
    }

    public boolean supportAddition() {
        return true;
    }
}
