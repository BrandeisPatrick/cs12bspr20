package lesson35;

public class LinkedListIntPtr {
	LinkedListInt front;
	
	public LinkedListIntPtr() {
		front = null;
	}
	
	/**
	 * add the integer v to the front of the list ..
	 * @param v
	 */
	public void add(int v) {
		LinkedListInt n = new LinkedListInt(v);
		n.next = this.front;
		this.front = n;
	}
	
	public void deleteFirst() {
		this.front = this.front.next;
	}
	
	public void addAfter(LinkedListInt a, int v) {
		LinkedListInt n = new LinkedListInt(v);
		n.next = a.next;
		a.next = n;
	}
	
	/**
	 * iterate through the list and create a string of form "[1,5,2,6,3]"
	 */
	public String toString() {
		return "";
	}

}
