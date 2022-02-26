package day4;

public class Circle extends Shape {
    final double pi = 3.14;
    double r;
    double area;

    public Circle(double pi, double r){
        this.r = r;
        area = calculateArea();
    }
    @Override
    public double calculateArea() {
        return pi * r * r;
    }

    @Override
    public int compareTo(Shape s) {
        return Double.compare(this.area, s.calculateArea());
    }
}
