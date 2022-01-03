package third;

import java.util.Random;

public class third11 {
public static void main(String[] args) {
	Random rand =new Random();
	int x =rand.nextInt(9)+1;
	int y = rand.nextInt(10);
	while(x==y) {
		 y = rand.nextInt(10);
	}

	
	System.out.println(x*10+y);
}
}
