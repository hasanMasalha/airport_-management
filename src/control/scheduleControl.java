package control;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


import entity.Consts;

import entity.HeadOfFamily;
import entity.Hotel;
import entity.Nurse;
import entity.Room;
import entity.Scheduled;
import entity.TestBoard;
import entity.Tested;
import entity.isRelated;
import entity.stayIn;

 




public class scheduleControl {
	String databaseURL = "jdbc:ucanaccess://Data/data2.accdb";

	private static scheduleControl _instance;

	private scheduleControl() {
	} 
 
	public static scheduleControl getInstance() {
		if (_instance == null) 
			_instance = new scheduleControl(); 
		return _instance;
	} 
  
	 
	public ArrayList<HeadOfFamily> getHeads(){ 
		ArrayList<HeadOfFamily> heads = new ArrayList<HeadOfFamily>();
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			try (Connection conn = DriverManager.getConnection(Consts.CONN_STR);
					PreparedStatement stmt = conn.prepareStatement(Consts.SQL_SEL_HEAD);
					ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int i = 2; 
					heads.add(new HeadOfFamily(rs.getString(i++), rs.getString(i++), rs.getString(i++),
							rs.getInt(i++), rs.getString(i++), rs.getString(i++), rs.getInt(i++)
							, rs.getString(i++)));
				}
				
					
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
				
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return heads;
	}
	public ArrayList<Hotel> getHotels(){ 
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			try (Connection conn = DriverManager.getConnection(Consts.CONN_STR);
					PreparedStatement stmt = conn.prepareStatement(Consts.SQL_SEL_HOTELS);
					ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int i = 2;
					hotels.add(new Hotel(rs.getInt(i++), rs.getString(i++), rs.getString(i++),rs.getInt(i++)));
				}
				
					
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
				
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return hotels;
	}
	public ArrayList<isRelated> getRelated(){ 
		ArrayList<isRelated> relateds = new ArrayList<isRelated>();
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			try (Connection conn = DriverManager.getConnection(Consts.CONN_STR);
					PreparedStatement stmt = conn.prepareStatement(Consts.SQL_SEL_RELATED);
					ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int i = 2;
					relateds.add(new isRelated(rs.getInt(i++),rs.getInt(i++),rs.getString(i++)));
					}
				
					
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
				
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return relateds;
	}
	public ArrayList<Nurse> getNurses(){ 
		ArrayList<Nurse> Nurses = new ArrayList<Nurse>();
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			try (Connection conn = DriverManager.getConnection(Consts.CONN_STR);
					PreparedStatement stmt = conn.prepareStatement(Consts.SQL_SEL_NURSES);
					ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int i = 2;
					Nurses.add(new Nurse(rs.getInt(i++), rs.getString(i++),rs.getString(i++),rs.getString(i++)));
					}
				
					
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
				
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return Nurses;
	}
	public ArrayList<Room> getRooms(){ 
		ArrayList<Room> Rooms = new ArrayList<Room>();
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			try (Connection conn = DriverManager.getConnection(Consts.CONN_STR);
					PreparedStatement stmt = conn.prepareStatement(Consts.SQL_SEL_ROOMS);
					ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int i = 2;
					Rooms.add(new Room(rs.getInt(i++), rs.getInt(i++)));
					}
				
					
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
				
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return Rooms;
	}
	public ArrayList<Scheduled> getScheduleds(){ 
		ArrayList<Scheduled> Scheduleds = new ArrayList<Scheduled>();
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			try (Connection conn = DriverManager.getConnection(Consts.CONN_STR);
					PreparedStatement stmt = conn.prepareStatement(Consts.SQL_SEL_Scheduleds);
					ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int i = 2;
					Scheduleds.add(new Scheduled(rs.getInt(i++), rs.getInt(i++)));
					}
				
					
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
				
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return Scheduleds;
	}
	public ArrayList<stayIn> getStayIns(){ 
		ArrayList<stayIn> stayIns = new ArrayList<stayIn>();
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			try (Connection conn = DriverManager.getConnection(Consts.CONN_STR);
					PreparedStatement stmt = conn.prepareStatement(Consts.SQL_SEL_StayIns);
					ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int i = 2;
					stayIns.add(new stayIn(rs.getInt(i++), rs.getInt(i++), rs.getInt(i++),rs.getString(i++), rs.getString(i++)) );
					}
				
					
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
				
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return stayIns;
	}
	public ArrayList<TestBoard> getTests(){ 
		ArrayList<TestBoard> TestBoards = new ArrayList<TestBoard>();
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			try (Connection conn = DriverManager.getConnection(Consts.CONN_STR);
					PreparedStatement stmt = conn.prepareStatement(Consts.SQL_SEL_Tests);
					ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int i = 2;
					TestBoards.add(new TestBoard(rs.getInt(i++), rs.getString(i++), rs.getInt(i++),rs.getInt(i++)));
					}
			
					
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
				
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return TestBoards;
	}
	public ArrayList<Tested> getTested(){ 
		ArrayList<Tested> Testeds = new ArrayList<Tested>();
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			try (Connection conn = DriverManager.getConnection(Consts.CONN_STR);
					PreparedStatement stmt = conn.prepareStatement(Consts.SQL_SEL_Tested);
					ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int i = 2;
					Testeds.add(new Tested(rs.getInt(i++), rs.getInt(i++), rs.getInt(i++),rs.getString(i++),rs.getString(i++)));
					}
				
					
			} catch (SQLException e) {
				e.printStackTrace(); 
			}
				
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return Testeds;
	}
	public boolean addNurse(String first,String last,String id,String date){
		try (Connection connection = DriverManager.getConnection(databaseURL)) {
			String sql =
					"INSERT INTO Nurse (NurseID,FirstName,LastName,VaccinationDate) VALUES (?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,Integer.parseInt(id));
			preparedStatement.setString(2, first);
			preparedStatement.setString(3, last);
			preparedStatement.setString(4, date);

			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				System.out.println("A row has been inserted successfully.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	public boolean addHeadOfFamily(String email,String city,String k,String id,String first,String last,String phone,String food){
		try (Connection connection = DriverManager.getConnection(databaseURL)) {
			String sql =
					"INSERT INTO HeadOfFamily (email,City,KupatHolim,PersonId,FirstName,LastName,Phone,FoodPreference) VALUES (?,?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,email);
			preparedStatement.setString(2, city);
			preparedStatement.setString(3, k);
			preparedStatement.setInt(4, Integer.parseInt(id));
			preparedStatement.setString(5, first);
			preparedStatement.setString(6, last);
			preparedStatement.setInt(7, Integer.parseInt(phone));
			preparedStatement.setString(8, food);

			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				System.out.println("A row has been inserted successfully.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	public boolean stayIn(String id,int hotel,String room){
		  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		  LocalDateTime now = LocalDateTime.now();
		try (Connection connection = DriverManager.getConnection(databaseURL)) {
			String sql =
					"INSERT INTO StayIn (PersonID,HotelID,RoomNum,FromDate,ToDate) VALUES (?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, Integer.parseInt(id));
			preparedStatement.setInt(2, hotel);
			preparedStatement.setInt(3, Integer.parseInt(room));
			preparedStatement.setString(4, dtf.format(now));
			preparedStatement.setString(5, "01/08/2021");


			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				System.out.println("A row has been inserted successfully.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	public boolean addIsRelated(int id1,String id2,String Relation){
		  
		try (Connection connection = DriverManager.getConnection(databaseURL)) {
			String sql =
					"INSERT INTO isRelated (PersonID1,PersonID2,RelationType) VALUES (?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id1);
			preparedStatement.setInt(2, Integer.parseInt(id2));
			preparedStatement.setString(3, Relation);

			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				System.out.println("A row has been inserted successfully.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	public boolean addPerson(String id,String first,String last,String phone,String food){
		  
		try (Connection connection = DriverManager.getConnection(databaseURL)) {
			String sql =
					"INSERT INTO Person (PersonID,FirstName,LastName,Phone,FoodPreference) VALUES (?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, Integer.parseInt(id));
			preparedStatement.setString(2, first);
			preparedStatement.setString(3, last);
			preparedStatement.setInt(4, Integer.parseInt(phone));
			preparedStatement.setString(5, food);

			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				System.out.println("A row has been inserted successfully.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	public boolean updTested(String id1,String testID,String testTime,String nurse){
		  
		try (Connection connection = DriverManager.getConnection(databaseURL)) {
			String sql = "Update Tested SET TestBoardID = ? , TestTime = ?  where PersonID = ? AND NurseID = ? AND TestBoardID = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, Integer.parseInt(testID));
			preparedStatement.setString(2, testTime);
			preparedStatement.setInt(3, Integer.parseInt(id1));
			preparedStatement.setInt(4, Integer.parseInt(nurse));
			preparedStatement.setInt(5, 0);

			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				System.out.println("A row has been inserted successfully.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}
	public boolean addTested(String id1,int nurse,String testTime){
		  
		try (Connection connection = DriverManager.getConnection(databaseURL)) {
			String sql =
					"INSERT INTO Tested (PersonID,NurseID,TestTime) VALUES (?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, Integer.parseInt(id1));
			preparedStatement.setInt(2, nurse);
			preparedStatement.setString(3, testTime);


			int row = preparedStatement.executeUpdate();
			if (row > 0) {
				System.out.println("A row has been inserted successfully.");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return false;
	}
}
