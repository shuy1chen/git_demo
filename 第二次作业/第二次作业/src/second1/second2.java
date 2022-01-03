package second1;

import java.util.Scanner;

public class second2 {
public static void main(String[] args) {
	int lottery = (int)(Math.random()*900)+100;
	System.out.print("enter your number");
	Scanner input = new Scanner(System.in);
	int guess = input.nextInt();
	System.out.println(lottery);
	int lottery1 = lottery % 10,guess1 = guess %10,flag = 0,i=0;
	int lottery2 = lottery/10 %10,guess2 = guess/10%10;
	int lottery3 = lottery /100,guess3 = guess /100;
	if (guess==lottery) {
		System.out.println("you win");
	}
	else if (guess1==lottery2 && guess2 == lottery3 && guess3 == lottery1 ||
			guess1 == lottery3&&guess2 == lottery1&&guess3 == lottery2) {
		System.out.println("second");
	}else if(guess1 == lottery1 ||guess1 == lottery2 ||guess1 ==lottery3||
			guess2 == lottery1 ||guess2 == lottery2 ||guess2 ==lottery3||
			guess3 == lottery1 ||guess3 == lottery2 ||guess3 ==lottery3) {
		System.out.println("third");
	}else {
		System.out.println("lost");
	}
	
}
}
