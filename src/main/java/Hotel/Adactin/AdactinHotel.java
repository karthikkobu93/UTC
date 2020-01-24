package Hotel.Adactin;

public class AdactinHotel extends BaseClass {
	public static void main(String[] args) {
		Launch("https://www.adactin.com/HotelApp/");

		AdactinPOJO a = new AdactinPOJO();
		Send(a.getUserName(), "sharms24");
		Send(a.getPassword(), "hareram");
		btnclk(a.getLogin());
		
		POJO2 b= new POJO2();
		dropDown(b.getLocation(), 3);
		dropDown(b.getHotels(), 2);
		dropDown(b.getRoom(), 3);
		
	}
}
