public class square extends Shape {
    public double side1;
    public double side2;
    public double side3;

    @override
    public double getArea() {
        1/4sqrt[(a+b+c)(a+b-c)(a+c-b)(b+c-a)]
        return Math.sqrt((side1 + side2 + side3) * (side1 + side2 - side3) * (side1 - side2 + side3) * (side2 + side3 - side3)) / 4;
    }

    @override
    public double Perimeter() {
        return side1 + side2 + side3;
    }
}