package fifth;

import java.util.Scanner;

public class fifth2 {
    public static void main(String[] args) {
        int[][] num = new int[3][3];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 2);
            }
        }
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 511:");
        int number = input.nextInt();

        String decimalToBinary = Integer.toBinaryString(number);  //��ʮ������ת���ַ���������n=5 ��s = "101"

        char[] stringArray = decimalToBinary.toCharArray();//ת��Ϊ�ַ�����
        char[] hAndT = new char[9];

        for (int i = stringArray.length - 1, j = hAndT.length - 1; i >= 0; i--, j--) {
            hAndT[j] = stringArray[i];//�Ӻ���ǰ��ֵ
            if (hAndT[j] == '1')
                hAndT[j] = 'T';
            else if (hAndT[j]=='0')
                hAndT[j]='H';
        }
        for (int i = 0; i < hAndT.length; i++) {
            if (hAndT[i] == '\u0000') {
                hAndT[i] = 'H';
                //û�б���ֵ�ĵط�Ĭ��Ϊ0
            }
        }

        for (int i = 0; i < hAndT.length; i++) {
            System.out.print(hAndT[i] + " ");
            if ((i+1)%3==0)
                System.out.print("\n");
        }
    }

}

