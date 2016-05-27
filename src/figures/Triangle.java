package figures;

/**
 * Фигура - треугольник
 */
public class Triangle extends Figure {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(String.format("Создан треугольник со сторонами %d, %d, %d", a, b, c));
    }

    @Override
    public double getArea() {
        double p = (a + b + c) / 2; //полупериметр
        double geronForm = Math.sqrt(p * (p - a) * (p - b) * (p - c)); //формула Герона для расчета площади треугольника
        System.out.println(String.format("Площадь треугольника равна %.3f", geronForm));
        return geronForm;
    }

    @Override
    public double getPerimetr() {
        double p = a + b + c;
        System.out.println("Периметр треугольника равен " + p);
        return p;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
