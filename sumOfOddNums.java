package Day1;

import java.util.Scanner;

public class sumOfOddNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a limit: ");
		int limit = sc.nextInt();
		int sum=0;
		for(int i=1;i<=limit;i++) {
			if(i%2==1) {
				sum=sum+i;
			}
		}
		System.out.println("sum is: "+sum);
	}
}
