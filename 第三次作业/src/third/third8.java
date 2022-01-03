package third;

public class third8 {
public static void main(String[] args) {
	int total =0,s=0;
	for(int i=101;i<=2100;i++) {
		if((i%4==0 && i%100!=0)||(i % 100 ==0 && i%400==0)) {
			System.out.print(i+" ");
			total++;
			s++;
			if(total==10) {
				System.out.println();
				total=0;
			}
			
		}
	}
	System.out.println(s);
}
}
