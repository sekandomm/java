package chapter6;

import java.util.Scanner;

public class CountByAnything {
	private static Scanner i;
	public static void main(String[] args) {
		i = new Scanner(System.in);
		System.out.println("What to count by? ");
		int ii = i.nextInt();
		int iii = ii;
		int count = 0;
		for(int num=iii;num <= 500;num+=ii) {
			System.out.print(num+" ");
			if(count>=9) {
				System.out.println("\n");
				count=0;
			}
			count=count+1;
		}
	}

}
