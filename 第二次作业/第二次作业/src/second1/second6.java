package second1;

import java.util.Scanner;

public class second6 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	double x =0,y=0;
	System.out.print("enter the point with two coordinates:");
	x = in.nextDouble();
	y =in.nextDouble();
	if(Math.abs(x)<=5&&Math.abs(y)<=2.5 ) {
		System.out.println("yes");
		
	}
	else {
		System.out.println("no");
	}

	
}
}
