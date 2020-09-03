package quantitymeasure;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Objects;

@RunWith(MockitoJUnitRunner.class)
public class QuantityMeasurementTest {
    
    @Test
    public void givenZeroFeetAndZeroFeet_WhenLengthsCompared_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenZeroFeetAndOneFeet_WhenLengthsCompared_ShouldReturnNotEqual() {
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
}