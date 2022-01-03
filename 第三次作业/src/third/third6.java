package third;

import java.util.Scanner;

public class third6 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	int number =in.nextInt();
	//System.out.println(number);
	double total =0;
	int flag =1,i=1;
	for(i=1;i<=number;i++) {
		total +=1.0/(2*i-1)*flag;
		//System.out.println(total);
		flag = -flag;
	}
	System.out.println(4*total);
}
}
