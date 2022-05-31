package entity;

public class Hotel {
	private int hotelID;
	private String hotelName;
	private String city;
	private int maxCapacity;
	public Hotel(int hotelID, String hotelName, String city, int maxCapacity) {
		super();
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.city = city;
		this.maxCapacity = maxCapacity;
	}
	public int getHotelID() {
		return hotelID;
	}
	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
	
	

}
