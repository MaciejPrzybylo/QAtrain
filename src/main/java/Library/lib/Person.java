package Library.lib;

public class Person extends User {

	public Person(int uid, String uPass, String uName, String uAdrs) {
		super(uid, uPass, uName, uAdrs, uid);
		// TODO Auto-generated constructor stub
	}

	public void checkOut(int id, int usrid) {
		if(dbConn.rTable(id)==0){
			int cAva =1;
		dbConn.updateItm(cAva, id, usrid);
		}else if (dbConn.rTable(id)==1) {
		System.out.println("item taken");
		}
		System.out.println("there is no such item");
	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		
	}


}
