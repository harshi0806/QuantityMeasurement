package quantitymeasure;

import java.util.Objects;

public class QuantityMeasurement {

    private final double value;
    private final Unit unit;

    public QuantityMeasurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    public boolean compare(QuantityMeasurement thatUnit) {
        return Double.compare(this.unit.convertToBaseUnit(this.value),
                              thatUnit.unit.convertToBaseUnit(thatUnit.value)) == 0;
    }

    public double add(QuantityMeasurement thatUnit) {
        return this.unit.convertToBaseUnit(this.value) + thatUnit.unit.convertToBaseUnit(thatUnit.value);
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
