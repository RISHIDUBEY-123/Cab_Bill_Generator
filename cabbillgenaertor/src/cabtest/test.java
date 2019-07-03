package cabtest;

public class test {
	static String[] ar= {"Hatchback - 4 seats avilable","Suv - 6 seats avilable","Luxury - 4 seats avilable","Sedan - 4 seats avilable"};
	static int[] baseFare = {25,32,45,34};
	static int[] fareArr = {4,6,9,7};
	static double tax = 2.00;
	static int baseDistance = 4;
	
	public static void main(String[] args) {
		cabs cab=new cabs();
	    int cabType = cab.cabfare(ar);	
		if(cabType  > 0 &&cabType <= ar.length) {
		    farecalc fare=new farecalc();
			double finalfare = fare.faref(fareArr, baseFare, cabType-1, tax, baseDistance);
	
			if(finalfare > 0.00) {
				System.out.println("Estimated fare for this ride is :"+finalfare);
			}else {
				System.out.println("Please enter valid info");
			}
		}else {
			System.out.println("Please enter valid option.");
		}
	}
}