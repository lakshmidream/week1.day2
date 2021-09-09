package week1.day2;

public class DuplicateinArray {

	public static void main(String[] args) {
		int myarr[]= {1,2,3,4,5,3,5,6,2,7,8, 0,0};
		
		for (int i = 0; i < myarr.length; i++) {
			for (int j = i+1; j < myarr.length; j++) {
				if (myarr[i]==myarr[j]) {
					System.out.println("Duplicate numbers are " +myarr[i] );
				}
			}
			
		}		
				
		}
	}

