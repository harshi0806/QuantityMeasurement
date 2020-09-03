package quantitymeasure;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Objects;

@RunWith(MockitoJUnitRunner.class)
public class QuantityMeasurementTest {

    @Mock
    LengthConverter lengthConverter1;
    LengthConverter lengthConverter2;

    @Test
    public void givenZeroFeetAndZeroFeet_WhenComparedForEquality_ShouldReturnEqual() {
        lengthConverter1 = new LengthConverter(0.0, Unit.FEET);
        lengthConverter2 = new LengthConverter(0.0, Unit.FEET);
        Assert.assertEquals(lengthConverter1, lengthConverter2);
    }

    @Test
    public void givenZeroFeetAndOneFeet_WhenComparedForEquality_ShouldReturnNotEqual() {
        lengthConverter1 = new LengthConverter(0.0, Unit.FEET);
        lengthConverter2 = new LengthConverter(1.0, Unit.FEET);
        Assert.assertNotEquals(lengthConverter1, lengthConverter2);
    }

    @Test
    public void givenFeet_WhenEqualsToNull_ShouldReturnFalse() {
        lengthConverter1 = new LengthConverter(1.0, Unit.FEET);
        boolean nullCheck = Objects.isNull(lengthConverter1);
        Assert.assertFalse(nullCheck);
    }

    @Test
    public void givenFeet_WhenNotEqualsToNull_ShouldReturnTrue() {
        lengthConverter1 = new LengthConverter(0.0, Unit.FEET);
        boolean nullCheck = Objects.nonNull(lengthConverter1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void givenTwoFeet_WhenCheckedForReference_ShouldReturnNotSame() {
        lengthConverter1 = new LengthConverter(0.0, Unit.FEET);
        lengthConverter2 = new LengthConverter(1.0, Unit.FEET);
        Assert.assertNotSame(lengthConverter1, lengthConverter2);
    }

    @Test
    public void givenFeet_WhenCheckedForReference_ShouldReturnSame() {
        lengthConverter1 = new LengthConverter(0.0, Unit.FEET);
        Assert.assertSame(lengthConverter1, lengthConverter1);
    }

    @Test
    public void givenTwoFeetOfSameType_WhenCheckedForType_ShouldReturnEqual() {
        lengthConverter1 = new LengthConverter(0.0, Unit.FEET);
        lengthConverter2 = new LengthConverter(0.0, Unit.FEET);
        Assert.assertEquals(LengthConverter.class, lengthConverter1.getClass());
        Assert.assertEquals(LengthConverter.class, lengthConverter2.getClass());
    }

    @Test
    public void givenTwoFeet_WhenCheckedForValue_ShouldReturnEqual() {
        lengthConverter1 = new LengthConverter(0.0, Unit.FEET);
        lengthConverter2 = new LengthConverter(0.0, Unit.FEET);
        int valueCheck1 = lengthConverter1.hashCode();
        int valueCheck2 = lengthConverter2.hashCode();
        Assert.assertEquals(valueCheck1, lengthConverter1.hashCode());
        Assert.assertEquals(valueCheck2, lengthConverter2.hashCode());
    }

    @Test
    public void givenZeroInchAndZeroInch_WhenComparedForEquality_ShouldReturnEqual() {
        lengthConverter1 = new LengthConverter(0.0, Unit.INCH);
        lengthConverter2 = new LengthConverter(0.0, Unit.INCH);
        Assert.assertEquals(lengthConverter1, lengthConverter2);
    }

    @Test
    public void givenZeroInchAndOneInch_WhenComparedForEquality_ShouldReturnNotEqual() {
        lengthConverter1 = new LengthConverter(0.0, Unit.INCH);
        lengthConverter2 = new LengthConverter(1.0, Unit.INCH);
        Assert.assertNotEquals(lengthConverter1, lengthConverter2);
    }

    @Test
    public void givenInch_WhenEqualsToNull_ShouldReturnFalse() {
        lengthConverter1 = new LengthConverter(1.0, Unit.INCH);
        boolean nullCheck = Objects.isNull(lengthConverter1);
        Assert.assertFalse(nullCheck);
    }

    @Test
    public void givenInch_WhenNotEqualsToNull_ShouldReturnTrue() {
        lengthConverter1 = new LengthConverter(0.0, Unit.INCH);
        boolean nullCheck = Objects.nonNull(lengthConverter1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void givenTwoInch_WhenCheckedForReference_ShouldReturnNotSame() {
        lengthConverter1 = new LengthConverter(0.0, Unit.INCH);
        lengthConverter2 = new LengthConverter(1.0, Unit.INCH);
        Assert.assertNotSame(lengthConverter1, lengthConverter2);
    }

    @Test
    public void givenInch_WhenCheckedForReference_ShouldReturnSame() {
        lengthConverter1 = new LengthConverter(0.0, Unit.INCH);
        Assert.assertSame(lengthConverter1, lengthConverter1);
    }

    @Test
    public void givenTwoInchOfSameType_WhenCheckedForType_ShouldReturnEqual() {
        lengthConverter1 = new LengthConverter(0.0, Unit.INCH);
        lengthConverter2 = new LengthConverter(0.0, Unit.INCH);
        Assert.assertEquals(LengthConverter.class, lengthConverter1.getClass());
        Assert.assertEquals(LengthConverter.class, lengthConverter2.getClass());
    }

    @Test
    public void givenTwoInch_WhenCheckedForSameValue_ShouldReturnEqual() {
        lengthConverter1 = new LengthConverter(0.0, Unit.INCH);
        lengthConverter2 = new LengthConverter(0.0, Unit.INCH);
        int valueCheck1 = lengthConverter1.hashCode();
        int valueCheck2 = lengthConverter2.hashCode();
        Assert.assertEquals(valueCheck1, lengthConverter1.hashCode());
        Assert.assertEquals(valueCheck2, lengthConverter2.hashCode());
    }

    @Test
    public void given1Feet_WhenConvertedToInches_ShouldReturnEqualLengths() {
        double inches = LengthConverter.toLength(1.0, Unit.INCH);
        Assert.assertEquals(12.0, inches, 0.0);
    }
}
