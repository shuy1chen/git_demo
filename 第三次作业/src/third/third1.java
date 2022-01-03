package third;

public class third1 {
	public static void main(String[] args) {
		int now =10000;
		double total =now;
		double s = now;
		for(int i=0;i<9;i++) {
			total =  (total*(1+0.05));
			s+=total;
			if(i==2) {
				System.out.println(s);
			}
		}
		System.out.println(total);
	}
}
