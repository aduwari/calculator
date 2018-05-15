package calculator;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(Parameterized.class)
public class sub {

    Calculator calculator;
    private int intPut;
    private int intPected;

    public sub (int intPut, int intPected){
        this.intPut = intPut;
        this.intPected = intPected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{0, 0}, {1, 0}, {2, 0}, {3, 0}});
    }

    @Before
    public void setup(){
        calculator = new Calculator();
    }
    @Test
    public void testCalculatorExists(){
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }

    @Test
    public void test() {
        assertEquals(intPected, calculator.subtraction(intPut, intPut));
    }

}
