package quantitymeasure;

import java.util.Objects;

public class QuantityMeasurement {

    private final double value;
    private final Unit unit;

    public static double compared(double quantity, Unit unit) {
        return quantity * unit.convertToBaseUnit;
    }

    public QuantityMeasurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuantityMeasurement that = (QuantityMeasurement) o;
        return Double.compare(that.value, value) == 0 &&
                unit == that.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }
}
