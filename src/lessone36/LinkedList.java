package lessone36;


public class LinkedList<T> {
	public LinkedListNode<T> front;
	
	public LinkedList() {
		front = null;
	}
	
	/**
	 * add the integer v to the front of the list ..
	 * @param v
	 */
	public void add(T v) {
		LinkedListNode<T> n = new LinkedListNode<T>(v);
		n.next = this.front;
		this.front = n;
	}
	
	public void deleteFirst() {
		this.front = this.front.next;
	}
	
	public void addAfter(LinkedListNode<T> a, T v) {
		LinkedListNode<T> n = new LinkedListNode<T>(v);
		n.next = a.next;
		a.next = n;
	}
	
	/**
	 * iterate through the list and create a string of form "[1,5,2,6,3]"
	 */
	public String toString() {
		String s = "[";
		LinkedListNode<T> n = this.front;
		if (n==null) {
			return "[]";
		}
		while (n.next != null) {
			s += n.val+", ";
			n = n.next;
		}
		return s + n.val+"]";
	}

}

