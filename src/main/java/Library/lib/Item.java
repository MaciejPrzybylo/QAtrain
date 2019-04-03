package Library.lib;

abstract public class Item {
	private int id;

	public Item(int id) {
		this.id = id;
	}
abstract public void checkOut();
abstract public void checkIn();


}