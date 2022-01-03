package second1;

import java.util.Scanner;

public class second9 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	double x =0,y=0,width=0,height=0;
	double x1=0,y2=0,width2=0,height2=0;
	System.out.print("enter the r1 point with two coordinates,width,and height");
	x = in.nextDouble();
	y =in.nextDouble();
	width =in.nextDouble();
	height =in.nextDouble();
	System.out.print("enter the r2 point with two coordinates,width,and height");
	x1 =in.nextDouble();
	y2 =in.nextDouble();
	width2 =in.nextDouble();
	height2= in.nextDouble();
	double distancex = Math.abs(x1-x);
	double distancey =Math.abs(y2-y);
	if(distancey+Math.min(height2, height)/2<=Math.max(height2, height)/2 && distancex+Math.min(width2, width)/2<=Math.min(height2, height)) {
		System.out.println("in");
	}else if(distancex<=(width+width2)/2 && distancey<=(height+height2)/2) {
		System.out.println("overlap");
	}else {
		System.out.println("not");
	}

	
}
}
