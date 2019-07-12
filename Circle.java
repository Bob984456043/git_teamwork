public class Circle extends Shape {

    private double perimeter;
    private double area;
    public double radius;

    @Override
    public double getArea(){
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
