package second1;

import java.util.Random;
import java.util.Scanner;

public class second7 {
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	String[]number = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
	String[]color = {"Clubs","Dimonds","Heart","Spades"};
	Random rand =new Random();
	int x=rand.nextInt(14);
	int y =rand.nextInt(5);
	System.out.println("you pick is "+color[y]+" "+number[x]);
}
}
