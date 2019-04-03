package Library.lib;

public class App 
{
    public static void main( String[] args )
    {
    	dbConn.accessDB();
    	
    	Person me = new Person (10,"Mac", "haslo", "some stret");
    	me.checkOut(1, 10);
    	//dbConn.updateUsr(1, "Maciej", "pass", "zieolona 1");
    	dbConn.closeDb();
    
    }
}
