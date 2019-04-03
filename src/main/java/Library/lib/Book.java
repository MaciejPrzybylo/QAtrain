package Library.lib;

public class Book extends Item {
private int ava;
	
public Book(int id, int ava) {
		super(id);
		boolean i = false;
		while (i == false) {

			if (ava == 1 || ava == 0) {
			this.ava=ava;	
				i = true;
			} else {
				i=true;
			}
		}
	}

@Override
public void checkOut() {
	// TODO Auto-generated method stub
	
}

@Override
public void checkIn() {
	// TODO Auto-generated method stub
	
}


}
