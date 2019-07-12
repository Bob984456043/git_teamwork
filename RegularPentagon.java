public class RegularPentagon extends Shape{
    private double edge;

    public RegularPentagon(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return 5*Math.pow(edge,2)/(4*Math.tan(36*Math.PI/180));
    }

    @Override
    public double getPerimeter() {
        return 5*edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }
}
