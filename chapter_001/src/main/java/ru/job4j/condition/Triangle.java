package ru.job4j.condition;
import java.awt.*;

public class Triangle {
   private Point a;
   private Point b;
   private Point c;
   private Point left;
   private Point right;
   private  double per;
    double area2;

   public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }

    public Triangle(Point left, Point right) {

       this.left = left;
       this .right = right;
    }

    public double distance2(Point left, Point right) {
         int x3 = left.x;
         int y3 = left.y;
         int x4 = right.x;
         int y4 = right.y;

        double result = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

        return result;

    }
	
	public double distance(Point left, Point right) {
    
	int x1 = a.x;
	int y1 = a.y;
	int x2 = b.x;
	int y2 = b.y;

	
	double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	
	return result;
	
	
    }
	
	public double period(double ab, double ac, double bc) {
		
		double result = (ab + ac + bc) / 2;
		 per = result;
         return  result;
    }
	
	public double area() {
        double rsl = -1;
        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = this.period(ab, ac, bc);
            if (this.exist(ab, ac, bc)) {
              double result = Math.sqrt(per * (per - ab) * (per - ac) * (per - bc));
               area2 = result;
            } else {
             return rsl;
            }
            return area2;
	}

    private boolean exist(double ab, double ac, double bc) {
		return true;
	}
	
}