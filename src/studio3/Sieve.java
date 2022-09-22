package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter n value: ");
		int n = in.nextInt();
		int p;
		boolean[] nValues = new boolean[n+1];
		int index;
		for (index = 2; index < n-1; index++ ) {
		
		}
		for (index = 2; index < n-1; index++) {
			if (index%2 == 0 || index%3 == 0 || index%5 == 0 || index%7 ==0) {
				nValues[index] = false;
			System.out.println(index);
			System.out.println(nValues[index]);}
			else {
				nValues[index]=true;
				System.out.println(index);
				System.out.println(nValues[index]);
			}
		}

	}		
	
}


