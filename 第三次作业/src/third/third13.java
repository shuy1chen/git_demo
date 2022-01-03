package third;

import java.util.Scanner;

public class third13 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		  int i=0,sum=0,number;
		  System.out.print("Enter the first 9 digits of an ISBN an integer:");
		  number = input.nextInt();
		  int[] array = new int[10];
		  for (i=0;i<9;i++) {
			  array[i]=number%10;
			  sum +=(9-i)*array[i];
			  number = number/10;
		  }
		  sum = sum %11;
		  if (sum==10) {
			  for(i=8;i>=0;i--) {
				  System.out.print(array[i]);
			  }
			  System.out.println("x");
		  }
		  else {
			  for(i=8;i>=0;i--) {
				  System.out.print(array[i]);
			  }
			  System.out.println(sum);
		  }
}
}
