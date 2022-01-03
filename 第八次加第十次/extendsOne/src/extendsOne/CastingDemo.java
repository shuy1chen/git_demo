package extendsOne;

public class CastingDemo {
public static void main(String[] args) {
	Object object1 = new Circle(1," red", false);
	Object object2 = new Rectangle(1,1);
	displayObject(object1);
	displayObject(object2);
}

private static void displayObject(Object object) {
	if(object instanceof Circle) {
		System.out.println("The circle area is "+((Circle)object).getArea());
		System.out.println("The circle diameter is "+((Circle)object).getDianmeter());

		}
	else if(object instanceof Rectangle) {
		System.out.println("The rectangel area is "+((Rectangle)object).getArea());
		}
	}
}
