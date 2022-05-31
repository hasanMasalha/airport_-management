package entity;


public class stayIn {
	private int personID;
	private int hotelID;
	private int roomID;
	private String toDate;
	private String fromDate;
	public int getPersonID() { 
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
	public int getHotelID() {
		return hotelID;
	}
	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}
	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
	
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public stayIn(int personID, int hotelID, int roomID, String toDate,String fromDate) {
		super();
		this.personID = personID;
		this.hotelID = hotelID;
		this.roomID = roomID;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}
	
	
	
	

}
