package third;

import java.util.Scanner;

public class third15 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	int oo = in.nextInt();
	int[] n = new int [50];
	int k =0;
	while(oo>0) {
		n[k] = oo%8;
		k++;
		oo =oo/8;
	}
	for(int j=k-1;j>=0;j--) {
		System.out.print(n[j]);
	}
}
}
