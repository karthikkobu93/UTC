package Hotel.Adactin;

public class Practise {
	
	public static void main(String[] args) {
		
  String s="karthi24kobu";
//		int b=s.length();
//		System.out.println(b);
//	int x = s.indexOf("i");
//	System.out.println(x);
//	char c = s.charAt(10);
//	System.out.println(c);
//	String up = s.toUpperCase();
//	System.out.println(up);
//	String lo = up.toLowerCase();
//	System.out.println(lo);
//    boolean eq = s.equals(lo);	
//	System.out.println(eq);
//	boolean equalsIgnoreCase = s.equalsIgnoreCase(up);
//	System.out.println(equalsIgnoreCase);
// boolean startsWith = s.startsWith("kar");
// System.out.println(startsWith);
// boolean endsWith = s.endsWith("u");
// System.out.println(endsWith);
//  int lastIndexOf = s.lastIndexOf("k");
//  System.out.println(lastIndexOf);
//   boolean contains = s.contains("24ko");
//   System.out.println(contains);
//   String[] split = s.split("karthi");
//	System.out.println(split);
//	String substring = s.substring(5);
//	System.out.println(substring);
//	CharSequence subSequence = s.subSequence(2, 11);
//	System.out.println(subSequence);
//	boolean empty = s.isEmpty();
//	System.out.println(empty);
//	String s1="      kkk vvv  ";
//	System.out.println(s1);
//	String trim = s1.trim();
//	System.out.println(trim);
//	
//	
//	
//	
//	
	
	
		
		String z="karthi24kobu";
		System.out.println(System.identityHashCode(z));
		System.out.println(System.identityHashCode(s));
	StringBuffer s1 = new StringBuffer("karthik24kobu");
		StringBuffer s2=new StringBuffer("greens");
	System.out.println(System.identityHashCode(s1));
		String con=s.concat(z);
		System.out.println(System.identityHashCode(con));
		System.out.println(con);
		s1.append(s2);
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		byte[] bytes = s.getBytes();
		System.out.println(bytes);
		
		
		
	}

}
