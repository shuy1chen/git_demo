package extendsFive;
import java.util.Scanner;
import java.util.ArrayList;
public class Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		System.out.print("please enter a number");
		int number = input.nextInt();
		int cur1=0,cur2=0,max1=0,max2=0,maxi=0,maxj=0;
		int[][] matrix = new int[number][number];
		for(int i=0;i<number;i++) {
			for(int j=0;j<number;j++) {
				int ramdom = Math.random()>=0.5?1:0;
				matrix[i][j]=ramdom;
				
			}
		}
		System.out.println("The random array is");
		for(int i=0;i<number;i++) {
			for(int j=0 ;j<number;j++) {
				System.out.print(matrix[i][j]);
				 cur1 = matrix[i][j]==1?cur1+1:cur1;
				 cur2 = matrix[j][i]==1?cur2+1:cur2;
			}

			list1.add(cur1);
			list2.add(cur2);
			cur1=0;
			cur2=0;
			System.out.println();
			
		}
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)>=max1) 
				max1=list1.get(i);
		}
		System.out.print("The largest row index:");
		for(int i=0;i<list1.size();i++) {
			if(list1.get(i)==max1)
				System.out.print(i);
		}
		System.out.println();
		System.out.print("The largest colum index:");
		for(int i=0;i<list2.size();i++) {
			if(list2.get(i)>=max2) 
				max2=list2.get(i);
		}
		for(int i=0;i<list2.size();i++) {
			if(list2.get(i)==max2)
				System.out.print(i);
		}
		
	}
}
