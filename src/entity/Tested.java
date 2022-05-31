package entity;

public class Tested {
	private int personID;
	private int  nurseID;
	private int testBoardID;
	private String testTime;
	private TestResult result;
	
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
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
	public String getTestTime() {
		return testTime;
	}
	public void setTestTime(String testTime) {
		this.testTime = testTime;
	}
	public TestResult getResult() {
		return result;
	}
	public void setResult(TestResult result) {
		this.result = result;
	}
	public Tested(int personID, int nurseID, int testBoardID, String testTime, String result) {
		super();
		this.personID = personID;
		this.nurseID = nurseID;
		this.testBoardID = testBoardID;
		this.testTime = testTime;
		this.result = TestResult.valueOf(result);
	}
	
	
	
	
	
	

}
