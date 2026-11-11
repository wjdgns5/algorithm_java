package _2st_week;

public class _02_02_append_linked_list {
	
	public static class Node {
		
		 int data; // 값 
	     Node next; // 다음값의 주소?

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	} // end of class Node
	
	
	public static class LinkedList {
		
		 Node head; // Node 타입의 head 정의

		public LinkedList(int value) {
			this.head = new Node(value);
		}
		
		public void append(int value) {
			Node current = this.head;
			
			while(current.next != null) {
				current = current.next;
			}
			
			current.next = new Node(value);
		} // end of append()
		
		public void print_all() {
			
			Node current = this.head;
			
			while(current.next != null) {
				System.out.print(current.data+" ");
				current = current.next;
			}
		} // end of linked_all()
		
	} // end of class LinkedList

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list_array = new LinkedList(3);
		list_array.append(6);
		list_array.append(9);
		list_array.append(12);
		list_array.append(15);
		
		list_array.print_all();
	} // end of main

} // end of class _02_02_append_linked_list
