package Houmwork.CubZeleniy.model;

public class CubeInfo {
    // Fids
    private double a;
    // private double Ribs;
    // private double Perimeter;

    // Конструктор
    public CubeInfo(double a) {
        this.a = a;
    }

    // расчёт периметра
    // у куба 12 рёбер
    public double sumPerimeter() {
        return 12 * a;
    }

    // Расчёт площади.
    // У куба 6 сторон
    public double sumArea() {
        return 6 * a * a;
    }

    // Расчёт объёма
    public double sumVolume() {
        return a * a * a;
    }
}
