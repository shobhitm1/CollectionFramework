package Collections;

//Outer_Demo outer = new Outer_Demo();
//Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
public class LinkedListConcept {
	Node head;
	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
		
		
	}
	public void printMyLinkedList() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.next;
		}
	}
	
	
	public static void main(String[] args) {
		LinkedListConcept ll = new LinkedListConcept();
		LinkedListConcept.Node first = ll.new Node(11);
		ll.head=first;
		
		Node second = ll.new Node(12);
		first.next=second;
		
		Node third = ll.new Node(13);
		second.next=third;
		
		ll.printMyLinkedList();

	}

}
