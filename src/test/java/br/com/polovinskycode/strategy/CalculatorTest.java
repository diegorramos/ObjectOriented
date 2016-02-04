package br.com.polovinskycode.strategy;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class CalculatorTest {

    private Calculator calc;

    @Test
    public void givenTwoValues_PassingNumberTwoLessThanNumberOne_CalculateTheSubtraction() throws Exception {

        Function function = new Function(new Subtract());
        Long numberOne = 5L;
        Long numberTwo = 15L;
        Long result = function.calc(numberOne, numberTwo);
        assertThat(result, is(10L));
    }

    @Test
    public void givenTwoValues_PassingNumberOneLessThanNumberTwo_CalculateTheSubtraction() throws Exception {

        Function function = new Function(new Subtract());
        Long numberOne = 10L;
        Long numberTwo = 30L;
        Long result = function.calc(numberOne, numberTwo);
        assertThat(result, is(20L));
    }

    @Test
    public void givenTwoValues_PassingNumberNull_ThrowException_CalculateTheSubtraction() throws Exception {

        try {
            Function function = new Function(new Subtract());
            Long numberOne = null;
            Long numberTwo = 30L;
            Long result = function.calc(numberOne, numberTwo);
            fail("Should Throw Exception");
        } catch (Exception e) {
            assertThat(e.getMessage(), containsString("Null attribute"));
        }
    }

    @Test
    public void givenTwoValues_PassingNumberTwoLessThanNumberOne_CalculateTheSum() throws Exception {

        Function function = new Function(new Sum());
        Long numberOne = 5L;
        Long numberTwo = 15L;
        Long result = function.calc(numberOne, numberTwo);
        assertThat(result, is(20L));
    }

    @Test
    public void givenTwoValues_PassingNumberOneLessThanNumberTwo_CalculateTheSum() throws Exception {

        Function function = new Function(new Sum());
        Long numberOne = 10L;
        Long numberTwo = 30L;
        Long result = function.calc(numberOne, numberTwo);
        assertThat(result, is(40L));
    }

    @Test
    public void givenTwoValues_PassingNumberNull_ThrowException_CalculateTheSum() throws Exception {

        try {
            Function function = new Function(new Sum());
            Long numberOne = null;
            Long numberTwo = 30L;
            Long result = function.calc(numberOne, numberTwo);
            fail("Should Throw Exception");
        } catch (Exception e) {
            assertThat(e.getMessage(), containsString("Null attribute"));
        }
    }
}