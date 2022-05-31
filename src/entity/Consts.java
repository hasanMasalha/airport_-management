package entity;

import java.net.URLDecoder;


public final class Consts {
	private Consts() {

		throw new AssertionError(); 
	}  
 
	protected static final String DB_FILEPATH = getDBPath();
	public static final String CONN_STR = "jdbc:ucanaccess://" + DB_FILEPATH + ";COLUMNORDER=DISPLAY";
	public static final String SQL_SEL_HEAD = "SELECT * FROM HeadOfFamily";
	public static final String SQL_SEL_HOTELS = "SELECT * FROM Hotel";
	public static final String SQL_SEL_RELATED = "SELECT * FROM isRelated";
	public static final String SQL_SEL_NURSES = "SELECT * FROM Nurse";
	public static final String SQL_SEL_ROOMS = "SELECT * FROM Room";
	public static final String SQL_SEL_Scheduleds = "SELECT * FROM Scheduled";
	public static final String SQL_SEL_StayIns = "SELECT * FROM StayIn";
	public static final String SQL_SEL_Tests = "SELECT * FROM TestBoard";
	public static final String SQL_SEL_Tested = "SELECT * FROM Tested";

  
	
 
	public static String getDBPath() {
		try {
			String path = Consts.class.getProtectionDomain().getCodeSource().getLocation().getPath();
			String decoded = URLDecoder.decode(path, "UTF-8");
			// System.out.println(decoded) - Can help to check the returned path
			if (decoded.contains(".jar")) { 
				decoded = decoded.substring(0, decoded.lastIndexOf('/'));
				return decoded + "/DATA/Design_Ex4_209451202_208717025.accdb";
			} else {
				decoded = decoded.substring(0, decoded.lastIndexOf("bin/"));
				System.out.println(decoded);
				System.out.println("Hi");
				return decoded + "/Data/Data2.accdb";
			}
		} catch (Exception e) {
			e.printStackTrace(); 
			return null;
		}
	}
	
}
