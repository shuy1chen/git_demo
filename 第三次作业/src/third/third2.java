package third;

import java.util.Scanner;

public class third2 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.print("enter the number of the lines:");
	int n =in.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=n-i;j>=1;j--) {
			System.out.print(" ");
		}
		for(int k=i;k>=1;k--) {
			System.out.print(k);
		}
		if(i>=2) {
			for(int m=2;m<=i;m++) {
				System.out.print(m);
			}
		}
		System.out.println();
		
	}
}
}
