package ReadProperty;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
public static void main(String[] args) throws IOException {
	File loc=new File("C:\\Users\\Admin\\eclipse-workspace\\karthik\\Adactin\\src\\main\\java\\ReadProperty\\Data.property");
	FileInputStream in=new FileInputStream(loc);
	Properties p=new Properties();
	p.load(in);
	System.out.println(p.get("usn"));
	System.out.println(p.get("pass"));
}
}
