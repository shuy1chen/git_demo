package third;

import java.util.Scanner;

public class third16 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	double[] num = new double[10];
	double average =0;
	double sum1 =0;
	for(int i=0;i<=9;i++) {
		num[i] =in.nextDouble();
		sum1+=num[i];
	}
	average =sum1/10;
	sum1 =0;
	for(int i=0;i<=9;i++) {
		sum1 +=(num[i]-average)*(num[i]-average);
	}
	System.out.println(average);
	System.out.println((Math.sqrt(sum1/10)));
	
}
}
