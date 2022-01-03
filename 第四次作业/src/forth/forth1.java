package forth;

import java.util.Scanner;

public class forth1 {
public static void main(String[] args) {
	int[] number =new int [101];
	Scanner in=new Scanner(System.in);
	while(true) {
		int n = in.nextInt();
		if(n==0) {
			break;
		}
		number[n]++;
		
	}
	for(int i=0;i<101;i++) {
		if(number[i]!=0) System.out.println(i+" "+number[i]);
	}
}
}
