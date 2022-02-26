package day4;

public class Square extends Shape {
    double height;
    double width;
    double area;

    public Square(double height, double width){
        this.height = height;
        this.width = width;
        this.area = calculateArea();
    }


    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public int compareTo(Shape s) {
        return Double.compare(this.area, s.calculateArea());
    }
}
