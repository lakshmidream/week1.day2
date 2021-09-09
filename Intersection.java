package week1.day2;

public class Intersection {

	public static void main(String[] args) {
		int myarr1[]= {1,2,3,4,6,7,8};
		int myarr2[]= {1,2,3,5,8};
		for (int i = 0; i < myarr1.length; i++) {
			for (int j = 0; j < myarr2.length; j++) {
				if (myarr1[i]==myarr2[j]) {
				System.out.println("The intersection of two arrays" + myarr1[i] );	
				}
			}
			
		}

	}

}
