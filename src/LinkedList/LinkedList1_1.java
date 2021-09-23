package LinkedList;

public class LinkedList1_1 {
	public static void main() {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.addAtHead(1);
		myLinkedList.addAtTail(3);
		myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
		myLinkedList.get(1);              // return 2
		myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
		myLinkedList.get(1);              // return 3
	}
}

class MyLinkedList {
	private Node head;
	private Node tail;
	private int count;
	
    /** Initialize your data structure here. */
    public MyLinkedList() {
    	head = new Node(-1);
    	tail = new Node(-1);
    	head.next = tail;
    	tail.prev = head;
    	count = 0;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
    	if(index<0 || index>=count)
    		return -1;
    	int idx = 0;
    	
    	Node findNode = head.next;
    	
    	while(idx<index) {
    		findNode = findNode.next;
    		idx++;
    	}
    	return findNode.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        head.next.prev = newNode;
        newNode.next = head.next;
        head.next=newNode;
        newNode.prev=head;
        count ++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        tail.prev.next=newNode;
        newNode.prev=tail.prev;
        newNode.next=tail;
        tail.prev=newNode;
        count ++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
    	
    	if (index<0 || index>count)
    		return;
    	
    	if(index==0) {
    		addAtHead(val);
    	}
    	else if(index==count) {
    		addAtTail(val);
    	}
    	else{
        	Node findNode = head;
        	int idx = 0;
        	while(idx<index) {
        		findNode = findNode.next;
        		idx++;
        	}
        	Node newNode = new Node(val);
        	newNode.prev = findNode;
        	newNode.next = findNode.next;
        	findNode.next.prev = newNode;
        	findNode.next = newNode;
        	count ++;
    	}
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
    	if (index<0 || index>=count)
    		return;
    	Node findNode = head;
    	int idx = 0;
    	while(idx<index) {
    		findNode = findNode.next;
    		idx++;
    	}
    	Node nextNode = findNode.next.next;
    	findNode.next = nextNode;
    	nextNode.prev = findNode;
    	count --;
    }
}

class Node{
	public int val;
	public Node next;
	public Node prev;
	
	public Node(int val) {
		this.val = val;
		this.next = null;
		this.prev = null;
	}
}