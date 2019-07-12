public class square extends Shape{
	public double lengthofside;
	private double Perimeter;
                private double area;
	@override
	public double getArea() {
		return lengthofside*lengthofside;
	}
	@override
	public double Perimeter(){
		return lengthofside*4;
	}
}