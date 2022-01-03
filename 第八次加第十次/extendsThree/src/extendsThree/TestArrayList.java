package extendsThree;
import java.util.ArrayList;
public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<String>cityList = new ArrayList<>();
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		System.out.println("List size?"+cityList.size());
		System.out.println("Is Minami in the list?"+cityList.contains("Miami"));
		System.out.println("The location of Denver in the List?"+cityList.contains("Denver"));
		System.out.println("Is the list empty?"+cityList.isEmpty());
		cityList.add(2,"xian");
		cityList.remove("Miami");
		cityList.remove(1);
		System.out.println(cityList.toString());
		for(int i =cityList.size()-1;i>=0;i--) {
			System.out.print(cityList.get(i)+" ");
		}
		System.out.println();
	//	ArrayList<Circle>list = new ArrayList<>();
	//	list.add(new Circle(2));
		
		
	}
}
