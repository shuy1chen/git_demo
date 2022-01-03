package forth;

import java.util.Scanner;

public class forth3 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	int arr[] =new int[10];
	for(int i=0;i<10;i++) {
		arr[i]=in.nextInt();
	}
	for(int i=0;i<9;i++) {
		for(int j=0;j<10-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int tmp =arr[j];
				arr[j] = arr[j+1];
				arr[j+1] =tmp;
			}
		}
	}
	for(int i=0;i<10;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
