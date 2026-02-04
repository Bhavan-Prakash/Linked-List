package singlyLinkedList.practice;

public class singly_linked_list {
    //this class represents the whole linked list

    private Node head;
    private Node tail;

    private int size;

    public singly_linked_list(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }

        size++;
    }

    public void insert_last(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node obj = new Node(val);
        tail.next = obj;
        tail = obj;
        size++;
    }

    public void insert_atRandom(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insert_last(val);
            return;
        }
        Node temp = head;
        for(int i =1; i<index;i++){
            temp  = temp.next;
        }
        Node obj = new Node(val, temp.next);
        temp.next = obj;

        size++;
    }

    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    //the below class is inside the main class because we dont want anyone access it seperately, we want to access above class

    private class Node{
        private int value;
        private Node next;

        //this constructor is used when we want to assign value to the node but we yet we dont want to link it now
        public Node(int value){
            this.value = value;
        }

        //this constructor is used to assign the value to the node and also link it to the next node
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args){
        singly_linked_list obj = new singly_linked_list();

        obj.insertFirst(10);
        obj.insertFirst(2);
        obj.insertFirst(1);
        obj.insertFirst(9);
        obj.insertFirst(7);
        obj.insert_last(76);
        obj.insert_atRandom(6,2);

        obj.display();

    }

}
