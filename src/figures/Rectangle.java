package figures;

/**
 * Фигура - Прямоугольник
 */
public class Rectangle extends Figure {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println(String.format("Создан прямоугольник со сторонами %d, %d", a, b));
    }


    @Override
    public double getArea() {
        double area = a * b;
        System.out.println("Площадь прямоугольника равна " + area);
        return area;
    }

    @Override
    public double getPerimetr() {
        double p = 2 * (a + b);
        System.out.println("Периметр прямоугольника равен " + p);
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
}
