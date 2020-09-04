package quantitymeasure;

public enum Unit {
    FEET(1.0),
    INCH(12.0);

    double convertToBaseUnit;

    Unit(double convertToBaseUnit) {
        this.convertToBaseUnit = convertToBaseUnit;
    }
}
