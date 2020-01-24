package Hotel.Adactin;

import java.util.Vector;

public class Random {

	public static void main(String[] args) {

		Vector a=new Vector();
		a.add(100);
		a.add("karthik");
		a.add("nila");
		a.add("prashanth");
		a.add("tomato");
		a.set(3, "manda");
		a.remove("tomato");
		System.out.println(a);
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
		
		for (Object object : a) {
			System.out.println(object);
			
		}
		
			
		
		}

}
