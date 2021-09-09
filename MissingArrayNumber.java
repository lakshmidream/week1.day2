package week1.day2;

public class MissingArrayNumber {

	public static void main(String[] args) {
		int myarr[]= {1,2,3,6,7,8};
		for (int i = 1; i <= myarr.length; i++) {
			if (myarr[i-1]!=i) {
				System.out.println("The missing numbers in array are " +i );
			}
		}

	}

}
