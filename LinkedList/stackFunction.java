
class StackFunction {

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node top;
    int size = 0;

    // 1. Push: Insert element
    void push(int data) {
        Node newNode = new Node(data);

        newNode.next = top;
        top = newNode;
        size++;

        System.out.println(data + " pushed");
    }

    // 2. Pop: Remove top element
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int removed = top.data;
        top = top.next;
        size--;

        return removed;
    }

    // 3. Peek: Return top element
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    // 4. Check whether stack is empty
    boolean isEmpty() {
        return top == null;
    }

    // 5. Return stack size
    int size() {
        return size;
    }

    // 6. Display all elements
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // 7. Search element
    boolean search(int key) {
        Node temp = top;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }

    // Main function
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Top: " + st.peek());
        System.out.println("Popped: " + st.pop());
        System.out.println("Size: " + st.size());
        System.out.println("Is Empty: " + st.isEmpty());
        System.out.println("Search 10: " + st.search(10));

        st.display();
    }
}
