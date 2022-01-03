package third;

public class third12 {
public static void main(String[] args) {
	int total =0;
	for(int i =1;i<=10000;i++) {
		for(int j=1;j<=i;j++) {
			//System.out.println(j);
			if(i%j==0) {
				total +=j;
				
				//System.out.println(total);
			}
		}
		if(total==i*2) {
			System.out.println(i);
		}
		total =0;
	}
}
}
