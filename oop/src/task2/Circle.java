package task2;

public class Circle {
    int radius;
    String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public void tooString() {
        System.out.println("Радиус: " + radius);
        System.out.println("Цвет: " + color);
        System.out.println("Площадь: " + area());
        System.out.println("Периметр: " + perimeter());
    }

}
