package Hotel.Adactin;

public class ReverseString {
	
	public static void main(String[] args) {
		String normal,Digits ="",Reverse="";
		normal="834sjkskj";
	System.out.println(normal.length());
	for(int i=8;i>=0;i--) {
		char c =normal.charAt(i);
		if(Character.isDigit(c)) {
			Digits=Digits+c;
		}
		else {
			Reverse=Reverse+c;
			
		}
	}
	System.out.println(Digits);
	System.out.println(Reverse);
}
}