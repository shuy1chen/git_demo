package extendsSeven;
import java.util.*;
public class Task3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of points");
		int number =input.nextInt();
		input.nextLine();
		System.out.println("Enter the coordinates of the points:");
		String tmp = input.nextLine();
		String[] string=tmp.split(" +");
		Double[] nums = new Double[(string.length)+2];
		Double sum=(double) 0;
		System.out.println(tmp);
		for (int i=0;i<string.length;i++) {
			nums[i]=Double.parseDouble(string[i]);
			//System.out.print(nums[i]+" ");
		}
		//System.out.println();
;
		//System.out.println(nums[string.length]);
		//System.out.print(nums[string.length+1]);
		
		

		nums[string.length]=nums[0];
		nums[string.length+1]=nums[1];
		for(int i=0;i<string.length-1;i=i+2) {
			sum+=Math.abs((nums[i]*nums[i+3]-nums[i+2]*nums[i+1]));
		}
		System.out.println("The total area is:"+0.5*sum);
		
	}
}
