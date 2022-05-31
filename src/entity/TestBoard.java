package entity;

import java.sql.Date;

public class TestBoard {
	private int testBoradID;
	private String date;
	private int hour;
	private int minute; 
	
	public int getTestBoradID() {
		return testBoradID;
	}
	public void setTestBoradID(int testBoradID) {
		this.testBoradID = testBoradID;
	}

	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public TestBoard(int testBoradID, String date, int hour, int minute) {
		super();
		this.testBoradID = testBoradID;
		this.date = date;
		this.hour = hour;
		this.minute = minute;
	}
	
	
	

}
