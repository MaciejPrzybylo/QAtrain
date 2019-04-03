package Library.lib;

public class cInter implements CheckInter{
	public void checkIn(int id, int usrid) {
		if(dbConn.rTable(id)==1){
			int cAva =0;
		dbConn.updateItm(cAva, id, usrid);
		}
		else
		System.out.println("there is no such item");
	}
	
	public void checkOut(int id, int usrid) {
		if(dbConn.rTable(id)==0){
			int cAva =1;
		dbConn.updateItm(cAva, id, usrid);
		}else if (dbConn.rTable(id)==1) {
		System.out.println("item taken");
		}
		else
		System.out.println("there is no such item");
	}


}
