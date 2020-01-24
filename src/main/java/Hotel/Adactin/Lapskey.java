package Hotel.Adactin;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Lapskey {
	
public static void main(String[] args) {
	
	TreeMap<String, String> s = new TreeMap<String, String>();
	s.put("karthik", "wipro");
	s.put("prabhu", "accenture");
	s.put("kisore", "home");
	s.put("vinitha", "college");
	Set<String> k = s.keySet();
	System.out.println("key value"+ k);
	Collection<String> v = s.values();
	System.out.println("value"+v);
	Set<Entry<String, String>> all = s.entrySet();
	System.out.println(all);
	for (Entry<String, String> e : all) {
		System.out.println(e);
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		
	}

}

}
