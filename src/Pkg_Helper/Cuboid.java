package Pkg_Helper;

import java.util.Comparator;
public class Cuboid extends Rectangle implements Comparable<Shape>{
	private int iDepth;
	
	
	public Cuboid(int width, int length,int depth) {
		super(width, length);
		this.iDepth = depth;
	}
	public int getiDepth() {
		return iDepth;
	}
	public void setiDepth(int depth) {
		this.iDepth = depth;
	}
	public double volume() {
		return super.getiLength()*super.getiWidth()*iDepth;
	}
	@Override
	public double area() {
		
		return 2*(super.getiLength()*super.getiWidth()+super.getiLength()*iDepth + super.getiWidth()*iDepth);
	}
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int compareTo(Shape cuboid1) {
		return this.compareTo(cuboid1);
	
	}
	static class SortByArea implements Comparator<Cuboid>{
		@Override
		public int compare(Cuboid c1, Cuboid c2) {
			return (int) c1.area()- (int)c2.area();
		}

		
	}
	static class SortByVolume implements Comparator<Cuboid>{
		@Override
		public int compare(Cuboid c1,Cuboid c2) {
			return (int) (c1.volume()-c2.volume());
			
		}
	}
}
	
	

