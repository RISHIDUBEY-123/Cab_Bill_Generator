package cabtest;

	import java.util.Scanner;

	public class farecalc {
	public double faref(int[] fareArr, int[] baseFare, int index, double tax, int baseDistance) {
		System.out.println("Enter the distance(KM) you want to travel:");
		Scanner scan=new Scanner(System.in);
		int dist=scan.nextInt();
		double amount = 0.00;	
		if(dist >= 0) {
			if(dist > baseDistance) {
				amount = (baseFare[index]+(dist-baseDistance)*fareArr[index]);
				amount = amount+((amount/100)*tax);
			}else {
				amount = (baseFare[index]);
				amount = amount+((amount/100)*tax);
			}		
		}
		return amount;
	}
	}

