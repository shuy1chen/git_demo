package extendsSix;
import java.util.ArrayList;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		int a =10;
		System.out.print("Enter 10 integers: ");
		Scanner input = new Scanner(System.in);
		int value;
		do {
			value = input.nextInt();
			if(!list1.contains(value) && value !=0)
				list1.add(value);
			
		}while(value !=0 );
		for(int i=0 ;i<list1.size();i++) {
			System.out.print(list1.get(i)+" ");
		}
	}
}
