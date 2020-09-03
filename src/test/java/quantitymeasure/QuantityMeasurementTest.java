package quantitymeasure;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Objects;

@RunWith(MockitoJUnitRunner.class)
public class QuantityMeasurementTest {
    
    @Test
    public void givenZeroFeetAndZeroFeet_WhenComparedForEquality_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenZeroFeetAndOneFeet_WhenComparedForEquality_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeet_WhenEqualsToNull_ShouldReturnFalse() {
        Feet feet1 = new Feet(1.0);
        boolean nullCheck = Objects.isNull(feet1);
        Assert.assertFalse(nullCheck);
    }

    @Test
    public void givenFeet_WhenNotEqualsToNull_ShouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        boolean nullCheck = Objects.nonNull(feet1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void givenTwoFeet_WhenCheckedForReference_ShouldReturnNotSame() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotSame(feet1, feet2);
    }

    @Test
    public void givenFeet_WhenCheckedForReference_ShouldReturnSame() {
        Feet feet1 = new Feet(0.0);
        Assert.assertSame(feet1, feet1);
    }

    @Test
    public void givenTwoFeetOfSameType_WhenCheckedForType_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(Feet.class, feet1.getClass());
        Assert.assertEquals(Feet.class, feet2.getClass());
    }

    @Test
    public void givenTwoFeet_WhenCheckedForValue_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        int valueCheck1 = feet1.hashCode();
        int valueCheck2 = feet2.hashCode();
        Assert.assertEquals(valueCheck1, feet1.hashCode());
        Assert.assertEquals(valueCheck2, feet2.hashCode());
    }

    @Test
    public void givenZeroInchAndZeroInch_WhenComparedForEquality_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenZeroInchAndOneInch_WhenComparedForEquality_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInch_WhenEqualsToNull_ShouldReturnFalse() {
        Inch inch1 = new Inch(1.0);
        boolean nullCheck = Objects.isNull(inch1);
        Assert.assertFalse(nullCheck);
    }

    @Test
    public void givenInch_WhenNotEqualsToNull_ShouldReturnTrue() {
        Inch inch1 = new Inch(0.0);
        boolean nullCheck = Objects.nonNull(inch1);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void givenTwoInch_WhenCheckedForReference_ShouldReturnNotSame() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotSame(inch1, inch2);
    }

    @Test
    public void givenInch_WhenCheckedForReference_ShouldReturnSame() {
        Inch inch1 = new Inch(0.0);
        Assert.assertSame(inch1, inch1);
    }

    @Test
    public void givenTwoInchOfSameType_WhenCheckedForType_ShouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(Inch.class, inch1.getClass());
        Assert.assertEquals(Inch.class, inch2.getClass());
    }

    @Test
    public void givenTwoInchOfDifferentType_WhenCheckedForType_ShouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertNotEquals(Feet.class, inch1.getClass());
        Assert.assertNotEquals(Inch.class, feet2.getClass());
    }
}
