package third;

import java.util.Scanner;

public class third10 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int year=0,day=0;
		String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Satureday","Sunday"};
		int[] bigmonth= {31,29,31,30,31,30,31,31,30,31,30,31};
		int[] smallmonth={31,28,31,30,31,30,31,31,30,31,30,31};
		int[] days= new int[40];
		for(int j=0;j<=39;j++) {
			days[j]=0;
		}
		int k=0,m=0;
		year = in.nextInt();
		day =in.nextInt()-1;
		if((year%4==0 && year%100!=0)|| (year%100==0 && year %400==0)) {
			for(int i=0;i<12;i++) {
				m=day+1;
				System.out.println(i+1);
				for(k=1;k<=bigmonth[i];k++) {
					days[m]=k;
					m++;
				}
				for(int j=0;j<40;j++) {
					
					if(days[j]==0) {
						System.out.print("   ");
					}else if(days[j]!=0){
						System.out.printf("%3d",days[j]);
					}
					if(j%7==6) {
						System.out.println();
					}
				
				}
				System.out.println();
				for(int j=0;j<40;j++) {
					days[j]=0;
				}
				day=(day+bigmonth[i])%7;
			
			}
		}
		else {
			for(int i=0;i<12;i++) {
				m=day+1;
				System.out.println(i+1);
				for(k=1;k<=smallmonth[i];k++) {
					days[m]=k;
					m++;
				}
				for(int j=0;j<40;j++) {
					
					if(days[j]==0) {
						System.out.print("   ");
					}else if(days[j]!=0){
						System.out.printf("%3d",days[j]);
					}
					if(j%7==6) {
						System.out.println();
					}
				
				}
				System.out.println();
				for(int j=0;j<40;j++) {
					days[j]=0;
				}
				day=(day+smallmonth[i])%7;
			
			}
		}
	}

}
