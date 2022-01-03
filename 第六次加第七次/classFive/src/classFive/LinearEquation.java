package classFive;
import java.util.Scanner;
public class LinearEquation {
	
	
	
		private double a,b,c,d,e,f;
		public void setall(double a,double b,double c,double d,double e,double f) {
			this.a=a;
			this.b=b;
			this.c=c;
			this.d=d;
			this.e =e;
			this.f =f;
		}
		public boolean isSolvable() {
			if (this.a*this.d - this.b*this.c !=0) {
				return true;
			}else 
				return	false;
		}
		public double getX() {
			if (isSolvable()) {
				return (this.e*this.d-this.b*this.f)/(this.a*this.d-this.b*this.c);
				
			}
			else {
				return 0;
			}
			
		}
		public double getY() {
			if(isSolvable()) {
				return -1*(this.a*this.f-this.e*this.c)/(this.a*this.d-this.b*this.c);
			}else {
				return 0;
			}
		}
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			LinearEquation linear = new LinearEquation();
			
			System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4:");
			String str = in.nextLine();
			String[] arr =str.split(" ");

			double a =Double.parseDouble(arr[1])-Double.parseDouble(arr[3]);
			double b =Double.parseDouble(arr[0])-Double.parseDouble(arr[2]);
			double c=Double.parseDouble(arr[5])-Double.parseDouble(arr[7]);
			double d =Double.parseDouble(arr[4])-Double.parseDouble(arr[6]);
			double e =a*Double.parseDouble(arr[0])-b*Double.parseDouble(arr[1]);
			double f=c*Double.parseDouble(arr[4])-d*Double.parseDouble(arr[5]);
			linear.setall(a, b, c, d, e, f);
			System.out.println(linear.getX());
			System.out.println(linear.getY());
		}
}



