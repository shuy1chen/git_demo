package classFour;

public class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;
	public RegularPolygon() {
		this.n=3;
		this.side = 1;
		this.x=0;
		this.y=0;
	}
	public void setZero(int n,double side) {
		this.n=n;
		this.side =side;
		this.x=0;
		this.y=0;
	}
	public void setXY(int n,double side,double x,double y) { 
		this.n =n;
		this.side =side;
		this.x =x;
		this.y = y;
	}
	public double getPerimeter() {
		return this.side*this.n;
	}
	public double getArea() {
		return this.side*this.side*this.n/(4*Math.tan(Math.PI/this.n));
	}
	public static void main(String[] args) {
		RegularPolygon polygon1 = new RegularPolygon();
		System.out.println(polygon1.getPerimeter());
		System.out.println(polygon1.getArea());
		RegularPolygon polygon2 =new RegularPolygon();
		polygon2.setZero(6,4);
		System.out.println(polygon2.getPerimeter());
		System.out.println(polygon2.getArea());
		RegularPolygon polygon3 =new RegularPolygon();
		polygon3.setXY(10,4,5.6,7.8);
		System.out.println(polygon3.getPerimeter());
		System.out.println(polygon3.getArea());
	}
}
