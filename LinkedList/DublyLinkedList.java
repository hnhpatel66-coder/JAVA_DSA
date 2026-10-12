import java.util.*;

public class DublyLinkedList {
    
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    private Node head;
    private Node tail;
    private int size;
    // constructor
    public DublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    //insert At the node at head
    public void insertAtHead(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }

    // insert At the node at tail
    public void insertAtTail(int data){
        Node newNode= new Node(data);
        if(head==null && tail==null){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        size++;
    }

    //print the linked list
    public void printLinkedList(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ->");
            current=current.next;
        }
        System.out.println();
    }

    //forward traversal
    public void forwardTraversal(){
        Node current=tail;
        while(current!=null){
            System.out.print("<- " + current.data);
            current=current.prev;
        }
        System.out.println();
    }
    //insertat at any position
    public void insertAtPosition(int data,int position){
        Node newNode=new Node(data);
        
        if(position<1 || position>size+1){
            System.out.println("Invalid position");
            return;
        }
        if(position==1){
            insertAtHead(data);
            return;
        }
        if(position==size+1){
            insertAtTail(data);
            return;
        }
        Node temp=head;
        for(int i=1; i<position-1;i++){
            temp=temp.next;
        }
        Node prevNode = temp;
        Node nextNode = temp.next;
        Node currentNode = new Node(data);

        currentNode.prev = prevNode;
        prevNode.next = currentNode;
        currentNode.next= nextNode;
        nextNode.prev= currentNode;
        size++;
    }

    //Search element in the linked list
    public boolean search(int target){
        if(head==null){
            System.out.println("List is empty");
            return false;
        }
        Node current=head;
        while(current!=null){
            if(current.data==target){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    //updete the value of a node
    public void update(int oldValue,int newValue){
        if(head==null && tail==null){
            System.out.println("List is empty");
            return;
        }

        Node current=head;
        while(current!=null){
            if(current.data==oldValue){
                current.data=newValue;
                return;
            }
            current=current.next;
        }
        System.out.println("Value not found");
    }

    //delete a node at head
    public void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        
        if(head==tail){
            head=null;
            tail=null;
            size=0;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }

    //delete a node at tail
    public void deleteAtTail(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            size=0;
            return;
        }
        tail=tail.prev;
        tail.next=null;
        size--;
    }

    //delete a node at any position
    public void deleteAtPosition(int position){
        if(position<1 || position>size){
            System.out.println("Invalid position");
            return;
        }
        if(position==1){
            deleteAtHead();
            return;
        }
        if(position==size){
            deleteAtTail();
            return;
        }
        
        Node current=head;
        for(int i=1;i<position;i++){
            current=current.next;
        }
        Node prevNode=current.prev;
        Node nextNode=current.next;

        prevNode.next=nextNode;
        nextNode.prev=prevNode;
        current.next=null;
        current.prev=null;
        size--;
    }
    public static void main(String[] args) {

        DublyLinkedList list=new DublyLinkedList();

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtTail(30);
        list.insertAtTail(40);

        list.printLinkedList();
        list.forwardTraversal();

        list.insertAtPosition(25,3);
        list.printLinkedList();

        System.out.println("Search 30: " + list.search(30)); // true

        list.update(40, 35);
        list.printLinkedList();

        list.deleteAtHead();
        list.printLinkedList();

        list.deleteAtTail();
        list.printLinkedList();

        list.deleteAtPosition(2);
        list.printLinkedList();
    }
}
