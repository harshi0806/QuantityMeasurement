package quantitymeasure;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Objects;

@RunWith(MockitoJUnitRunner.class)
public class QuantityMeasurementTest {

    @Mock
    QuantityMeasurement quantityMeasurement1;
    QuantityMeasurement quantityMeasurement2;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void givenZeroFeetAndZeroFeet_WhenComparedForEquality_ShouldReturnEqual() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
        quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.FEET);
        Assert.assertEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenZeroFeetAndOneFeet_WhenComparedForEquality_ShouldReturnNotEqual() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
        quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
        Assert.assertNotEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenFeet_WhenEqualsToNull_ShouldReturnFalse() {
        quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.FEET);
        boolean nullCheck = Objects.isNull(quantityMeasurement1);
        Assert.assertFalse(nullCheck);
    }

    @Test
    public void givenFeet_WhenNotEqualsToNull_ShouldReturnTrue() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
        boolean nullCheck = Objects.nonNull(quantityMeasurement1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void givenTwoFeet_WhenCheckedForReference_ShouldReturnNotSame() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
        quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
        Assert.assertNotSame(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenFeet_WhenCheckedForReference_ShouldReturnSame() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
        Assert.assertSame(quantityMeasurement1, quantityMeasurement1);
    }

    @Test
    public void givenTwoFeetOfSameType_WhenCheckedForType_ShouldReturnEqual() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
        quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.FEET);
        Assert.assertEquals(QuantityMeasurement.class, quantityMeasurement1.getClass());
        Assert.assertEquals(QuantityMeasurement.class, quantityMeasurement2.getClass());
    }

    @Test
    public void givenTwoFeet_WhenCheckedForValue_ShouldReturnEqual() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.FEET);
        quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.FEET);
        int valueCheck1 = quantityMeasurement1.hashCode();
        int valueCheck2 = quantityMeasurement2.hashCode();
        Assert.assertEquals(valueCheck1, quantityMeasurement1.hashCode());
        Assert.assertEquals(valueCheck2, quantityMeasurement2.hashCode());
    }

    @Test
    public void givenZeroInchAndZeroInch_WhenComparedForEquality_ShouldReturnEqual() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
        quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.INCH);
        Assert.assertEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenZeroInchAndOneInch_WhenComparedForEquality_ShouldReturnNotEqual() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
        quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.INCH);
        Assert.assertNotEquals(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenInch_WhenEqualsToNull_ShouldReturnFalse() {
        quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
        boolean nullCheck = Objects.isNull(quantityMeasurement1);
        Assert.assertFalse(nullCheck);
    }

    @Test
    public void givenInch_WhenNotEqualsToNull_ShouldReturnTrue() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
        boolean nullCheck = Objects.nonNull(quantityMeasurement1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void givenTwoInch_WhenCheckedForReference_ShouldReturnNotSame() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
        quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.INCH);
        Assert.assertNotSame(quantityMeasurement1, quantityMeasurement2);
    }

    @Test
    public void givenInch_WhenCheckedForReference_ShouldReturnSame() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
        Assert.assertSame(quantityMeasurement1, quantityMeasurement1);
    }

    @Test
    public void givenTwoInchOfSameType_WhenCheckedForType_ShouldReturnEqual() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
        quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.INCH);
        Assert.assertEquals(QuantityMeasurement.class, quantityMeasurement1.getClass());
        Assert.assertEquals(QuantityMeasurement.class, quantityMeasurement2.getClass());
    }

    @Test
    public void givenTwoInch_WhenCheckedForSameValue_ShouldReturnEqual() {
        quantityMeasurement1 = new QuantityMeasurement(0.0, Unit.INCH);
        quantityMeasurement2 = new QuantityMeasurement(0.0, Unit.INCH);
        int valueCheck1 = quantityMeasurement1.hashCode();
        int valueCheck2 = quantityMeasurement2.hashCode();
        Assert.assertEquals(valueCheck1, quantityMeasurement1.hashCode());
        Assert.assertEquals(valueCheck2, quantityMeasurement2.hashCode());
    }

    @Test
    public void given1FeetAnd12Inch_WhenComparedForEquality_ShouldReturnTrue() {
        quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.FEET);
        quantityMeasurement2 = new QuantityMeasurement(12.0, Unit.INCH);
        boolean compareLength = quantityMeasurement1.compare(quantityMeasurement2);
        Assert.assertTrue(compareLength);
    }

    @Test
    public void given3FeetAnd1Yard_WhenComparedForEquality_ShouldReturnTrue() {
        quantityMeasurement1 = new QuantityMeasurement(3.0, Unit.FEET);
        quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.YARD);
        boolean compareLength = quantityMeasurement1.compare(quantityMeasurement2);
        Assert.assertTrue(compareLength);
    }

    @Test
    public void given1FeetAnd1Yard_WhenComparedForEquality_ShouldReturnFalse() {
        quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.FEET);
        quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.YARD);
        boolean compareLength = quantityMeasurement1.compare(quantityMeasurement2);
        Assert.assertFalse(compareLength);
    }

    @Test
    public void given1InchAnd1Yard_WhenComparedForEquality_ShouldReturnFalse() {
        quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.INCH);
        quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.YARD);
        boolean compareLength = quantityMeasurement1.compare(quantityMeasurement2);
        Assert.assertFalse(compareLength);
    }

    @Test
    public void given36InchAnd1Yard_WhenComparedForEquality_ShouldReturnTrue() {
        quantityMeasurement1 = new QuantityMeasurement(36.0, Unit.INCH);
        quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.YARD);
        boolean compareLength = quantityMeasurement1.compare(quantityMeasurement2);
        Assert.assertTrue(compareLength);
    }

    @Test
    public void given1YardAnd36Inch_WhenComparedForEquality_ShouldReturnTrue() {
        quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.YARD);
        quantityMeasurement2 = new QuantityMeasurement(36.0, Unit.INCH);
        boolean compareLength = quantityMeasurement1.compare(quantityMeasurement2);
        Assert.assertTrue(compareLength);
    }

    @Test
    public void given1YardAnd3Feet_WhenComparedForEquality_ShouldReturnTrue() {
        quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.YARD);
        quantityMeasurement2 = new QuantityMeasurement(3.0, Unit.FEET);
        boolean compareLength = quantityMeasurement1.compare(quantityMeasurement2);
        Assert.assertTrue(compareLength);
    }

    @Test
    public void given2InchAnd5Centimeter_WhenComparedForEquality_ShouldReturnTrue() {
        quantityMeasurement1 = new QuantityMeasurement(2.0, Unit.INCH);
        quantityMeasurement2 = new QuantityMeasurement(5.0, Unit.CENTIMETER);
        boolean compareLength = quantityMeasurement1.compare(quantityMeasurement2);
        Assert.assertTrue(compareLength);
    }

    @Test
    public void given2InchAnd2Inch_WhenAddedInInches_ShouldReturn4Inch() {
        quantityMeasurement1 = new QuantityMeasurement(2.0, Unit.INCH);
        quantityMeasurement2 = new QuantityMeasurement(2.0, Unit.INCH);
        double resultantQuantity = quantityMeasurement1.add(quantityMeasurement2);
        Assert.assertEquals(4.0, resultantQuantity, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenAddedInInches_ShouldReturn14Inch() {
        quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.FEET);
        quantityMeasurement2 = new QuantityMeasurement(2.0, Unit.INCH);
        double resultantQuantity = quantityMeasurement1.add(quantityMeasurement2);
        Assert.assertEquals(14.0, resultantQuantity, 0.0);
    }

    @Test
    public void given1FeetAnd1Feet_WhenAddedInInches_ShouldReturn24Inch() {
        quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.FEET);
        quantityMeasurement2 = new QuantityMeasurement(1.0, Unit.FEET);
        double resultantQuantity = quantityMeasurement1.add(quantityMeasurement2);
        Assert.assertEquals(24.0, resultantQuantity, 0.0);
    }

    @Test
    public void given2InchAnd2Point5Centimeter_WhenAddedInInches_ShouldReturn3Inch() {
        quantityMeasurement1 = new QuantityMeasurement(2.0, Unit.INCH);
        quantityMeasurement2 = new QuantityMeasurement(2.5, Unit.CENTIMETER);
        double resultantQuantity = quantityMeasurement1.add(quantityMeasurement2);
        Assert.assertEquals(3.0, resultantQuantity, 0.0);
    }

    @Test
    public void given1GallonAnd3Point78Litre_WhenComparedForEquality_ShouldReturnTrue() {
        quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.GALLON);
        quantityMeasurement2 = new QuantityMeasurement(3.78, Unit.LITRE);
        boolean compareLength = quantityMeasurement1.compare(quantityMeasurement2);
        Assert.assertTrue(compareLength);
    }

    @Test
    public void given1LitreAnd1000Millilitre_WhenComparedForEquality_ShouldReturnTrue() {
        quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.LITRE);
        quantityMeasurement2 = new QuantityMeasurement(1000.0, Unit.MILLILITRE);
        boolean compareLength = quantityMeasurement1.compare(quantityMeasurement2);
        Assert.assertTrue(compareLength);
    }

    @Test
    public void given1GallonAnd3Point78Litres_WhenAddedInLitres_ShouldReturn7Point57Litres() {
        quantityMeasurement1 = new QuantityMeasurement(1.0, Unit.GALLON);
        quantityMeasurement2 = new QuantityMeasurement(3.78, Unit.LITRE);
        double resultantQuantity = quantityMeasurement1.add(quantityMeasurement2);
        Assert.assertEquals(7.57, resultantQuantity, 0.1);
    }
}
