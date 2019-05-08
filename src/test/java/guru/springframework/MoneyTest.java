package guru.springframework;

import org.junit.jupiter.api.Test;

import java.beans.Expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {
    @Test
    void testMultiplication() {
        Money money = Money.dollar(5);
        assertEquals(Money.dollar(10), money.times(2));
        assertEquals(Money.dollar(15), money.times(3));

        money = Money.franc(5);
        assertEquals(Money.franc(10), money.times(2));
        assertEquals(Money.franc(15), money.times(3));
    }

    @Test
    void testEquality() {
        assertEquals(Money.dollar(10), Money.dollar(10));
        assertNotEquals(Money.dollar(5), Money.dollar(15));

        assertEquals(Money.franc(10), Money.franc(10));
        assertNotEquals(Money.franc(10), Money.franc(15));
    }

    @Test
    void testFrancAndDollarNotEquals() {
        assertNotEquals(Money.franc(10), Money.dollar(10));
    }

    @Test
    void testCurrency() {
        assertEquals("USD", Money.dollar(10).currency);
        assertEquals("FRN", Money.franc(10).currency);
    }
}
