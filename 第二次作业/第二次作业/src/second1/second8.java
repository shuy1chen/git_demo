package second1;

import java.util.Scanner;

public class second8 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		double x =0,y=0;
		System.out.print("enter the point with two coordinates:");
		x = in.nextDouble();
		y =in.nextDouble();
		if(y>=0 && y<=100 && x>=0 && x<=200-2*y ) {
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}

		
	}
}
