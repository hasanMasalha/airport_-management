package entity;

public class Scheduled {
	private int nurseID;
	private int testBoardID;
	
	public int getNurseID() {
		return nurseID; 
	}
	public void setNurseID(int nurseID) {
		this.nurseID = nurseID;
	}
	public int getTestBoardID() {
		return testBoardID;
	}
	public void setTestBoardID(int testBoardID) {
		this.testBoardID = testBoardID;
	}
	
	public Scheduled(int nurseID, int testBoardID) {
		super();
		this.nurseID = nurseID;
		this.testBoardID = testBoardID;
	}
	
	
	
	

}
