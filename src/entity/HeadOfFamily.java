package entity;

public class HeadOfFamily {
	private String email;
	private String city;
	private String Kopa;
	private int ID;
	private String firstName;
	private String lastName;
	private int phone;
	private String FoodPreference;
	public HeadOfFamily(String email, String city, String kopa, int iD, String firstName, String lastName,
			int phone, String foodPreference) {
		this.email = email;
		this.city = city;
		this.Kopa = kopa;
		this.ID = iD;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.FoodPreference = foodPreference;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getKopa() {
		return Kopa;
	}
	public void setKopa(String kopa) {
		Kopa = kopa;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getFoodPreference() {
		return FoodPreference;
	}
	public void setFoodPreference(String foodPreference) {
		FoodPreference = foodPreference;
	}
	


	
	
	

}
