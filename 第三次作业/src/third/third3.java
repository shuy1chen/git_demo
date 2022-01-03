package third;

public class third3 {
public static void main(String[] args) {
	for(int i=1;i<=8;i++) {
		for(int j=8-i;j>=1;j--) {
			System.out.print("  ");
		}
		for(int k=1;k<=i;k++) {
			System.out.printf("%2d",(int)Math.pow(2, k-1));
		}
		System.out.println();
	}
}
}
