package ru.job4j.condition;

public class Point {

    private int x;
    private int y;
    private static double result;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point a, Point b) {
        int x1 = a.x;
        int x2 = b.x;
        int y1 = b.x;
        int y2 = b.y;
         result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }


    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(5, 5);
        Point c = new Point(0, 0);
        result = c.distanceTo(a, b);
        System.out.println("Координата точки а(x) " + a.x);
        System.out.println("Координата точки a(y) " +  a.y);
        System.out.println("Координата точки  b(x) " +  b.x);
        System.out.println("Координата точки b(y) " + b.y);
        System.out.println("Расстояние между точками a - b равно  " + result);
    }
}
