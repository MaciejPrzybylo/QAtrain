package Library.lib;

public class Staff extends User {
private int sClereance;
	public Staff(int uid, String uPass, String uName, String uAdrs, int sC) {
		super(uid, uPass, uName, uAdrs, sC);
		this.setsClereance(sC);
		// TODO Auto-generated constructor stub
	}
	public int getsClereance() {
		return sClereance;
	}
	public void setsClereance(int sClereance) {
		this.sClereance = sClereance;
	}
	public void checkOut(int id) {
		dbConn.cOut(id);
		
	}
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
	}
	public void checkOut() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkOut(int id, int usrid) {
		// TODO Auto-generated method stub
		
	}

}
