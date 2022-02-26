package day4;

public class Rectangle extends Shape {
    double height;
    double width;
    double area;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
        this.area = calculateArea();
    }
    @Override
    public double calculateArea() {

        return (height * width)/2;
    }

    @Override
    public int compareTo(Shape s) {
        return Double.compare(this.area, s.calculateArea());
    }
}
