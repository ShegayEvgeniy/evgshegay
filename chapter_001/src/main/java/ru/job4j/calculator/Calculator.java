package ru.job4j.calculator;

public class Calculator {
    private double result;
    
    public void addPlus(double first, double second) {
        this.result = first + second;
    }
	
	public void addMinuse(double first, double second) {
        this.result = first - second;
    }
	
	public void addMultiplication(double first, double second) {
        this.result = first * second;
    }
	
	public void addDivision(double first, double second) {
        this.result = first / second;
    }
    
    public double getResult() {
        return this.result;
    }
}