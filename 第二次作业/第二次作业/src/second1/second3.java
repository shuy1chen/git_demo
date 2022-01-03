package second1;

import java.util.Scanner;

public class second3 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	double a=0,b=0,c=0;
	a = in.nextDouble();
	b = in.nextDouble();
	c =in.nextDouble();
	if((a+b>c && a+c>b && b+c>a) && a>0 && b>0 && c>0) {
		System.out.println(a+b+c);
	}
	else {
		System.out.println("ÄãÊäÈëÓĞÎó");
	}
}
}
