package main;

import figures.Circle;
import figures.Figure;
import figures.Rectangle;
import figures.Triangle;

import java.util.HashMap;
import java.util.Map;

/**
 * Реализовать объектную модель на любом языке программирования:
 * Объекты - геометрические фигуры (любые три).  Нужно описать их с точки зрения
 * расчета площади и периметра.
 * Также необходимо предусмотреть  и написать пример их использования в
 * коллекциях, в частности, в ассоциативных массивах.
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, Figure> map = new HashMap<Integer, Figure>();
        map.put(1, new Circle(4));
        map.put(2, new Rectangle(2, 3));
        map.put(3, new Triangle(10, 8, 10));
        System.out.println();

        for (Map.Entry<Integer, Figure> pair : map.entrySet()) {
            pair.getValue().getArea();
            pair.getValue().getPerimetr();
            System.out.println();
        }
    }
}
