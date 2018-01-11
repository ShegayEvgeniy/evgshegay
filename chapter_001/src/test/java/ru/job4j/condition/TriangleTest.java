package ru.job4j.condition;

//Исправленный вариант задачи

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;


public class TriangleTest {
 @Test
 public void whenAreaSetThreePointsThenTriangleArea() {
 // создаем три объекта класса Point.
 Point a = new Point(1, 1);
 Point b = new Point(3, 3);
 Point c = new Point(5, 1);
 Triangle triangle = new Triangle(a, b, c);
 double result = triangle.area();
 double expected = 3.999;
 assertThat(result, closeTo(expected, 0.01));
 }
 
  

}

