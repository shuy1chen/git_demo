package second1;

import java.util.Scanner;

public class second5 {
	public static void main(String[] args) {
		double x=0,y=0;
		Scanner in =new Scanner(System.in);
		
		System.out.print("enter the point with two coordinates:");
		x = in.nextDouble();
		y =in.nextDouble();
		if(x*x+y*y<=100) {
			System.out.println("point"+Double.toString(x)+Double.toString(y)+"is in the circle");
		}
		else {
			System.out.println("point"+Double.toString(x)+Double.toString(y)+"is not in the circle");
		}
	}




}
