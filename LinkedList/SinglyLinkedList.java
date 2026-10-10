import java.util.*;

public class SinglyLinkedList {
   
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    private Node head;
    private Node tail;
    private int size;
    // constructor
    public SinglyLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }    
    // inser At the node at head
    public void insertAtHead(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else{
            newNode.next=head;
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
            tail=newNode;
        }
        size++;
    }
    // insert At the node at any position
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
        Node prev=head;
        for(int i=1; i<position-1;i++){
            prev=prev.next;
        }
        newNode.next = prev.next;
        prev.next=newNode;

        size++;
    }
    //Traverse the linked list
    public void printLinkedList(){
       Node current=head;
       while(current!=null){
        System.out.print(current.data+" -> ");
        current=current.next;
       }
        System.out.println("null");           
    }
    // Size of the linked list
    public int getSize(){
        return size;
    }
    // Check if the linked list is empty
    public boolean isEmpty(){
        return (size==0 || head==null || tail==null);
    }
    //Header of the linked list
    public int getHead(){
        if(head==null){
            System.out.println("Linked list is empty");
            return -1;
        }
        else{
            return head.data;
        }
    }
    //tail of the linked list
    public int getTail(){
        if(tail==null){
            System.out.println("Linked list is empty");
            return -1;
        }
        else{
            return tail.data;
        }
    }
    //clear the linked list
    public void clear(){
        head=null;
        tail=null;
        size=0;
    }
    //Search for a node in the linked list
    public boolean Search(int data){
        Node current=head;
        while(current!=null){
            if(current.data==data){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    //find the position of a node in the linked list
    public int findPosition(int data){
        Node current=head;
        int position=1;
        while(current!=null){
            if(current.data==data){
                return position;
            }
            current=current.next;
            position++;
        }
        return -1;
    }

    //update the value of a node at a specific position in the linked list
    public void updateAtPosition(int newData,int position){
        if(position<1 || position>size){
            System.out.println("Invalid position");
            return;
        }
        Node current=head;
        for(int i=1; i<position;i++){
            current=current.next;
        }
        current.data=newData;
    }

    public void updateAtValue(int oldData,int newData){
        Node current=head;
        while(current!=null){
            //only first occurrence of the value will be updated
            if(current.data==oldData){
                current.data=newData;
                return;
            }
            current=current.next;
        }
        System.out.println("Value not found in the linked list");
    }
    
    //Delete at the head of the linked list
    public void deleteAtHead(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
       head = head.next;
       size--;

       if(head==null){
        tail=null;
       }
    }

    //Delete at the tail of the linked list
    public void deleteAtTail(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            size--;
            return;
        }
        Node current=head;
        while(current.next!=tail){
            current=current.next;
        }
        current.next=null;
        tail=current;
        size--;
    }    

    //Delete at a specific position in the linked list
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

        Node prev=head;
        for(int i=1; i<= position-2; i++){
            prev=prev.next;
        }

        Node current= prev.next;
       
        Node forward=current.next;

        prev.next=forward;
        current.next=null;
        size--;

    }
    
    //Delete a node with a specific value in the linked list
    public boolean  deleteValue(int data){
        if(head==null){
            System.out.println("Linked list is empty");
            return false;
        }

        if(head.data==data){
            deleteAtHead();
            return true;
        }

        Node prev=head;
        Node current=head.next;

        while(current!=null){
            if(current.data==data){
                Node forward=current.next;
                prev.next=forward;

                current.next=null;

                if(tail==current){
                    tail=prev;
                }
                size--;
                return true;
            }
            else{
                prev=current;
                current=current.next;
            }
            
        }
        System.out.println("Value not found in the linked list");
        return false;
    }

    // Main method to test the linked list implementation
    public static void main(String[] args){
        SinglyLinkedList list=new SinglyLinkedList();
        list.insertAtHead(10);
        list.insertAtHead(5);
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtPosition(15,2);
        list.printLinkedList();
        System.out.println("Size of the linked list: " + list.getSize());
        System.out.println("Is the linked list empty? " + list.isEmpty());
        System.out.println("Head of the linked list: " + list.getHead());
        System.out.println("Tail of the linked list: " + list.getTail());
        
        // list.clear();
        // System.out.println("After clearing the linked list:");
        // list.printLinkedList();

        System.out.println("Search for 15: " + list.Search(15));
        System.out.println("Position of 15: " + list.findPosition(15));

        list.updateAtPosition(25, 3);
        list.printLinkedList();

        list.updateAtValue(20, 35);
        list.printLinkedList();

        list.deleteAtHead();
        list.deleteAtTail();
        list.printLinkedList();

        list.deleteAtPosition(2);
        list.printLinkedList();

        list.deleteValue(15); // Valid value
        list.printLinkedList();

        list.deleteValue(100); // Invalid value
        list.printLinkedList();
    } 
}