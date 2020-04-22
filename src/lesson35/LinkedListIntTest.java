package lesson35;

import lessone36.LinkedList;
import lessone36.LinkedListNode;


public class LinkedListIntTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(3);
		list.add(5);
		System.out.println("list="+list);
		LinkedListNode<Integer> n = list.front;
		while (n != null) {
			System.out.println(n.val);
			n = n.next;
		}	

	}

}
