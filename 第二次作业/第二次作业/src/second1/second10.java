package second1;

import java.util.Scanner;

public class second10 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	double x =0,y=0,radius=0;
	double x1=0,y1=0,radius1;
	System.out.print("enter x,y,radius:");
	x = in.nextDouble();
	y = in.nextDouble();
	radius =in.nextDouble();
	System.out.print("enter x,y,radius:");
	x1 = in.nextDouble();
	y1 =in.nextDouble();
	radius1=in.nextDouble();
	double distance = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	if((distance+Math.min(radius1,radius)<=Math.max(radius1, radius))) {
		System.out.println("in");
	}else if(distance<=radius1+radius) {
		System.out.println("overlaps");
	}else {
		System.out.println("no");
	}
}
}
