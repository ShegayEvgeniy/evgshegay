package ru.job4j.condition;


public class Triangle {
   private Point a;
   private Point b;
   private Point c;
   private double summ;
   private double ab;
   private double ac;
   private double bc;
   private  double result = 0.0;


   public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

	
	public double period(double ab, double ac, double bc) {
		
		ab = a.distanceTo(a, b);
		ac = a.distanceTo(a, c);
		bc = a.distanceTo(b, c);
		 summ = (ab + ac + bc) / 2;
		return summ;
    }
	
	public double area() {
       if (exist(ab, ac, bc)) {
           double rsl = -1;
           if (summ > 0) {
               double squareTriangle = Math.sqrt(summ * (summ - ab) * (summ - bc) * (summ - ac));
               result = squareTriangle;
           } else {
               result = rsl;
           }

       }
        return result;
	}

    private boolean exist(double ab, double ac, double bc) {
       boolean test = false;
       ab = a.distanceTo(a, b);
       ac = a.distanceTo(a, c);
       bc = b.distanceTo(b, c);
       summ = (ab + ac + bc) / 2;
       if (ab > 0 || ac > 0 || bc > 0) {
           test = true;
       }
		return test;
	}
	
}