package utils;


public class LinkedListNode {
	//ref: https://github.com/careercup/ctci/blob/master/java/CtCILibrary/CtCILibrary/LinkedListNode.java
		public LinkedListNode next;
		public LinkedListNode prev;
		public LinkedListNode last;
		public int data;
		public LinkedListNode(int d, LinkedListNode n, LinkedListNode p) {
			data = d;
			setNext(n);
			setPrevious(p);
		}
		

		public LinkedListNode() {
			// TODO Auto-generated constructor stub
		}


		public LinkedListNode(int d) {
			// TODO Auto-generated constructor stub
			data = d;
		}


		public void setNext(LinkedListNode n) {
			next = n;
			if (this == last) {
				last = n;
			}
			if (n != null && n.prev != this) {
				n.setPrevious(this);
			}
		}
		
		public void setPrevious(LinkedListNode p) {
			prev = p;
			if (p != null && p.next != this) {
				p.setNext(this);
			}
		}	
		
		public String printForward() {
			if (next != null) {
				return data + "->" + next.printForward();
			} else {
				return ((Integer) data).toString();
			}
		}
		
		public LinkedListNode clone() {
			LinkedListNode next2 = null;
			if (next != null) {
				next2 = next.clone();
			}
			LinkedListNode head2 = new LinkedListNode(data, next2, null);
			return head2;
		}

}
