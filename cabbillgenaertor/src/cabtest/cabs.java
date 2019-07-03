package cabtest;

import java.util.Scanner;

public class cabs extends test {
	
	public int cabfare(String[] ar) {
		String m = null;		
		Scanner scan=new Scanner(System.in);		
		System.out.println(" ********************************Cab Bill Generation*********************************");
		System.out.println("Cabs available:");
		for(int i = 0; i<ar.length; i++) {
			System.out.println((i+1)+")"+ar[i]+"/n");
		}
	    System.out.println("Please select the car");
	    int n=scan.nextInt();
	   return n;   
	}
	
}