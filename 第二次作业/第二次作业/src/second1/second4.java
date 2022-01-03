package second1;

import java.util.Scanner;

public class second4 {
	public static void main(String[] args) {
		String[] week = {"Satureday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
		//System.out.println(week[0]);
		int h=0,q=0,m=0,k=0,j=0,year=0;
		Scanner in =new Scanner(System.in);
		System.out.print("Enter year");
		year =in.nextInt();
		j =year/100;
		k =year%100;
		
		//System.out.println(j);
		System.out.print("Enter month");
		m = in.nextInt();
		if(m==1 || m==2) {
			m =m+12;
			j =(year-1)/100;
			k =(year-1)%100;
		}
		System.out.print("Enter the day of the month");
		q =in.nextInt();
		h = (q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
		System.out.println("Day of the week is"+week[h]);
		
	}
}
