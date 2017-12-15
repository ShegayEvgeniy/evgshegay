package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Triangle;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.*;
import java.awt.*;

public class TriangleTest {
 @Test
 public void whenAreaSetThreePointsThenTriangleArea() {
 // создаем три объекта класса Point.
 Point a = new Point(0, 0);
 Point b = new Point(0, 2);
 Point c = new Point(2, 0);
 // Создаем объект треугольник и передаем в него объекты точек.
 Triangle triangle = new Triangle(a, b, c);
 // Вычисляем площадь.
 double result = triangle.area();
 // Задаем ожидаемый результат.
 double expected = 2D;
 //Проверяем результат и ожидаемое значение.
 assertThat(result, closeTo(expected, 0.3));
 }
 
  
 @Test
 public void whenDistanceDiffPointsThen10() {
 // создаем два объекта класса Point.
 Point left = new Point(0, 0);
 Point right = new Point(0, 10);
 // Создаем объект треугольник и в качестве точек передает null.
 // так как нам не требуется их участие.
 Triangle triangle = new Triangle(null, null, null);
 
 double rsl = triangle.distance2(left, right);
 
 assertThat(rsl, closeTo(10, 0.01));
 }
}

