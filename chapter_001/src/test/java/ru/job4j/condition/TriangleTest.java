package ru.job4j.condition;

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
 // Создаем объект треугольник и передаем в него объекты точек.
 Triangle triangle = new Triangle(a, b, c);
 // Вычисляем площадь.
 double result = triangle.area();
 // Задаем ожидаемый результат.
 double expected = 3.999;
 //Проверяем результат и ожидаемое значение.
 assertThat(result, closeTo(expected, 0.01));
 }
 
  

}

