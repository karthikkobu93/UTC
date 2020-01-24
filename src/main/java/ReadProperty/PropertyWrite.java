package ReadProperty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyWrite {
public static void main(String[] args) throws IOException {
	File loc=new File("C:\\Users\\Admin\\eclipse-workspace\\karthik\\Adactin\\src\\main\\java\\ReadProperty\\DataRead.property");
	FileOutputStream out=new FileOutputStream(loc);
	Properties p=new Properties();
	p.setProperty("User", "Karthik Kobu");
	p.setProperty("pass", "89012");
	p.store(out, "New Data");
}
}
