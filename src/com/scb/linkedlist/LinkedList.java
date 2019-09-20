package com.scb.linkedlist;

public class LinkedList {
	
	static Node head;
	
 static	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
 
 static void insertAtMid(int x) 
 { 
     // if list is empty 
     if (head == null) 
         head = new Node(x); 
     else { 
         // get a new node 
         Node newNode = new Node(x); 

         Node temp = head; 
         int len = 0; 

         // calculate length of the linked list 
         //, i.e, the number of nodes 
         while (temp != null) { 
             len++; 
             temp = temp.next; 
         } 

         // 'count' the number of nodes after which 
         // the new node is to be inserted 
         int count = ((len % 2) == 0) ? (len / 2) : 
                                     (len + 1) / 2; 
         temp = head; 

         // 'temp' points to the node after which  
         // the new node is to be inserted 
         while (count-- > 1) 
             temp = temp.next; 

         // insert the 'newNode' and adjust  
         // the required links 
         newNode.next = temp.next; 
         temp.next = newNode; 
     } 
 } 

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		Node forth = new Node(40);
		Node sixth = new Node(50);
		list.head.next = second;
		second.next=third;
		third.next=forth;
		forth.next=sixth;
	 insertAtMid(57); 
		list.printList();
		
	}
	
	public  void printList() {
		Node node = head;
		while (node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}
