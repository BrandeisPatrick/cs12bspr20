package lesson35;

import lessone36.LinkedList;
import lessone36.LinkedListNode;

public class LinkedListInt {
	
	public static void main(String[] args) {
		LinkedListInt list = new LinkedListInt();
		list.add(1);
		list.add(3);
		list.add(5);
		System.out.println("list="+list);
		LinkedListIntNode n = list.front;
		while (n != null) {
			System.out.println(n.val);
			n = n.next;
		}	
	}
	
	public LinkedListIntNode front;
	
	public LinkedListInt() {
		front = null;
	}
	
	/**
	 * add the integer v to the front of the list ..
	 * @param v
	 */
	public void add(int v) {
		LinkedListIntNode n = new LinkedListIntNode(v);
		n.next = this.front;
		this.front = n;
	}
	
	public void deleteFirst() {
		this.front = this.front.next;
	}
	
	public void addAfter(LinkedListIntNode a, int v) {
		LinkedListIntNode n = new LinkedListIntNode(v);
		n.next = a.next;
		a.next = n;
	}
	
	/**
	 * iterate through the list and create a string of form "[1,5,2,6,3]"
	 */
	public String toString() {
		String s = "[";
		LinkedListIntNode n = this.front;
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

class LinkedListIntNode {
	public int val;
	public LinkedListIntNode next;
	
	public LinkedListIntNode(int val) {
		this.val=val;
		this.next = null;
	}
	
}
