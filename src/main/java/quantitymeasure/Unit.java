package quantitymeasure;

public enum Unit {
    FEET(12.0),
    INCH(1.0),
    YARD(36.0),
    CENTIMETER(0.4),
    GALLON(3.78),
    LITRE(1.0),
    MILLILITRE(0.001),
    GRAM(0.001),
    KILOGRAM(1.0),
    TONNE(1000.0),
    FAHRENHEIT(212),
    CELSIUS(100);
    private final double convertToBaseUnit;

    Unit(double convertToBaseUnit) {
        this.convertToBaseUnit = convertToBaseUnit;
    }

    public double convertToBaseUnit(double value) {
        return value * convertToBaseUnit;
    }
}
