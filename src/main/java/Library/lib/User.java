package Library.lib;

public abstract class User {
private int uId;
private String uPass;
public String uName;
public String uAdrs;

 public User(int uid, String uPass, String uName, String uAdrs, int sC) {
	 dbConn.createUsr(uid, uName, uPass, uAdrs, sC);
};
abstract public void checkOut(int id, int usrid);
abstract public void checkIn();

}
