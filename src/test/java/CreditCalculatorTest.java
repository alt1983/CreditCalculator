import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CreditCalculatorTest {


    @org.junit.jupiter.api.Test
    public void testConcat_getMonthPayment_validArgument_success() {
        final Integer monthPayment = 110;
        CreditCalculator calculator = new CreditCalculator();
        final Integer res = calculator.getMonthPayment(1000,12,10);
        Assertions.assertEquals(monthPayment, res);
    }

    @Test
    public void testConcat_getMonthPayment_validType_success() {
        final Integer monthPayment = 0;
        CreditCalculator calculator = new CreditCalculator();
        Assertions.assertEquals(monthPayment.getClass(), calculator.getMonthPayment(0,0,0).getClass());

    }

    @org.junit.jupiter.api.Test
    public void testConcat_getMonthPayment_nullArgument_throwsException() {
        CreditCalculator calculator = new CreditCalculator();
        assertThrows(NullPointerException.class, () -> {
            calculator.getMonthPayment(null,null,null);
        });
    }

    @org.junit.jupiter.api.Test
    public void testConcat_getFullSumm_validArgument_success() {
        final int fullSumm = 1100;
        CreditCalculator calculator = new CreditCalculator();
        final int res = calculator.getFullSumm(1000,12,10);
        Assertions.assertEquals(fullSumm, res);
    }

    @Test
    public void testConcat_getFullSumm_validType_success() {
        final Integer fullSumm = 0;
        CreditCalculator calculator = new CreditCalculator();
        Assertions.assertEquals(fullSumm.getClass(), calculator.getFullSumm(0,0,0).getClass());

    }

    @org.junit.jupiter.api.Test
    public void testConcat_getFullSumm_nullArgument_throwsException() {
        CreditCalculator calculator = new CreditCalculator();
        assertThrows(NullPointerException.class, () -> {
            calculator.getFullSumm(null,null,null);
        });
    }

    @org.junit.jupiter.api.Test
    public void testConcat_getOverPayment_validArgument_success() {
        final int overPayment = 100;
        CreditCalculator calculator = new CreditCalculator();
        final int res = calculator.getOverPayment(1000,12,10);
        Assertions.assertEquals(overPayment, res);
    }

    @Test
    public void testConcat_getOverPayment_validType_success() {
        final Integer overPayment = 0;
        CreditCalculator calculator = new CreditCalculator();
        Assertions.assertEquals(overPayment.getClass(), calculator.getOverPayment(0,0,0).getClass());

    }

    @org.junit.jupiter.api.Test
    public void testConcat_getOverPayment_nullArgument_throwsException() {
        CreditCalculator calculator = new CreditCalculator();
        assertThrows(NullPointerException.class, () -> {
            calculator.getOverPayment(null,null,null);
        });
    }




}