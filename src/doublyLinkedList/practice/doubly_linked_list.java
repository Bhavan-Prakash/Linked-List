package doublyLinkedList.practice;

public class doubly_linked_list {

    Node head;
    Node tail;
    int size = 0;

    public void insert_first(int val){
        Node na = new Node(val);
        if(head == null){
            head = na;
            tail = na;
        }else{
            na.next = head;
            na.prev = null;
            head.prev = na;
            head = na;
        }
        size++;
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int val){
            this.value = val;
        }

        public Node(int val,Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}



