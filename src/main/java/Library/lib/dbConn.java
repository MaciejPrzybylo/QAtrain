package Library.lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConn {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/mydb";
	static final String USER = "root";
	static final String PASS = "";
	static Connection conn = null;
	static Statement stmt = null;

	public static boolean accessDB() {
		boolean test = true;
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			return test = true;

		} catch (SQLException e) {
			e.printStackTrace();
			return test = false;
		}

	}

	public static void closeDb() {
		try {
			dbConn.conn.close();
		} catch (SQLException e) {
			System.out.println("nie moze zamknac");
			e.printStackTrace();
		}
	}

	public static void createUsr(int uid, String uname, String uPass, String uAdrs, int sC) {
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			System.out.println("fucked na starcie");
			e1.printStackTrace();
		}
		// String sql = "INSERT INTO user ('uid', 'uname', 'upass', 'uadrs') VALUES (" +
		// uid + "," + uname + "," + uPass + "," + uAdrs + ")";
		String sql = "INSERT INTO `user` (`uid`, `uName`, `uPass`, `uAdrs`,`sClearence`) VALUES ('" + uid + "', '"
				+ uname + "', '" + uPass + "', '" + uAdrs + "','" + sC + "' )";

		// String sql = "INSERT INTO `trainers`(`tid`, `age`, `currentCourse`, `test`)
		// VALUES (2,20,'QaAcademy',0)";
		try {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("fucked uped at adding values");
			e.printStackTrace();
		}
	}

	public static void deleteUsr(int id) {
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql4 = "DELETE FROM User " + "WHERE uId = " + id + "";
		try {
			stmt.executeUpdate(sql4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void updateUsr(int id, String name, String pass, String adrs) {
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql4 = "UPDATE `user` SET `uName`='" + name + "',`uPass`='" + pass + "',`uAdrs`='" + adrs
				+ "' WHERE `uid`= " + id + "";
		try {
			stmt.executeUpdate(sql4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void cOut(int itmid) {
		int notAvaiable = 0;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql4 = "UPDATE `item` SET `ava`='" + notAvaiable + "' WHERE `uid`= " + itmid + "";
		try {
			stmt.executeUpdate(sql4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void cIn(int itmid) {
		int avaiable = 1;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql4 = "UPDATE `item` SET `ava`='" + avaiable + "' WHERE `uid`= " + itmid + "";
		try {
			stmt.executeUpdate(sql4);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int rTable(int id) {
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql2 = "SELECT ava FROM item WHERE itmid ="+id+"";
		System.out.println(sql2);
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(rs.next()) {
			int a = rs.getInt("ava");
			System.out.println(a);
			rs.close();
			return a;
}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		return 0;

	}
	
	
	public static void updateItm(int cAva, int id,int usrid){
	try {
		stmt = conn.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String sql4 = "UPDATE `item` SET `ava`, `usrid`="+ cAva +","+ usrid +" WHERE `itmid`= " + id + "";
	try {
		stmt.executeUpdate(sql4);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
