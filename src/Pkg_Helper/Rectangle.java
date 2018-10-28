package Pkg_Helper;

public class Rectangle extends Shape implements Comparable<Shape>{
	private int iWidth;
	private int iLength;
	
	public Rectangle(int width, int length) {
		iWidth = width;
		iLength = length;
	}

	public int getiWidth() {
		return iWidth;
	}
	//a comment

	public void setiWidth(int width) {
		this.iWidth = width;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int length) {
		this.iLength = length;
	}

	@Override
	public double area() {
		return iWidth *iLength;
	}

	@Override
	public double perimeter() {
		return 2*iWidth + 2*iLength;
	}

	@Override
	public int compareTo(Shape rectangle1) {
		return this.compareTo(rectangle1);
		
	}
}

