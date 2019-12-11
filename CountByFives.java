package chapter6;

public class CountByFives {

	public static void main(String[] args) {
		for(int num=5;num <= 500;num+=5) {
			System.out.print(num+" ");
			if(num%50==0) {
				System.out.println("\n");
			}
		}
	}

}
