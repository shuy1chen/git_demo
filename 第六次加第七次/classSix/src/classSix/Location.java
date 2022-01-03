package classSix;

import java.util.Scanner;

public class Location {
	public int row,column;
	public double maxValue;
	public  Location locateLargest(double[][] a) {
		Location location =new Location();
		double max =a[0][0];
		int maxi=0,maxj=0,i=0,j=0;
		for(i=0;i<this.row;i++) {
			for(j=0;j<this.column;j++) {
				if (a[i][j]>=max) {
					max = a[i][j];
					maxi =i;
					maxj =j;
				}
			}
		}
		location.column=maxj;
		location.row=maxi;
		location.maxValue=max;
		
		return location;
		
	}
public static void main(String[] args) {
	int row,column;
	Scanner in =new Scanner(System.in);
	System.out.print("Enter the row and column:");
	row =in.nextInt();
	column=in.nextInt();
	System.out.println("Enter the array:");
	double [][] arr;
	arr = new double[row][column];
	for(int i=0;i<row;i++) {
		for (int j=0;j<column;j++) {
			arr[i][j] = in.nextDouble();
		}
	}
	Location location = new Location();
	location.column=column;
	location.row =row;
	System.out.println(location.locateLargest(arr).maxValue);
	System.out.println(location.locateLargest(arr).row);
	System.out.println(location.locateLargest(arr).column);
	
}
}
