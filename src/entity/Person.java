package entity;

public class Person {
	private int personID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String foodPreference;
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFoodPreference() {
		return foodPreference;
	}
	public void setFoodPreference(String foodPreference) {
		this.foodPreference = foodPreference;
	}
	public Person(int personID, String firstName, String lastName, String phoneNumber, String foodPreference) {
		super();
		this.personID = personID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.foodPreference = foodPreference;
	}
	
	

}
