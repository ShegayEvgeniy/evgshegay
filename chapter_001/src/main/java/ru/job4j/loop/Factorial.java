package ru.job4j.loop;

public class Factorial {
	

	
	public int calc(int n) {
		int fact = 1;
		for (int a = 1; a <= n; a++) {
			
		   fact *= a;
		}
	         return fact;
	}
	
	public int test(int n) {
		int b = 1;

		return (n == 0) ? 1 : n;
		
	}		
}