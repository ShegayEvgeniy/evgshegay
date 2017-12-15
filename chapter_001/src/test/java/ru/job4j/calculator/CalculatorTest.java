package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.addPlus(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	
	public void whenAddOneMinusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.addMinuse(1D, 1D);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }
	
	
    public void whenAddOneMultiplicationOneThenTwo() {
        Calculator calc = new Calculator();
        calc.addMultiplication(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
	
	public void whenAddOneDivisionOneThenTwo() {
        Calculator calc = new Calculator();
        calc.addDivision(1D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
}
	