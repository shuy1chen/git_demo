package third;

import java.util.Scanner;

public class third9 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	int year=0,day=0;
	String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Satureday","Sunday"};
	int[] bigmonth= {31,29,31,30,31,30,31,31,30,31,30,31};
	int[] smallmonth={31,28,31,30,31,30,31,31,30,31,30,31};
	year = in.nextInt();
	day =in.nextInt()-1;
	if((year%4==0 && year%100!=0)|| (year%100==0 && year %400==0)) {
		for(int i=0;i<12;i++) {
			System.out.println(i+1+" "+week[day]);
			day=(day+bigmonth[i])%7;
		}
	}
	else {
		for(int i=0;i<12;i++) {
			System.out.println(i+1+" "+week[day]);
			day=(day+smallmonth[i])%7;
		}
	}
}
}
