package forth;

import java.util.Scanner;

public class forth2 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int []arr =new int[10];
		int total=0;
		for(int i=0;i<10;i++) {
			int flag=1;
			int m =in.nextInt();
			for(int j=0;j<=i;j++) {
				if(arr[j]==m) {
					flag =0;
				}
			}
			if(flag==1) {
				arr[i]=m;
			}
			
		}
		for(int i=0;i<10;i++) {
			if(arr[i]!=0) {
				total ++;
				System.out.print(arr[i]+" ");
			}
			
		}
		System.out.println();
		System.out.println(total);
	}

}
