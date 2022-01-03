package extendsOne;

public class PolymorphismDemo {
	public static void main(String[] args) {
		displayObject(new Circle(1,"red",false));
		displayObject(new Circle(1,"black",true));
		
	}
	public static void displayObject(GeometricObject object) {
		System.out.println("Color is "+object.getColor());
	}
}
