package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int original=454;
		int temp =454;
		int reminder;
		int quitient;
		int reverse=0;
		
		while(temp!=0) {
			reminder=temp%10;
			quitient=temp/10;
			temp=quitient;
			reverse=reverse*10+reminder;
			
		}
		System.out.println("The reverse of the input number " +reverse);
		if (original==reverse) {
			System.out.println("The input number is a palindrome");
		}
	}

}
