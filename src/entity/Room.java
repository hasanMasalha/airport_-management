package entity;

public class Room {
	private int roomID;
	private int hotelID;
	public int getRoomID() {
		return roomID;
	}
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	public int getHotelID() {
		return hotelID;
	}
	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}
	public Room(int roomID, int hotelID) {
		super();
		this.roomID = roomID;
		this.hotelID = hotelID;
	}
	
	

}
