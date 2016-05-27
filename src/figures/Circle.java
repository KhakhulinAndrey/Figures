package figures;

/**
 * Фигура - Круг
 */
public class Circle extends Figure {

    private int r;

    public Circle(int r) {
        this.r = r;
        System.out.println("Создан круг радиусом " + r);
    }

    @Override
    public double getArea() {
        double a = Math.PI * Math.pow(r, 2);
        System.out.println(String.format("Площадь круга равна %.3f", a));
        return a;
    }

    @Override
    public double getPerimetr() {
        double p = 2 * Math.PI * r;
        System.out.println(String.format("Длина окружности круга равна %.3f", p));
        return p;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
