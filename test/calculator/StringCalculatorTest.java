package calculator;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import calculator.StringCalculator;

public class StringCalculatorTest {

    StringCalculator cal;

    @Before
    public void setUp() throws Exception {
        cal = new StringCalculator();
    }

    @Test
    public void add_null_or_empty() throws Exception {
        assertThat(cal.add(null), is(0));
        assertThat(cal.add(""), is(0));
    }

    @Test
    public void add_one_number() throws Exception {
        assertThat(cal.add("1"), is(1));
    }

    @Test
    public void add_comma() throws Exception {
        assertThat(cal.add("1,2"), is(3));
    }

    @Test
    public void add_comma_colon() throws Exception {
        assertThat(cal.add("1,2:3"), is(6));
    }

    @Test
    public void add_custom_delemiter() throws Exception {
        assertThat(cal.add("//;\n1;2;3"), is(6));
    }

    @Test(expected = RuntimeException.class)
    public void add_negative() throws Exception {
        cal.add("-1,2,3");
    }

    @After
    public void tearDown() throws Exception {
    }

}
