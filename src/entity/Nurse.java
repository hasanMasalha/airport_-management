package entity;

import java.sql.Date;

public class Nurse {
	private int nurseID;
	private String firstName;
	private String lastName;
	private String vaccinationDate;
	public int getNurseID() { 
		return nurseID;
	}
	public void setNurseID(int nurseID) {
		this.nurseID = nurseID;
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
	public String getVaccinationDate() {
		return vaccinationDate;
	}
	public void setVaccinationDate(String vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}
	public Nurse(int nurseID, String firstName, String lastName, String vaccinationDate) {
		super();
		this.nurseID = nurseID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.vaccinationDate = vaccinationDate;
	}
	
	

}
