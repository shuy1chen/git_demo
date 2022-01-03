package third;

import java.util.Scanner;

public class third7 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	double e = 1;
	double item=1;
	int number =in.nextInt();
	for(int i=1;i<=number;i++) {
		item = item*(1.0/i*1.0);
		e+=item;
	}
	System.out.println(e);
}
}
